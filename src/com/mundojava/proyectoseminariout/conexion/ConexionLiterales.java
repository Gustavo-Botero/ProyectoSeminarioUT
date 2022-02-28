package com.mundojava.proyectoseminariout.conexion;

public enum ConexionLiterales {
    DRIVER_MYSQL("com.mysql.cj.jdbc.Driver"),
    CONEXION_BD_URL("jdbc:mysql://localhost:3306/seminario_db"),
    CONEXION_BD_USER("root"),
    CONEXION_BD_PASSWORD("GustavoB92"),
    ERR_DRIVER_DB("Error cargando driver de base de datos: "),
    ERR_OPERACION_DB("Error ejecutando operacion en base de datos: "),
    ERR_SENTENCIA_SQL("Error en sentencia SQL "),
    ERR_DESCONECTADO_DB("Error desconectando la base de datos: ");

    private final String dato;

    private ConexionLiterales(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }
}
