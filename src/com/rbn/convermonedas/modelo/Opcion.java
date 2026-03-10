package com.pollorosa.convermonedas.modelo;

public class Opcion {
    private int numero;
    private Moneda base;
    private Moneda target;
    private boolean isSalir;

    public Opcion(int numero, Moneda base, Moneda target) {
        this.numero = numero;
        this.base = base;
        this.target = target;
        this.isSalir = false;
    }

    public Opcion(int numero) {
        this.numero = numero;
        this.isSalir = true;
    }

    public int getNumero() {
        return numero;
    }

    public Moneda getBase() {
        return base;
    }

    public Moneda getTarget() {
        return target;
    }

    public boolean isSalir() {
        return isSalir;
    }
}
