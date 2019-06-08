package org.formation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {

	private int AUTORISATIONDECOUVERT = 1000;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "CB_id")
	private CarteBancaire carteBancaire;

	public CompteCourant(Long numCompte, String dateOuverture, Double solde, CarteBancaire carteBancaire,
			int autorisationDecouvert) {
		super(numCompte, dateOuverture, solde);
		this.carteBancaire = carteBancaire;
		autorisationDecouvert = this.getAutorisationdecouvert();
	}

	public CompteCourant() {
		super();
	}

	public CarteBancaire getCarteBancaire() {
		return carteBancaire;
	}

	public void setCarteBancaire(CarteBancaire carteBancaire) {
		this.carteBancaire = carteBancaire;
	}

	public int getAutorisationdecouvert() {
		return AUTORISATIONDECOUVERT;
	}

	@Override
	public String toString() {
		return "CompteCourant [carteBancaire=" + carteBancaire + ", getNumCompte()=" + getNumCompte()
				+ ", getDateOuverture()=" + getDateOuverture() + ", getSolde()=" + getSolde() + ", getClientAssocie()="
				+ getClientAssocie() + "]";
	}
}
