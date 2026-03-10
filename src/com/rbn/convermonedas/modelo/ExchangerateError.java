package com.pollorosa.convermonedas.modelo;

public class ExchangerateError {
    private String codigo;
    private String detalle;

    public ExchangerateError(String codigo, String detalle) {
        this.codigo = codigo;
        this.detalle = detalle;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDetalle() {
        return detalle;
    }
}
