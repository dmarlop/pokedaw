package com.daw.persistence.entities;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="pokemon")
public class Pokemon {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String nombre;
	
	@Column(name="numero_pokedex")
	private Integer numPokedex;
	
	@Column(name="puntos_salud")
	private Integer pS;
	
	private String tipo1;
	private String tipo2;
	
	@Column(name="fecha_captura")
	private LocalDate fechaCaptura;
	
	@Enumerated(EnumType.STRING)
	private Capturado capturado;
	
}
