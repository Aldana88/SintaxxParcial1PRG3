package com.example.ecoride.service;

import com.example.ecoride.modelo.*;
import com.example.ecoride.pago.*;
import com.example.ecoride.estrategia.*;

import org.springframework.stereotype.Service;

@Service
public class AlquilerService {

    private Estacion estacion;
    private EstrategiaTarifa estrategia;

    public AlquilerService() {

        estacion = new Estacion("Centro");

        estacion.agregarVehiculo(
                new Monopatin("AAA111", 80, 500, true));

        estacion.agregarVehiculo(
                new BicicletaElectrica("BBB222", 10, 700, 30));

        estrategia = new TarifaEstandar();
    }

    public void cambiarEstrategia(EstrategiaTarifa estrategia) {
        this.estrategia = estrategia;
    }

    public String desbloquear(Usuario usuario,
                              String patente,
                              String metodoPago) {

        Vehiculo vehiculo = estacion.buscarVehiculo(patente);

        if (vehiculo == null) {
            return "Vehiculo No Encontrado";
        }

        if (vehiculo.getBateria() < 15) {
            return "Bateria Insuficiente";
        }

        double total = usuario.aplicarDescuento(
                vehiculo.getTarifaBase());

        ProcesadorPago pago =
                FabricaPago.crearPago(metodoPago);

        pago.cobrar(total);

        return "Vehiculo desbloqueado. Total pagado: $" + total;
    }

    public String finalizar(String patente,
                            int minutos) {

        Vehiculo vehiculo =
                estacion.buscarVehiculo(patente);

        if (vehiculo == null) {
            return "Vehiculo No Encontrado";
        }

        double costo =
                estrategia.calcular(
                        vehiculo.getTarifaBase(),
                        minutos);

        return "Viaje finalizado. Costo: $" + costo;
    }

    public Estacion getEstacion() {
        return estacion;
    }
}