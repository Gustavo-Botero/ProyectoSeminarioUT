package com.mundojava.proyectoseminariout.dao;

import java.util.List;

public interface PorNombre <T> {
    List<T> consultarPorNombre(String nombre);
}
