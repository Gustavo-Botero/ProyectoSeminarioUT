package com.mundojava.proyectoseminario.utilidades;

public class Validador {

    public boolean validarShort(String dato) {
        try {
            Short.parseShort(dato);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean validarInteger(String dato) {
        try {
            Integer.parseInt(dato);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }

    public boolean validarSoloLetras(String dato) {
        
        for (int i = 0; i < dato.length(); i++) {
            char caracter = dato.charAt(i);

            if (
                !((caracter >= 'A' && caracter <= 'Z')
                || caracter == ' ')
           ){
                return false;
            }
        }
        return true;
    }
}
