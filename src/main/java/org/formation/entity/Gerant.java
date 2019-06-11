package org.formation.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

/**
 * Classe Gerant caractérisée par une liste de conseillers. Cette classe hérite de la classe Employe.
 * 
 * @author Chloé & Jean-Charles & Jérémi
 *
 */
@Entity
public class Gerant extends Employe {

	@OneToMany(mappedBy = "gerant", cascade = { CascadeType.PERSIST })
	private List<Conseiller> listeConseillers;

	public Gerant(String mail, String telephone, Adresse adresse, String identifiant, String motDePasse, String nom,
			String prenom) {
		super(mail, telephone, adresse, identifiant, motDePasse, nom, prenom);
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
				+ ", getMotDePasse()=" + getMotDePasse() + ", getMail()=" + getEmail() + ", getTelephone()="
				+ getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
