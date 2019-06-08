package org.formation.entity;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte {

	private double TAUXREMUNERATION = 0.03;

	public CompteEpargne(Long numCompte, String dateOuverture, Double solde, Double tauxRemuneration) {
		super(numCompte, dateOuverture, solde);
		tauxRemuneration = this.getTauxremuneration();
	}

	public CompteEpargne() {
		super();
	}

	public double getTauxremuneration() {
		return TAUXREMUNERATION;
	}

	@Override
	public String toString() {
		return "CompteEpargne [getNumCompte()=" + getNumCompte() + ", getDateOuverture()=" + getDateOuverture()
				+ ", getSolde()=" + getSolde() + ", getClientAssocie()=" + getClientAssocie() + "]";
	}
}
