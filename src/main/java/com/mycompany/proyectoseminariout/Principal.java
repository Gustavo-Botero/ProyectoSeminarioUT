package com.mycompany.proyectoseminariout;

import com.mundojava.proyectoseminariout.conexion.Conexion;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        
        Conexion conexion = new Conexion();
        
        conexion.conectar();
        
        conexion.desconectar();
    }
}
