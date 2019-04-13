package com.example.projet;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Projet {

	@Id
	@GeneratedValue
	private Long id;
	private String nomProjet;
	@OneToOne
	private Cadre responsableProjet;
	@OneToOne
	private Technicien technicienProjet;
	private String statut;
	
	public Projet(String nomProjet, Cadre responsableProjet, Technicien technicien) {
		super();
		this.setNomProjet(nomProjet);
		this.setResponsableProjet(responsableProjet);
		this.setTechnicienProjet(technicien);
		this.statut = "En cours";
	}

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomProjet() {
		return nomProjet;
	}

	public void setNomProjet(String nomProjet) {
		this.nomProjet = nomProjet;
	}

	public Cadre getResponsableProjet() {
		return responsableProjet;
	}

	public void setResponsableProjet(Cadre responsableProjet) {
		this.responsableProjet = responsableProjet;
	}

	public Technicien getTechnicienProjet() {
		return technicienProjet;
	}

	public void setTechnicienProjet(Technicien technicien) {
		this.technicienProjet = technicien;
	}
	
	public String getStatut() {
		return this.statut;
	}
	
	public void setStatut(String statut) {
		this.statut = statut;
	}
	
}
