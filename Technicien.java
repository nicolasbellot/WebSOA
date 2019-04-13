package com.example.projet;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Technicien extends Employe {

	@OneToOne(mappedBy="technicienProjet")
	private Projet projet;
	
	public Technicien() {
		super();
	}
	
	public Technicien(String salaireBase, String nom, String prenom, String dateNaissance, String dateArrivee) {
		super(salaireBase, nom, prenom, dateNaissance, dateArrivee);
	}

	public Projet getProjet() {
		return projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	
}
