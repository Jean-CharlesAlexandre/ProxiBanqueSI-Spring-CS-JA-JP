package org.formation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

//@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class Client extends Personne {

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE })
	@JoinColumn(name = "compteCourant_id")
	private CompteCourant compteCourant;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE })
	@JoinColumn(name = "compteEpargne_id")
	private CompteEpargne compteEpargne;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	private String nom;
	private String prenom;
	private String raisonSociale;

	public Client(String email, String telephone, Adresse adresse) {
		super(email, telephone, adresse);
	}

	public Client() {
		super();
	}

	public Client(String email, String telephone, Adresse adresse, String nom, String prenom) {
		super(email, telephone, adresse);
		this.nom = nom;
		this.prenom = prenom;
	}

	public Client(String email, String telephone, Adresse adresse, String raisonSociale) {
		super(email, telephone, adresse);
		this.raisonSociale = raisonSociale;
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

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public void setId(Long id) {
		super.setId(id);
	}

	@Override
	public String toString() {
		return "Client [compteCourant=" + compteCourant + ", compteEpargne=" + compteEpargne + ", conseiller="
				+ conseiller + ", getMail()=" + getEmail() + ", getTelephone()=" + getTelephone() + ", getAdresse()="
				+ getAdresse() + "]";
	}

}
