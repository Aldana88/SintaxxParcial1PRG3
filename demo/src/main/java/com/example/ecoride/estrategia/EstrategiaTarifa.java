package com.example.ecoride.estrategia;

public interface EstrategiaTarifa {

    double calcular(double tarifaBase,
                    int minutos);
}