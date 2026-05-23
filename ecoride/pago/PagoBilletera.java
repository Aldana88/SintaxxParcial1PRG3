package com.example.ecoride.pago;


public class PagoBilletera implements ProcesadorPago {

    @Override
    public void cobrar(double monto) {
        System.out.println("Cobro exitoso de $" + monto + " realizado con Billetera");
    }
}


