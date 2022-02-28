package com.mundojava.proyectoseminariout.estado;

import com.mundojava.proyectoseminariout.conexion.Conexion;
import com.mundojava.proyectoseminariout.dao.Dao;
import com.mundojava.proyectoseminariout.dao.PorNombre;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EstadoDAO implements Dao<EstadoDTO>, PorNombre<EstadoDTO> {

    private Conexion conexion;

    public EstadoDAO() {
        conexion = new Conexion();
        conexion.conectar();
    }

    @Override
    public List<EstadoDTO> listar() {
        return generarLista(EstadoLiterales.SQL_LISTAR.getDato());
    }

    private List<EstadoDTO> generarLista(String cadeSQL) {
        ResultSet rs = conexion.consultar(cadeSQL);
        List<EstadoDTO> lista = new ArrayList<>();

        try {
            if (rs != null) {
                while (rs.next()) {
                    EstadoDTO dto = new EstadoDTO();
                    dto.setId(rs.getInt(EstadoLiterales.CAMPO_ID.getDato()));
                    dto.setEstado(rs.getString(EstadoLiterales.CAMPO_ESTADO.getDato()));
                    lista.add(dto);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error en consulta: " + ex.getMessage());

        } finally {
            return lista;
        }
    }

    @Override
    public List<EstadoDTO> consultarPorNombre(String nombre) {

        String cadeSQL = EstadoLiterales.SQL_CONSULTA_POR_NOMBRE.getDato().replace("?", nombre.toUpperCase());
        return generarLista(cadeSQL);

    }

    @Override
    public EstadoDTO consultarPorId(int id) {
        String cadeSQL = EstadoLiterales.SQL_CONSULTA_POR_ID.getDato().replace("?", String.valueOf(id));
        List<EstadoDTO> res = generarLista(cadeSQL);

        if (res.size() > 0) {
            return res.get(0);
        } else {
            return new EstadoDTO();
        }
    }

    @Override
    public int adicionar(EstadoDTO obj) {
        String cadeSQL = EstadoLiterales.SQL_INSERTAR.getDato()
                .replace("?1", obj.getEstado().toUpperCase())
                .replace("?2", String.valueOf(obj.getSeProcesa()));
        return conexion.actualizar(cadeSQL);
    }

    @Override
    public int modificar(int id, EstadoDTO nuevoDato) {
        if (nuevoDato == null || nuevoDato.getEstado() == null || nuevoDato.getEstado().trim().length() == 0) {
            return 0;
        }
        
        String cadeSQL = EstadoLiterales.SQL_MODIFICAR.getDato()
                .replace("?1", nuevoDato.getEstado().toUpperCase())
                .replace("?2", String.valueOf(nuevoDato.getSeProcesa()))
                .replace("?3", String.valueOf(id));
        
        return conexion.actualizar(cadeSQL);
    }
    
    @Override
    public int eliminar(int id) {
        String cadeSQL = EstadoLiterales.SQL_ELIMINAR.getDato().replace("?", String.valueOf(id));
        return conexion.actualizar(cadeSQL);
    }
}
