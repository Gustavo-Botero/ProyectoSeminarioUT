package com.mundojava.proyectoseminario.conductor;

public class Conductor {

    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private int numeroDocumento;
    private int numeroContacto;

    public Conductor() {
    }
    
    public Conductor(
            String nombre,
            String apellido,
            String tipoDocumento,
            int numeroDocumento,
            int numeroContacto
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.numeroContacto = numeroContacto;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public int getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(int numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public int getNumeroContacto() {
        return numeroContacto;
    }

    public void setNumeroContacto(int numeroContacto) {
        this.numeroContacto = numeroContacto;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre
                + ", apellido=" + apellido
                + ", tipoDocumento=" + tipoDocumento
                + ", numeroDocumento=" + numeroDocumento
                + ", numeroContacto=" + numeroContacto;
    }

}
