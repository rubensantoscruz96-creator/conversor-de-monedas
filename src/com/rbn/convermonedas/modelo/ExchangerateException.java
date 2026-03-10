package com.pollorosa.convermonedas.modelo;

public class ExchangerateException extends RuntimeException {
    private String codigo;

    public ExchangerateException(String codigo, String message) {
        super(message);
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getMessage() {
        return "[" + this.getCodigo() + "] " + super.getMessage();
    }
}
