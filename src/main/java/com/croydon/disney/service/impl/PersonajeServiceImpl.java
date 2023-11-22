package com.croydon.disney.service.impl;

import com.croydon.disney.model.Personaje;
import com.croydon.disney.repository.PersonajeRepository;
import com.croydon.disney.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PersonajeServiceImpl implements IPersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Override
    public ArrayList<Personaje> getAllPersonaje() {
        ArrayList<Personaje> personajes = (ArrayList<Personaje>) personajeRepository.findAll();
        return personajes;
    }
}
