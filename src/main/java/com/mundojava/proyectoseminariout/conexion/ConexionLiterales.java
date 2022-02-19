package com.mundojava.proyectoseminariout.conexion;

public enum ConexionLiterales {
    DRIVER_MYSQL("com.mysql.cj.jdbc.Driver"),
    CONEXION_BD_URL("jdbc:mysql://localhost:3306/seminario_db"),
    CONEXION_BD_USER("root"),
    CONEXION_BD_PASSWORD();

    private final String dato;

    private ConexionLiterales(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }
}
