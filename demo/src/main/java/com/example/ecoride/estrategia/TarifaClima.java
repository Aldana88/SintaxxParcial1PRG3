package com.example.ecoride.estrategia;

public class TarifaClima implements EstrategiaTarifa {

    @Override
    public double calcular(double tarifaBase,
                           int minutos) {

        return (tarifaBase * minutos) + 150;
    }
}