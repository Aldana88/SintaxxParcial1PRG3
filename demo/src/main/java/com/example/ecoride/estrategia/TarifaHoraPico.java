package com.example.ecoride.estrategia;

public class TarifaHoraPico implements EstrategiaTarifa {

    @Override
    public double calcular(double tarifaBase,
                           int minutos) {

        return tarifaBase * minutos * 1.40;
    }
}