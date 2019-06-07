package org.formation.entity;

import javax.persistence.Entity;

@Entity
public class ClientParticulier extends Client {

	private String nom;
	private String prenom;

	// Constructeurs

	public ClientParticulier(String mail, String telephone, Adresse adresse, String nom,
			String prenom) {
		super(mail, telephone, adresse);
		this.nom = nom;
		this.prenom = prenom;
	}

	public ClientParticulier() {
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
		return "Particulier [nom=" + nom + ", prenom=" + prenom + ", getConseiller()=" + getConseiller()
				+ ", getMail()=" + getEmail() + ", getTelephone()=" + getTelephone() + ", getAdresse()=" + getAdresse()
				+ "]";
	}
}
