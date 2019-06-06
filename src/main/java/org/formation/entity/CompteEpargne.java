package org.formation.entity;

import javax.persistence.Entity;

@Entity
public class CompteEpargne extends Compte {

	private static final double TAUXREMUNERATION = 0.03;

	public CompteEpargne(Long numCompte, String dateOuverture, Double solde) {
		super(numCompte, dateOuverture, solde);
	}

	public CompteEpargne() {
		super();
	}

	public static double getTauxremuneration() {
		return TAUXREMUNERATION;
	}

	@Override
	public String toString() {
		return "CompteEpargne [getNumCompte()=" + getNumCompte() + ", getDateOuverture()=" + getDateOuverture()
				+ ", getSolde()=" + getSolde() + ", getClientAssocie()=" + getClientAssocie() + "]";
	}
}
