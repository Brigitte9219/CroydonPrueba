package com.croydon.disney.service;

import com.croydon.disney.model.Personaje;

import java.util.ArrayList;

public interface IPersonajeService {

    Personaje guardarPersonaje (Personaje personaje);

    ArrayList<Personaje> getAllPersonaje();
}
