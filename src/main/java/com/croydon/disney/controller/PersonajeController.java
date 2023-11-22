package com.croydon.disney.controller;

import com.croydon.disney.model.Personaje;
import com.croydon.disney.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/personaje")
public class PersonajeController {

    @Autowired
    private IPersonajeService personajeService;

    @PostMapping
    public ResponseEntity<Personaje> guardarPersonaje(@RequestBody Personaje personaje){
        Personaje nuevopersonaje = personajeService.guardarPersonaje(personaje);
        return new ResponseEntity<>(nuevopersonaje, HttpStatus.CREATED);
    }
    @GetMapping
    public Iterable<Personaje> obtenerPersonaje(){
        ArrayList<Personaje> personajes =  personajeService.getAllPersonaje();
        return personajes;
    }

    @PutMapping("/{id}")
    public Personaje actualizarPersonaje(@PathVariable Integer id, @RequestBody Personaje nuevoPersonaje) {
        return personajeService.actualizarPersonaje(id, nuevoPersonaje);
    }

    @DeleteMapping(path = "{id}")
    public void eliminar(@PathVariable("id") Integer idpersonaje) {personajeService.borrarPersonaje(idpersonaje);
    }
}
