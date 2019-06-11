package org.formation.entity;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

/**
 * Classe Employe caractérisée par un identifiant, un mot de passe, un nom, et un prénom. Cette classe hérite de la classe Personne.
 * 
 * @author Chloé & Jean-Charles & Jérémi
 *
 */
@Entity
public class Employe extends Personne {

	private String identifiant;
	private String motDePasse;
	
	private String nom;
	private String prenom;

	public Employe(String mail, String telephone, Adresse adresse,String identifiant, String motDePasse,String nom,String prenom) {
		super(mail, telephone, adresse);
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
		this.nom = nom;
		this.prenom = prenom;
	}

	public Employe() {
		super();
	}

	public String getIdentifiant() {
		return identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.identifiant = identifiant;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
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
		return "Employe [identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", nom=" + nom + ", prenom="
				+ prenom + "]";
	}

}
