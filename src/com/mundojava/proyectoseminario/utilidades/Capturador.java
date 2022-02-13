package com.mundojava.proyectoseminario.utilidades;

import java.util.Scanner;

public class Capturador {
    
    private final Scanner sc;
    private final Validador validador;
    
    public Capturador(){
        this.sc = new Scanner(System.in);
        this.validador = new Validador();
    }
    
    public short capturarShort(String texto, boolean soloPositivos) {
        boolean datoOk = false;
        String dato = null;
        
        do {
            System.out.print(texto + ": ");
            dato = sc.nextLine();
            datoOk = validador.validarShort(dato);
            
            if(!datoOk) {
                System.out.println("Error, debe ingresar un entero corto");
                dato = null;
            } else if(Short.parseShort(dato) <= 0) {
                System.out.println("Error, debe ingresar un entero corto positivo");
                datoOk = false;
            }
            
        } while(!datoOk);
        
        return Short.parseShort(dato);
        
    }
    
    public int capturarInteger(String texto, boolean soloPositivos) {
        boolean datoOk = false;
        String dato = null;
        do {
            System.out.print(texto + ": ");
            dato = sc.nextLine();
            datoOk = validador.validarInteger(dato);
            
            if(!datoOk) {
                System.out.println("Error, debe ingresar un entero");
                dato = null;
            }  else if(Integer.parseInt(dato) <= 0 && soloPositivos == true) {
                System.out.println("Error, debe ingresar un entero positivo");
                datoOk = false;
            }
        } while(!datoOk);
        
        return Integer.parseInt(dato);
    }
    
    public String capturarLetras(String texto) {
        boolean datoOk = false;
        String dato = null;
        
        do {
            System.out.print(texto + ": ");
            dato = sc.nextLine();
            datoOk = validador.validarSoloLetras(dato.toUpperCase());
            
            if(!datoOk) {
                System.out.println("Error, debe ingresar solo letras");
            }else if(dato.charAt(0) == ' ') {
                System.out.println("Error, no debe contener espacio al inicio ");
                datoOk = false;
            }
        }while(!datoOk);
        
        return dato;
    }
}
