package com.mundojava.proyectoseminariout.tipovehiculo;

import java.util.Objects;

public class TipoVehiculoDTO {

    private int id;
    private String tipoVehiculo;

    public TipoVehiculoDTO() {
    }

    public TipoVehiculoDTO(int id, String tipoVehiculo) {
        this.id = id;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "id=" + id
                + ", tipoVehiculo=" + tipoVehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 71 * hash + this.id;
        hash = 71 * hash + Objects.hashCode(this.tipoVehiculo);
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
        final TipoVehiculoDTO other = (TipoVehiculoDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        return Objects.equals(this.tipoVehiculo, other.tipoVehiculo);
    }

}
