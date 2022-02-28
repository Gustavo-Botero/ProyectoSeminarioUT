package com.mundojava.proyectoseminariout.infraccion;

public enum InfraccionLiterales {
    SQL_LISTAR("SELECT * FROM infraccion"),
    SQL_CONSULTA_POR_ID("SELECT * FROM infraccion WHERE id = ?"),
    CAMPO_ID("id"),
    CAMPO_CONDUCTOR_ID("conductor_id"),
    CAMPO_TIPO_INFRACCION_ID("tipoInfraccion_id"),
    CAMPO_VEHICULO_ID("vehiculo_id"),
    CAMPO_ESTADO_ID("estado_id"),
    CAMPO_FECHA("fecha"),
    CAMPO_AGENTE_ID("agente_id"),
    MSJ_ERROR_CONSULTA("Error en la consulta ");
    
    
    private final String dato;

    private InfraccionLiterales(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }
}
