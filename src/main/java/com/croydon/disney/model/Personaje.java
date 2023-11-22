package com.croydon.disney.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "personaje")
@Getter
@Setter
public class Personaje {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "disney_api_id")
    private Integer id;


    @Column(name = "nombre")
    private String nombre;

    @Column(name = "tv_show")
    private String tvShow;

    @Column(name = "foto")
    private String foto;

}
