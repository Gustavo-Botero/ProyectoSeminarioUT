package com.mundojava.proyectoseminario.principal;

import com.mundojava.proyectoseminario.utilidades.Capturador;

public class Principal {
    public static void main(String[] args) {
        Capturador capturador = new Capturador();
        
        String cadena = capturador.capturarLetras("Validar Solo letras");
        System.out.println("cadena = " + cadena);
        
        int validarInt = capturador.capturarInteger("Validar integer", true);
        System.out.println("validarInt = " + validarInt);
        
        short validarShort = capturador.capturarShort("Validar short", true);
        System.out.println("validarShort = " + validarShort);
    }
}
