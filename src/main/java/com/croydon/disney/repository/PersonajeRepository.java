package com.croydon.disney.repository;

import com.croydon.disney.model.Personaje;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonajeRepository extends CrudRepository<Personaje, Integer> {
}
