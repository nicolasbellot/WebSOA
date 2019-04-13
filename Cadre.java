package com.example.projet;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cadre extends Employe {
	
	@OneToOne(mappedBy="responsableProjet")
	private Projet projet;
	
	public Cadre() {
		super();
	}
	
	public Cadre(String salaireBase, String nom, String prenom, 
			String dateNaissance, String dateArrivee, Projet projet) {
		super(salaireBase, nom, prenom, dateNaissance, dateArrivee);
		this.setProjet(projet);
	}

	public Projet getProjet() {
		return this.projet;
	}

	public void setProjet(Projet projet) {
		this.projet = projet;
	}

}
