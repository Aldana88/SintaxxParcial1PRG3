package com.example.ecoride.modelo;

public class Vehiculo implements Comparable<Vehiculo> {

    protected String patente;
    protected int bateria;
    protected double tarifaBase;

    public Vehiculo(String patente, int bateria, double tarifaBase) {
        this.patente = patente;
        this.bateria = bateria;
        this.tarifaBase = tarifaBase;
    }

    public String getPatente() {
        return patente;
    }

    public int getBateria() {
        return bateria;
    }

    public double getTarifaBase() {
        return tarifaBase;
    }

    @Override
    public int compareTo(Vehiculo otro) {
        return Integer.compare(this.bateria, otro.bateria);
    }
}