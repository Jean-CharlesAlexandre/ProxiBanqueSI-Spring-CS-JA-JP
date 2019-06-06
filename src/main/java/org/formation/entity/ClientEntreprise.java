package org.formation.entity;

import javax.persistence.Entity;

@Entity
public class ClientEntreprise extends Client {

	private String raisonSociale;

	// Constructeurs

	public ClientEntreprise(String mail, String telephone, Adresse adresse,
			String raisonSociale) {
		super(mail, telephone, adresse);
		this.raisonSociale = raisonSociale;
	}

	public ClientEntreprise() {
		super();
	}

	public String getRaisonSociale() {
		return raisonSociale;
	}

	public void setRaisonSociale(String raisonSociale) {
		this.raisonSociale = raisonSociale;
	}

	@Override
	public String toString() {
		return "Entreprise [raisonSociale=" + raisonSociale + ", getConseiller()=" + getConseiller() + ", getMail()="
				+ getMail() + ", getTelephone()=" + getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
