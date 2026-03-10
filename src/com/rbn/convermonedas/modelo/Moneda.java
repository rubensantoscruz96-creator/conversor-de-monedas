package com.pollorosa.convermonedas.modelo;

public class Moneda {
    private String codigoISO;
    private String nombre;

    public Moneda(String codigoISO, String nombre) {
        this.codigoISO = codigoISO;
        this.nombre = nombre;
    }

    public String getCodigoISO() {
        return codigoISO;
    }

    public String getNombre() {
        return nombre;
    }
}
