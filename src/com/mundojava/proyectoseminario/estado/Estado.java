package com.mundojava.proyectoseminario.estado;

public class Estado {
    private String estado;
    private boolean seProcesa;

    public Estado(String estado, boolean seProcesa) {
        this.estado = estado;
        this.seProcesa = seProcesa;
    }
    
    public Estado() {
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean getSeProcesa() {
        return seProcesa;
    }

    public void setSeProcesa(boolean seProcesa) {
        this.seProcesa = seProcesa;
    }

    @Override
    public String toString() {
        return "estado=" + estado + ", seProcesa=" + seProcesa;
    }
    
}
