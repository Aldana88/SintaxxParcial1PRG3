package com.example.ecoride.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @GetMapping("/prioridad-carga")
    public String prioridadCarga() {

        return """
                Vehículos ordenados por batería
                (de menor a mayor)
                """;
    }

    @GetMapping("/tarifa-descendente")
    public String tarifaDescendente() {

        return """
                Vehículos ordenados por tarifa base
                (de mayor a menor)
                """;
    }
}