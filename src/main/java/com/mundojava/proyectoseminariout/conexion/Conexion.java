package com.mundojava.proyectoseminariout.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {
    
    private Connection conexion;
    private Statement st;
    public Conexion() {
    }
    
    public void conectar(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306",
                    "root",
                    "GustavoB92"
            );
            
            st = conexion.createStatement();
            //System.out.println("Conexión OK");
        } catch (ClassNotFoundException ex) {
            System.out.println("Error cargando driver de base de datos: " + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println("Error ejecutando operacion en base de datos: " + ex.getMessage());
        }
    }
    
    public ResultSet consultar(String cadeSQL) {
        ResultSet rs = null;
        try {
            rs = st.executeQuery(cadeSQL);
        } catch (SQLException ex) {
            System.out.println("Error ejecutando sentencia SQL " + cadeSQL + ": " + ex.getMessage());
        } finally {
            return rs;
        }
    }
    
    public void desconectar(){
        try {
            if(st != null) st.close();
            if(conexion != null) conexion.close();
            
            System.out.println("Desconectado de la base de datos");
        } catch (SQLException ex) {
            System.out.println("Error desconectando la base de datos: " + ex.getMessage());
        }
    }
}
