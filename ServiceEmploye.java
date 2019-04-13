package com.example.projet;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServiceEmploye {

	@Autowired
	private RepertoireEmploye employes;
	
	public void addEmploye(Employe e) {
		employes.save(e);
	}
	
	public Optional<Employe> getEmployeById(Long id) {
		return employes.findById(id);
	}
	
	public Optional<Employe> getEmployeByName(String name) {
		return employes.findByName(name);
	}
	
	public Optional<Employe> getEmployeByJob(String job) {
		return employes.findByJob(job);
	}
	
	public void deleteEmploye(Long id) {
		employes.deleteById(id);
	}
	
	public void updateEmploye(Employe e) {
		employes.save(e);
	}
	
	public List<Employe> getAll(){
		List<Employe> res = new ArrayList<>();
		employes.findAll().forEach(res :: add);
		return res;
	}
	
}
