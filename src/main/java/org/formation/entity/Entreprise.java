package org.formation.entity;

import java.util.List;

public class Entreprise extends Client {

	private String raisonSociale;

	public Entreprise(String mail, String telephone, Adresse adresse, List<Compte> listeComptes, Conseiller conseiller,
			String raisonSociale) {
		super(mail, telephone, adresse, listeComptes, conseiller);
		this.raisonSociale = raisonSociale;
	}

	public Entreprise() {
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
