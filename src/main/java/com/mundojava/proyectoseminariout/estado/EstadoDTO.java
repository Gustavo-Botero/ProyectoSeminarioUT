package com.mundojava.proyectoseminariout.estado;

import java.util.Objects;

public class EstadoDTO {

    private int id;
    private String estado;
    private int seProcesa;

    public EstadoDTO() {
    }

    public EstadoDTO(int id, String estado, int seProcesa) {
        this.id = id;
        this.estado = estado;
        this.seProcesa = seProcesa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getSeProcesa() {
        return seProcesa;
    }

    public void setSeProcesa(int seProcesa) {
        this.seProcesa = seProcesa;
    }

    @Override
    public String toString() {
        return "id=" + id + ", estado=" + estado + ", seProcesa=" + seProcesa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + this.id;
        hash = 89 * hash + Objects.hashCode(this.estado);
        hash = 89 * hash + this.seProcesa;
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
        final EstadoDTO other = (EstadoDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.seProcesa != other.seProcesa) {
            return false;
        }
        return Objects.equals(this.estado, other.estado);
    }

    
}
