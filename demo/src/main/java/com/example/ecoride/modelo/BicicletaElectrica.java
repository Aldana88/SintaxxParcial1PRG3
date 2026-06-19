package com.example.ecoride.modelo;

public class BicicletaElectrica extends Vehiculo {

    @SuppressWarnings("unused")
    private int capacidadCanasto;

    public BicicletaElectrica(String patente, int bateria, double tarifaBase, int capacidadCanasto) {

        super(patente, bateria, tarifaBase);

        this.capacidadCanasto = capacidadCanasto;
    }
}