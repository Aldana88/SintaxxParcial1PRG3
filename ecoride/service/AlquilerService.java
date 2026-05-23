package com.example.ecoride.service;

import com.example.ecoride.modelo.*;
import com.example.ecoride.pago.*;

import org.springframework.stereotype.Service;

@Service
public class AlquilerService {

    private Estacion estacion;
    public AlquilerService() {

    estacion = new Estacion("Centro");

    estacion.agregarVehiculo(
            new Monopatin("AAA111", 80, 500, true));

    estacion.agregarVehiculo(
            new BicicletaElectrica("BBB222", 10, 700, 30));
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
}