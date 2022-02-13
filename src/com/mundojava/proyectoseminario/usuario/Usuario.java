package com.mundojava.proyectoseminario.usuario;

public class Usuario {

    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private int numeroDocumento;
    private int numeroContacto;
    private String correo;
    private String contrasena;

    public Usuario(
            String nombre,
            String apellido,
            String tipoDocumento,
            int numeroDocumento,
            int numeroContacto,
            String correo,
            String contrasena
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.numeroContacto = numeroContacto;
        this.correo = correo;
        this.contrasena = contrasena;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + 
                ", apellido=" + apellido + 
                ", tipoDocumento=" + tipoDocumento + 
                ", numeroDocumento=" + numeroDocumento + 
                ", numeroContacto=" + numeroContacto + 
                ", correo=" + correo + 
                ", contrasena=" + contrasena;
    }
    
    
    
}
