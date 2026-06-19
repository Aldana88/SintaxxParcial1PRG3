package com.example.ecoride.estado;

public class EnReparacion implements EstadoVehiculo {

    @Override
    public String getNombre() {
        return "EN_REPARACION";
    }
}