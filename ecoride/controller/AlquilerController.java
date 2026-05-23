package com.example.ecoride.controller;

import com.example.ecoride.dto.SolicitudAlquiler;
import com.example.ecoride.modelo.Usuario;
import com.example.ecoride.modelo.UsuarioPremium;
import com.example.ecoride.service.AlquilerService;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/alquileres")
public class AlquilerController {

    private final AlquilerService service;

    public AlquilerController(AlquilerService service) {
        this.service = service;
    }

    @GetMapping("/desbloquear")
    public String desbloquear(@RequestBody SolicitudAlquiler dto) {

        Usuario usuario =
                new UsuarioPremium(
                        dto.getIdUsuario(),
                        "Aldana",
                        0.10);

        return service.desbloquear(
                usuario,
                dto.getPatente(),
                dto.getMetodoPago());
    }
}