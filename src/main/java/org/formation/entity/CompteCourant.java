package org.formation.entity;

import java.util.List;

public class CompteCourant extends Compte {

	private static final int AUTORISATIONDECOUVERT = 1000;
	private CarteBancaire carteBancaire;

	public CompteCourant(Long numCompte, String dateOuverture, Double solde, List<Operation> listeOperations,
			Client clientAssocie, CarteBancaire carteBancaire) {
		super(numCompte, dateOuverture, solde, listeOperations, clientAssocie);
		this.carteBancaire = carteBancaire;
	}

	public CarteBancaire getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(CarteBancaire carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

	public static int getAutorisationdecouvert() {
		return AUTORISATIONDECOUVERT;
	}

	@Override
	public String toString() {
		return "CompteCourant [carteBancaire=" + carteBancaire + ", getNumCompte()=" + getNumCompte()
				+ ", getDateOuverture()=" + getDateOuverture() + ", getSolde()=" + getSolde()
				+ ", getListeOperations()=" + getListeOperations() + ", getClientAssocie()=" + getClientAssocie() + "]";
	}
}
