package com.pollorosa.convermonedas.vista;

import com.pollorosa.convermonedas.modelo.Moneda;

import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Moneda dolar = new Moneda("USD", "Dólar americano");
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("ARS", "Peso argentino"));
        monedas.add(new Moneda("BRL", "Real brasileño"));
        monedas.add(new Moneda("COP", "Peso colombiano"));

        Aplicativo sistema = new Aplicativo(dolar, monedas);
        sistema.generarMenu();
        sistema.iniciar();
    }
}
