package com.croydon.disney.service;

import com.croydon.disney.model.Personaje;

import java.util.ArrayList;

public interface IPersonajeService {

    Personaje guardarPersonaje (Personaje personaje);

    ArrayList<Personaje> getAllPersonaje();

    Personaje actualizarPersonaje(Integer id, Personaje nuevoPersonaje);

    void borrarPersonaje(Integer idpersonaje);

    Personaje getIdPersonaje(Integer id);
}
