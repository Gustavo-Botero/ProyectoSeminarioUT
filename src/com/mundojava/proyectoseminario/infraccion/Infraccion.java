package com.mundojava.proyectoseminario.infraccion;

public class Infraccion {
    private int codigoInfraccion;
    private String tipoInfraccion;
    private int valorInfraccion;

    public Infraccion(int codigoInfraccion, String tipoInfraccion, int valorInfraccion) {
        this.codigoInfraccion = codigoInfraccion;
        this.tipoInfraccion = tipoInfraccion;
        this.valorInfraccion = valorInfraccion;
    }
    
    public Infraccion() {
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
        return "Infraccion{" + "codigoInfraccion=" + codigoInfraccion + ", tipoInfraccion=" + tipoInfraccion + ", valorInfraccion=" + valorInfraccion + '}';
    }
    
}
