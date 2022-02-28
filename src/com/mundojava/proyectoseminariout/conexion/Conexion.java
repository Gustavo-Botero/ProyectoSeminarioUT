package com.mundojava.proyectoseminariout.conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Conexion {

    private Connection conexion;
    private Statement st;

    public Conexion() {
    }

    public void conectar() {
        try {
            Class.forName(ConexionLiterales.DRIVER_MYSQL.getDato());
            conexion = DriverManager.getConnection(
                    ConexionLiterales.CONEXION_BD_URL.getDato(),
                    ConexionLiterales.CONEXION_BD_USER.getDato(),
                    ConexionLiterales.CONEXION_BD_PASSWORD.getDato()
            );

            st = conexion.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println(ConexionLiterales.ERR_DRIVER_DB.getDato() + ex.getMessage());
        } catch (SQLException ex) {
            System.out.println(ConexionLiterales.ERR_OPERACION_DB.getDato() + ex.getMessage());
        }
    }

    public int actualizar(String cadeSQL) {
        int res = 0;
        try {
            res = st.executeUpdate(cadeSQL);
        } catch (SQLException ex) {
            System.out.println(ConexionLiterales.ERR_SENTENCIA_SQL.getDato() + cadeSQL + ": " + ex.getMessage());
        } finally {
            return res;
        }
    }

    public ResultSet consultar(String cadeSQL) {
        ResultSet rs = null;
        try {
            rs = st.executeQuery(cadeSQL);
        } catch (SQLException ex) {
            System.out.println(ConexionLiterales.ERR_SENTENCIA_SQL.getDato() + cadeSQL + ": " + ex.getMessage());
        } finally {
            return rs;
        }
    }

    public void desconectar() {
        try {
            if (st != null) {
                st.close();
            }
            if (conexion != null) {
                conexion.close();
            }
        } catch (SQLException ex) {
            System.out.println(ConexionLiterales.ERR_DESCONECTADO_DB.getDato() + ex.getMessage());
        }
    }
}
