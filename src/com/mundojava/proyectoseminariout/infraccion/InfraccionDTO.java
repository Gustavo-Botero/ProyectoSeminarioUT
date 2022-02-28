package com.mundojava.proyectoseminariout.infraccion;

import java.util.Objects;

public class InfraccionDTO {

    private int id;
    private int conductorId;
    private int tipoInfraccionId;
    private int vehiculoId;
    private int estadoId;
    private String fecha;
    private int agenteId;

    public InfraccionDTO() {
    }

    public InfraccionDTO(
            int id,
            int conductorId,
            int tipoInfraccionId,
            int vehiculoId,
            int estadoId,
            String fecha,
            int agenteId
    ) {
        this.id = id;
        this.conductorId = conductorId;
        this.tipoInfraccionId = tipoInfraccionId;
        this.vehiculoId = vehiculoId;
        this.estadoId = estadoId;
        this.fecha = fecha;
        this.agenteId = agenteId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConductorId() {
        return conductorId;
    }

    public void setConductorId(int conductorId) {
        this.conductorId = conductorId;
    }

    public int getTipoInfraccionId() {
        return tipoInfraccionId;
    }

    public void setTipoInfraccionId(int tipoInfraccionId) {
        this.tipoInfraccionId = tipoInfraccionId;
    }

    public int getVehiculoId() {
        return vehiculoId;
    }

    public void setVehiculoId(int vehiculoId) {
        this.vehiculoId = vehiculoId;
    }

    public int getEstadoId() {
        return estadoId;
    }

    public void setEstadoId(int estadoId) {
        this.estadoId = estadoId;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getAgenteId() {
        return agenteId;
    }

    public void setAgenteId(int agenteId) {
        this.agenteId = agenteId;
    }

    @Override
    public String toString() {
        return "id=" + id
                + ", conductorId=" + conductorId
                + ", tipoInfraccionId=" + tipoInfraccionId
                + ", vehiculoId=" + vehiculoId
                + ", estadoId=" + estadoId
                + ", fecha=" + fecha
                + ", agenteId=" + agenteId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + this.id;
        hash = 29 * hash + this.conductorId;
        hash = 29 * hash + this.tipoInfraccionId;
        hash = 29 * hash + this.vehiculoId;
        hash = 29 * hash + this.estadoId;
        hash = 29 * hash + Objects.hashCode(this.fecha);
        hash = 29 * hash + this.agenteId;
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
        final InfraccionDTO other = (InfraccionDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.conductorId != other.conductorId) {
            return false;
        }
        if (this.tipoInfraccionId != other.tipoInfraccionId) {
            return false;
        }
        if (this.vehiculoId != other.vehiculoId) {
            return false;
        }
        if (this.estadoId != other.estadoId) {
            return false;
        }
        if (this.agenteId != other.agenteId) {
            return false;
        }
        return Objects.equals(this.fecha, other.fecha);
    }

}
