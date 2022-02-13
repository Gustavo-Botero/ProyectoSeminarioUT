package com.mundojava.proyectoseminario.patrones_dao_dto;

import java.util.HashMap;

public class DataSourceFake {
    private HashMap<Integer, EstadoDTO> estados;

    public DataSourceFake() {
        EstadoDTO estado1 = new EstadoDTO(1, "No pago", true);
        EstadoDTO estado2 = new EstadoDTO(2, "Si pago", false);
        
        this.estados = new HashMap<>();
        this.estados.put(estado1.getId(), estado1);
        this.estados.put(estado2.getId(), estado2);
    }

    public HashMap<Integer, EstadoDTO> getEstados() {
        return estados;
    }
}
