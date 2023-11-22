package com.croydon.disney.service.impl;

import com.croydon.disney.model.Personaje;
import com.croydon.disney.repository.PersonajeRepository;
import com.croydon.disney.service.IPersonajeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class PersonajeServiceImpl implements IPersonajeService {

    @Autowired
    private PersonajeRepository personajeRepository;

    @Override
    public Personaje guardarPersonaje (Personaje personaje){
        return personajeRepository.save(personaje);
    }

    @Override
    public ArrayList<Personaje> getAllPersonaje() {
        ArrayList<Personaje> personajes = (ArrayList<Personaje>) personajeRepository.findAll();
        return personajes;
    }

    @Override
    public Personaje actualizarPersonaje(Integer id, Personaje nuevoPersonaje) {
        Personaje personajeExistente = personajeRepository.findById(id).orElse(null);

        if (personajeExistente != null) {

            personajeExistente.setNombre(nuevoPersonaje.getNombre());
            personajeExistente.setTvShow(nuevoPersonaje.getTvShow());
            personajeExistente.setFoto(nuevoPersonaje.getFoto());


            return personajeRepository.save(personajeExistente);
        } else {

            return null;
        }
    }

    @Override
    public void borrarPersonaje(Integer idpersonaje) {
        personajeRepository.deleteById(idpersonaje);
    }

    @Override
    public Personaje getIdPersonaje(Integer id) {

        Optional<Personaje> optionalPersonaje = personajeRepository.findById(id);

        if (optionalPersonaje.isPresent()) {

            Personaje personajeExistente = optionalPersonaje.get();

            String nombre = personajeExistente.getNombre();
            String tvShow = personajeExistente.getTvShow();
            String foto = personajeExistente.getFoto();

            return personajeExistente;
        } else {

            return null;
        }
    }
}
