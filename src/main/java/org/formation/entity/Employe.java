package org.formation.entity;

public class Employe extends Personne {

	private String identifiant;
	private String motDePasse;

	public Employe(String mail, String telephone, Adresse adresse, String identifiant, String motDePasse) {
		super(mail, telephone, adresse);
		this.identifiant = identifiant;
		this.motDePasse = motDePasse;
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

	@Override
	public String toString() {
		return "Employe [identifiant=" + identifiant + ", motDePasse=" + motDePasse + ", getMail()=" + getMail()
				+ ", getTelephone()=" + getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
