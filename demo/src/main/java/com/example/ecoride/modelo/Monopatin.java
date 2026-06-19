package com.example.ecoride.modelo;

import com.example.ecoride.estado.EstadoVehiculo;
import com.example.ecoride.estado.EnEspera;

public class Monopatin extends Vehiculo {

    private boolean amortiguacion;
    private EstadoVehiculo estado;

    public Monopatin(String patente,
                     int bateria,
                     double tarifaBase,
                     boolean amortiguacion) {

        super(patente, bateria, tarifaBase);

        this.amortiguacion = amortiguacion;
        this.estado = new EnEspera();
    }

    public boolean isAmortiguacion() {
        return amortiguacion;
    }

    public void setAmortiguacion(boolean amortiguacion) {
        this.amortiguacion = amortiguacion;
    }

    public EstadoVehiculo getEstado() {
        return estado;
    }

    public void setEstado(EstadoVehiculo estado) {
        this.estado = estado;
    }
}