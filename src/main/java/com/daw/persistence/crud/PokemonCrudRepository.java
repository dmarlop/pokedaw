package com.daw.persistence.crud;

import org.springframework.data.repository.CrudRepository;

import com.daw.persistence.entities.Pokemon;

public interface PokemonCrudRepository extends CrudRepository<Pokemon, Integer>{

}
