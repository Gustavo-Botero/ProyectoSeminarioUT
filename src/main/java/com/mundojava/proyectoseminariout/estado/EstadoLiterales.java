package com.mundojava.proyectoseminariout.estado;

public enum EstadoLiterales {
    SQL_LISTAR("SELECT * FROM estado"),
    SQL_CONSULTA_POR_ID("SELECT * FROM estado WHERE id = ?"),
    SQL_CONSULTA_POR_NOMBRE("SELECT * FROM estado WHERE estado LIKE '%?%'"),
    SQL_INSERTAR("INSERT INTO estado (estado, seProcesa) VALUES ('?1', '?2')"),
    SQL_ELIMINAR("DELETE FROM estado WHERE id = ?"),
    SQL_MODIFICAR("UPDATE estado SET estado = '?1', seProcesa = '?2' WHERE id = ?3"),
    CAMPO_ID("id"),
    CAMPO_ESTADO("estado");

    private final String dato;

    private EstadoLiterales(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }
}
