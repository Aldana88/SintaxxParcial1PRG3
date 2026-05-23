package com.example.ecoride.modelo;

import java.util.ArrayList;
import java.util.List;

public class Estacion {

    @SuppressWarnings("unused")
    private String nombre;
    private List<Vehiculo> vehiculos;

    public Estacion(String nombre) {
        this.nombre = nombre;
        this.vehiculos = new ArrayList<>();
    }

    public void agregarVehiculo(BicicletaElectrica v) {
        vehiculos.add(v);
    }

    public Vehiculo buscarVehiculo(String patente) {

        for (Vehiculo v : vehiculos) {

            if (v.getPatente().equalsIgnoreCase(patente)) {
                return v;
            }
        }

        return null;
    }

    public void agregarVehiculo(Monopatin v) {
        
        throw new UnsupportedOperationException("Unimplemented method 'agregarVehiculo'");
    }
}


