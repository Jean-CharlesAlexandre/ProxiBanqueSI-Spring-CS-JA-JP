package org.formation.entity;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte {

	private double tauxRemuneration = 0.03;

	public CompteEpargne(Long numCompte, String dateOuverture, Double solde, Double tauxRemuneration) {
		super(numCompte, dateOuverture, solde);
		tauxRemuneration = this.getTauxRemuneration();
	}

	public CompteEpargne(Long numCompte, String dateOuverture, Double solde) {
		super(numCompte, dateOuverture, solde);
	}

	public CompteEpargne() {
		super();
	}

	public double getTauxRemuneration() {
		return tauxRemuneration;
	}

	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}

	@Override
	public String toString() {
		return "CompteEpargne [getNumCompte()=" + getNumCompte() + ", getDateOuverture()=" + getDateOuverture()
				+ ", getSolde()=" + getSolde() + ", getClientAssocie()=" + getClientAssocie() + "]";
	}
}
