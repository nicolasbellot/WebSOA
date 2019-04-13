package com.example.projet;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface RepertoireEmploye extends CrudRepository<Employe, Long> {

	public Optional<Employe> findById(Long id);
	public Optional<Employe> findByName(String nom);
	public Optional<Employe> findByJob(String job);
	
}
