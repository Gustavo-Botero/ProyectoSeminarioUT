package com.mundojava.proyectoseminario.patrones_dao_dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class EstadoDAOImplementacion implements EstadoDAO {

    private DataSourceFake ds;
    private HashMap<Integer, EstadoDTO> estados;

    public EstadoDAOImplementacion() {
        ds = new DataSourceFake();
        this.estados = ds.getEstados();
    }

    @Override
    public EstadoDTO consultarPorId(int id) {
        if(this.estados.containsKey(id)) {
            return this.estados.get(id);
        } else {
            return new EstadoDTO();
        }
    }

    @Override
    public List<EstadoDTO> listarTodo() {
        List<EstadoDTO> datos = new ArrayList<EstadoDTO>(estados.values());
        return datos;
    }

    @Override
    public void adicionar(EstadoDTO estadoDTO) {
        if(!estados.keySet().contains(estadoDTO.getId())) {
            estados.put(estadoDTO.getId(), estadoDTO);
            System.out.println("Estado agregado al sistema");
        } else {
            System.out.println("Error, estado ya existe en el sistema");
        }
    }

    @Override
    public void modificar(EstadoDTO estadoDTO) {
        if(estados.keySet().contains(estadoDTO.getId())) {
            EstadoDTO actual = estados.get(estadoDTO.getId());
            System.out.println("Datos actuales: ");
            System.out.println(actual);
            System.out.println("Nuevos datos: ");
            System.out.println(estadoDTO);
            estados.put(estadoDTO.getId(), estadoDTO);
            System.out.println("Dato modificado correctamente");
        } else {
            System.out.println("Error, estado no existe en el sistema " + estadoDTO.getId());
        }
    }

    @Override
    public void eliminar(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
