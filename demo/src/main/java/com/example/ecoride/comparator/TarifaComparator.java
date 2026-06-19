package com.example.ecoride.comparator;

import java.util.Comparator;
import com.example.ecoride.modelo.Vehiculo;

public class TarifaComparator
        implements Comparator<Vehiculo> {

    @Override
    public int compare(
            Vehiculo v1,
            Vehiculo v2) {

        return Double.compare(
                v2.getTarifaBase(),
                v1.getTarifaBase());
    }
}