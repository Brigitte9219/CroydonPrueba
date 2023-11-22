package com.croydon.disney.controller;

import com.croydon.disney.model.Personaje;
import com.croydon.disney.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    @Autowired
    private IPersonajeService personajeService;

    @GetMapping
    public Iterable<Personaje> obtenerPersonaje(){
        ArrayList<Personaje> personajes =  personajeService.getAllPersonaje();
        return personajes;
    }
}
