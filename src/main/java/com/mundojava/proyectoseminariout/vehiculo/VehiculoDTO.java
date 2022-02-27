package com.mundojava.proyectoseminariout.vehiculo;

import java.util.Objects;

public class VehiculoDTO {

    private int id;
    private String placa;
    private int tipoVehiculo;

    public VehiculoDTO() {
    }

    public VehiculoDTO(int id, String placa, int tipoVehiculo) {
        this.id = id;
        this.placa = placa;
        this.tipoVehiculo = tipoVehiculo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(int tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    @Override
    public String toString() {
        return "id=" + id
                + ", placa=" + placa
                + ", tipoVehiculo=" + tipoVehiculo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.id;
        hash = 67 * hash + Objects.hashCode(this.placa);
        hash = 67 * hash + this.tipoVehiculo;
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
        final VehiculoDTO other = (VehiculoDTO) obj;
        if (this.id != other.id) {
            return false;
        }
        if (this.tipoVehiculo != other.tipoVehiculo) {
            return false;
        }
        return Objects.equals(this.placa, other.placa);
    }
}
