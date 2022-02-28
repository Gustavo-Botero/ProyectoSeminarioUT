package com.mundojava.proyectoseminariout.conductor;

import java.util.Objects;

public class ConductorDTO {

    private int id;
    private String nombre;
    private String apellido;
    private String tipoDocumento;
    private int numeroDocumento;
    private int numeroContacto;

    public ConductorDTO() {
    }

    public ConductorDTO(
            int id,
            String nombre,
            String apellido,
            String tipoDocumento,
            int numeroDocumento,
            int numeroContacto
    ) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.numeroContacto = numeroContacto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
        return "id=" + id
                + ", nombre=" + nombre
                + ", apellido=" + apellido
                + ", tipoDocumento=" + tipoDocumento
                + ", numeroDocumento=" + numeroDocumento
                + ", numeroContacto=" + numeroContacto;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.nombre);
        hash = 71 * hash + Objects.hashCode(this.apellido);
        hash = 71 * hash + Objects.hashCode(this.tipoDocumento);
        hash = 71 * hash + this.numeroDocumento;
        hash = 71 * hash + this.numeroContacto;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ConductorDTO other = (ConductorDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.numeroDocumento != other.numeroDocumento) {
            return false;
        }
        if (this.numeroContacto != other.numeroContacto) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        if (!Objects.equals(this.apellido, other.apellido)) {
            return false;
        }
        return Objects.equals(this.tipoDocumento, other.tipoDocumento);
    }

}
