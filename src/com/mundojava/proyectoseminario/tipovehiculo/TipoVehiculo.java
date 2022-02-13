package com.mundojava.proyectoseminario.tipovehiculo;

public class TipoVehiculo {
    private String nombre;

    public TipoVehiculo(String nombre) {
        this.nombre = nombre;
    }

    public TipoVehiculo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre;
    }
    
    
}
