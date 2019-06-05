package org.formation.entity;

import java.util.List;

public class CompteEpargne extends Compte {

	private static final double TAUXREMUNERATION = 0.03;

	public CompteEpargne(Long numCompte, String dateOuverture, Double solde, List<Operation> listeOperations,
			Client clientAssocie) {
		super(numCompte, dateOuverture, solde, listeOperations, clientAssocie);
		// TODO Auto-generated constructor stub
	}

	public static double getTauxremuneration() {
		return TAUXREMUNERATION;
	}

	@Override
	public String toString() {
		return "CompteEpargne [getNumCompte()=" + getNumCompte() + ", getDateOuverture()=" + getDateOuverture()
				+ ", getSolde()=" + getSolde() + ", getListeOperations()=" + getListeOperations()
				+ ", getClientAssocie()=" + getClientAssocie() + "]";
	}
}
