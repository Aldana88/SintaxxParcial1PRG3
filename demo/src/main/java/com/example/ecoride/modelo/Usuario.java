package com.example.ecoride.modelo;

public class Usuario {

    protected int id;
    protected String nombre;

    public Usuario(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    public double aplicarDescuento(double monto) {
        return monto;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }
}