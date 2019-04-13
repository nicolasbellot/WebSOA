package com.example.projet;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RepertoireProjet extends CrudRepository<Projet, Long> {

	public Optional<Projet> findById(Long id);
	public Optional<Projet> findByName(String nom);
	
}
