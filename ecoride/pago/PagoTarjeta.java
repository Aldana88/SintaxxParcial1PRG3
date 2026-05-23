package com.example.ecoride.pago;


public class PagoTarjeta implements ProcesadorPago {

    @Override
    public void cobrar(double monto) {
        System.out.println("Cobro exitoso de $" + monto + " realizado con Tarjeta");
    }
}


