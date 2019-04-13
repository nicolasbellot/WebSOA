package com.example.projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceProjet {

	@Autowired
	private RepertoireProjet projets;
	
	public void addProjet(Projet p) {
		projets.save(p);
	}
	
	public Optional<Projet> getProjetById(Long id) {
		return projets.findById(id);
	}
	
	public Optional<Projet> getProjetByName(String name) {
		return projets.findByName(name);
	}
	
	public void updateProjet(Projet p) {
		projets.save(p);
	}
	
	public void deleteProjet(Long id) {
		projets.deleteById(id);
	}
	
	public List<Projet> getAll(){
		List<Projet> res = new ArrayList<>();
		projets.findAll().forEach(res :: add);
		return res;
	}
	
}
