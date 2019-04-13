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
public class ControllerEmploye {
	
	@Autowired
	private ServiceEmploye serviceE;
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping(method=RequestMethod.POST, value="/employe/add")
	public void add(@RequestBody Employe e) {
		serviceE.addEmploye(e);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping("/employe/(id)")
	public Optional<Employe> getEmployeById(@PathVariable Long id) {
		return serviceE.getEmployeById(id);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping("/employe/(name)")
	public Optional<Employe> getEmployeByName(@PathVariable String name) {
		return serviceE.getEmployeByName(name);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping("/employe/(job)")
	public Optional<Employe> getEmployeByJob(@PathVariable String job) {
		return serviceE.getEmployeByJob(job);
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping("/AllEmploye")
	public List<Employe> getAllEmploye(){
		return serviceE.getAll();
	}
	
	@CrossOrigin(origins="http://localhost:3000")
	@RequestMapping(method=RequestMethod.DELETE, value="/employe/(id)")
	public void deleteEmploye(@PathVariable Long id) {
		serviceE.deleteEmploye(id);
	}
	
}
