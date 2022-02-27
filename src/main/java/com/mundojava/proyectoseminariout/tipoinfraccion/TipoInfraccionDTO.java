package com.mundojava.proyectoseminariout.tipoinfraccion;

import java.util.Objects;

public class TipoInfraccionDTO {

    private String id;
    private int codigoInfraccion;
    private String tipoInfraccion;
    private int valorInfraccion;

    public TipoInfraccionDTO() {
    }

    public TipoInfraccionDTO(
            String id,
            int codigoInfraccion,
            String tipoInfraccion,
            int valorInfraccion
    ) {
        this.id = id;
        this.codigoInfraccion = codigoInfraccion;
        this.tipoInfraccion = tipoInfraccion;
        this.valorInfraccion = valorInfraccion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCodigoInfraccion() {
        return codigoInfraccion;
    }

    public void setCodigoInfraccion(int codigoInfraccion) {
        this.codigoInfraccion = codigoInfraccion;
    }

    public String getTipoInfraccion() {
        return tipoInfraccion;
    }

    public void setTipoInfraccion(String tipoInfraccion) {
        this.tipoInfraccion = tipoInfraccion;
    }

    public int getValorInfraccion() {
        return valorInfraccion;
    }

    public void setValorInfraccion(int valorInfraccion) {
        this.valorInfraccion = valorInfraccion;
    }

    @Override
    public String toString() {
        return "id=" + id
                + ", codigoInfraccion=" + codigoInfraccion
                + ", tipoInfraccion=" + tipoInfraccion
                + ", valorInfraccion=" + valorInfraccion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 53 * hash + Objects.hashCode(this.id);
        hash = 53 * hash + this.codigoInfraccion;
        hash = 53 * hash + Objects.hashCode(this.tipoInfraccion);
        hash = 53 * hash + this.valorInfraccion;
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
        final TipoInfraccionDTO other = (TipoInfraccionDTO) obj;
        if (this.codigoInfraccion != other.codigoInfraccion) {
            return false;
        }
        if (this.valorInfraccion != other.valorInfraccion) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return Objects.equals(this.tipoInfraccion, other.tipoInfraccion);
    }
}
