package org.formation.entity;

import java.util.List;

public class Gerant extends Employe {

	private List<Conseiller> listeConseillers;

	public Gerant(String mail, String telephone, Adresse adresse, String identifiant, String motDePasse,
			List<Conseiller> listeConseillers) {
		super(mail, telephone, adresse, identifiant, motDePasse);
		this.listeConseillers = listeConseillers;
	}

	public Gerant() {
		super();
	}

	public List<Conseiller> getListeConseillers() {
		return listeConseillers;
	}

	public void setListeConseillers(List<Conseiller> listeConseillers) {
		this.listeConseillers = listeConseillers;
	}

	@Override
	public String toString() {
		return "Gerant [listeConseillers=" + listeConseillers + ", getIdentifiant()=" + getIdentifiant()
				+ ", getMotDePasse()=" + getMotDePasse() + ", getMail()=" + getMail() + ", getTelephone()="
				+ getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
