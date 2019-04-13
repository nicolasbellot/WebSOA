package com.example.projet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public abstract class Employe {

	@Id
	@GeneratedValue
	private Long id;
	//private float  salaireBase;
	private String nom, prenom, salaireBase, dateNaissance, dateArrivee;
	//private Date dateNaissance, dateArrivee;
	
	public Employe() {
		super();
	}
	
	public Employe(String salaireBase, String nom, String prenom, 
			String dateNaissance, String dateArrivee) {
		super();
		this.setSalaireBase(salaireBase);
		this.setNom(nom);
		this.setPrenom(prenom);
		this.setDateNaissance(dateNaissance);
		this.setDateArrivee(dateArrivee);
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSalaireBase() {
		return salaireBase;
	}

	public void setSalaireBase(String salaireBase) {
		this.salaireBase = salaireBase;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getDateArrivee() {
		return dateArrivee;
	}

	public void setDateArrivee(String dateArrivee) {
		this.dateArrivee = dateArrivee;
	}
	
}
