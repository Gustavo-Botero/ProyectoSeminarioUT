package com.mundojava.proyectoseminariout.presentacion.menu_principal;

public enum VistaMenuPrincipalLiterales {
    
    TITULO_VENTANA("MENÚ PRINCIPAL");
    
    private final String dato;

    private VistaMenuPrincipalLiterales(String dato) {
        this.dato = dato;
    }

    public String getDato() {
        return dato;
    }
}
