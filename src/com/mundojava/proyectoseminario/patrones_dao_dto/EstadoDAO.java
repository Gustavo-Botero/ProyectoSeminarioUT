package com.mundojava.proyectoseminario.patrones_dao_dto;

import java.util.List;

public interface EstadoDAO {
    
    public EstadoDTO consultarPorId(int id);
    
    public List<EstadoDTO> listarTodo();
    
    public void adicionar(EstadoDTO estadoDTO);
    
    public void modificar(EstadoDTO estadoDTO);
    
    public void eliminar(int id);
}
