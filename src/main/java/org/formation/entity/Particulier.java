package org.formation.entity;

import java.util.List;

public class Particulier extends Client {

	private String nom;
	private String prenom;

	public Particulier(String mail, String telephone, Adresse adresse, List<Compte> listeComptes, Conseiller conseiller,
			String nom, String prenom) {
		super(mail, telephone, adresse, listeComptes, conseiller);
		this.nom = nom;
		this.prenom = prenom;
	}

	public Particulier() {
		super();
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

	@Override
	public String toString() {
		return "Particulier [nom=" + nom + ", prenom=" + prenom + ", getListeComptes()=" + getListeComptes()
				+ ", getConseiller()=" + getConseiller() + ", getMail()=" + getMail() + ", getTelephone()="
				+ getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
