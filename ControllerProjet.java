package com.example.projet;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerProjet {

	@Autowired
	private ServiceProjet serviceP;
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping(method=RequestMethod.POST, value="/Projet/add")
	public void add(@RequestBody Projet e) {
		serviceP.addProjet(e);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping("/Projet/(id)")
	public Optional<Projet> getProjetById(@PathVariable Long id) {
		return serviceP.getProjetById(id);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping("/Projet/(name)")
	public Optional<Projet> getProjetByName(@PathVariable String name) {
		return serviceP.getProjetByName(name);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping("/AllProjet")
	public List<Projet> getAllProjet(){
		return serviceP.getAll();
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping(method=RequestMethod.DELETE, value="/Projet/(id)")
	public void deleteProjet(@PathVariable Long id) {
		serviceP.deleteProjet(id);
	}
	
}
