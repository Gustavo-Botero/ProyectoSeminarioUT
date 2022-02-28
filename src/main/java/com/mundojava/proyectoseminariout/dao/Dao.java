package com.mundojava.proyectoseminariout.dao;

import java.util.List;

public interface Dao<T> {

    List<T> listar();

    T consultarPorId(int id);
    
    int adicionar(T obj);
    
    int modificar(int id, T nuevoDato);
    
    int eliminar(int id);
}
