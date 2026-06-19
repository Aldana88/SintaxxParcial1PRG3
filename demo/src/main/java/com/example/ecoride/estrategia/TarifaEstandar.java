package com.example.ecoride.estrategia;

public class TarifaEstandar implements EstrategiaTarifa {

    @Override
    public double calcular(double tarifaBase,
                           int minutos) {

        return tarifaBase * minutos;
    }
}