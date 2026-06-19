package com.example.ecoride.modelo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Estacion {

private String nombre;
private HashMap<String, Vehiculo> vehiculos;

public Estacion(String nombre) {
    this.nombre = nombre;
    this.vehiculos = new HashMap<>();
}

public void agregarVehiculo(Vehiculo vehiculo) {
    vehiculos.put(
            vehiculo.getPatente().toUpperCase(),
            vehiculo);
}

public Vehiculo buscarVehiculo(String patente) {

    return vehiculos.get(
            patente.toUpperCase());
}

public List<Vehiculo> obtenerVehiculos() {

    return new ArrayList<>(
            vehiculos.values());
}

public List<Vehiculo> ordenarPorBateria() {

    List<Vehiculo> copia =
            new ArrayList<>(
                    vehiculos.values());

    Collections.sort(copia);

    return copia;
}

public String getNombre() {
    return nombre;
}
```

}
