package com.mundojava.proyectoseminariout.infraccion;

import com.mundojava.proyectoseminariout.conexion.Conexion;
import com.mundojava.proyectoseminariout.dao.Dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class InfraccionDAO implements Dao<InfraccionDTO> {

    private Conexion conexion;

    public InfraccionDAO() {
        conexion = new Conexion();
        conexion.conectar();
    }

    @Override
    public List<InfraccionDTO> listar() {
        return generarLista(InfraccionLiterales.SQL_LISTAR.getDato());
    }

    private List<InfraccionDTO> generarLista(String cadeSQL) {
        List<InfraccionDTO> lista = new ArrayList<>();
        ResultSet rs = conexion.consultar(cadeSQL);

        try {

            if (rs != null) {
                while (rs.next()) {
                    InfraccionDTO dto = new InfraccionDTO();
                    dto.setAgenteId(rs.getInt(InfraccionLiterales.CAMPO_AGENTE_ID.getDato()));
                    dto.setConductorId(rs.getInt(InfraccionLiterales.CAMPO_CONDUCTOR_ID.getDato()));
                    dto.setEstadoId(rs.getInt(InfraccionLiterales.CAMPO_ESTADO_ID.getDato()));
                    dto.setFecha(rs.getString(InfraccionLiterales.CAMPO_FECHA.getDato()));
                    dto.setId(rs.getInt(InfraccionLiterales.CAMPO_ID.getDato()));
                    dto.setTipoInfraccionId(rs.getInt(InfraccionLiterales.CAMPO_TIPO_INFRACCION_ID.getDato()));
                    dto.setVehiculoId(rs.getInt(InfraccionLiterales.CAMPO_VEHICULO_ID.getDato()));
                    lista.add(dto);
                }
            }

        } catch (SQLException ex) {
            System.out.println("Error en la consulta " + ex.getMessage());
        } finally {
            return lista;
        }
    }

    @Override
    public InfraccionDTO consultarPorId(int id) {
        String cadeSQL = InfraccionLiterales.SQL_CONSULTA_POR_ID.getDato()
                .replace("?", String.valueOf(id));
        List<InfraccionDTO> res = generarLista(cadeSQL);
        
        if (res.size() > 0) {
            return res.get(0);
        } else {
            return new InfraccionDTO();
        }
    }

    @Override
    public int adicionar(InfraccionDTO obj) {
        return 0;
    }

    @Override
    public int modificar(int id, InfraccionDTO nuevoDato) {
        return 0;
    }

    @Override
    public int eliminar(int id) {
        return 0;
    }

}
