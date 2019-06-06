package org.formation.entity;

import java.util.List;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("Entreprise")
public class ClientEntreprise extends Client {

	private String raisonSociale;

	// Constructeurs
	
	public ClientEntreprise(String mail, String telephone, Adresse adresse, List<Compte> listeComptes, Conseiller conseiller,
			String raisonSociale) {
		super(mail, telephone, adresse, listeComptes, conseiller);
		this.raisonSociale = raisonSociale;
	}

	public ClientEntreprise(String mail, String telephone, Adresse adresse) {
		super(mail, telephone, adresse);
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
		return "Entreprise [raisonSociale=" + raisonSociale + ", getListeComptes()=" + getListeComptes()
				+ ", getConseiller()=" + getConseiller() + ", getMail()=" + getMail() + ", getTelephone()="
				+ getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
