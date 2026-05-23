package com.example.ecoride.pago;


public class FabricaPago {

    public static ProcesadorPago crearPago(String metodo) {

        if (metodo.equalsIgnoreCase("TARJETA")) {
            return new PagoTarjeta();
        }

        return new PagoBilletera();
    }
}


