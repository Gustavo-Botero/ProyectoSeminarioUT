package com.mundojava.proyectoseminario.patrones_dao_dto;

import java.util.Objects;

public class EstadoDTO {
    private int id;
    private String estado;
    private boolean seProcesa;

    public EstadoDTO() {
    }

    public EstadoDTO(int id, String estado, boolean seProcesa) {
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

    public boolean isSeProcesa() {
        return seProcesa;
    }

    public void setSeProcesa(boolean seProcesa) {
        this.seProcesa = seProcesa;
    }

    @Override
    public String toString() {
        return "id=" + id + ", estado=" + estado + ", seProcesa=" + seProcesa;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        hash = 97 * hash + Objects.hashCode(this.estado);
        hash = 97 * hash + (this.seProcesa ? 1 : 0);
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
        if (!Objects.equals(this.estado, other.estado)) {
            return false;
        }
        return true;
    }
}
