package com.daw.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.daw.persistence.crud.PokemonCrudRepository;
import com.daw.persistence.entities.Pokemon;

@Service
public class PokemonService {

	@Autowired
	public PokemonCrudRepository pokemonCrudRepository;
	
	public List<Pokemon> getAll(){
		return (List<Pokemon>) this.pokemonCrudRepository.findAll();
	}
	
}
