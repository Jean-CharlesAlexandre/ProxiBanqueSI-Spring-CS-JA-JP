package org.formation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class CompteCourant extends Compte {

	private int autorisationDecouvert = 1000;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "CB_id")
	private CarteBancaire carteBancaire;

	public CompteCourant(Long numCompte, String dateOuverture, Double solde, CarteBancaire carteBancaire,
			int autorisationDecouvert) {
		super(numCompte, dateOuverture, solde);
		this.carteBancaire = carteBancaire;
		autorisationDecouvert = this.getAutorisationDecouvert();
	}

	public CompteCourant(Long numCompte, String dateOuverture, Double solde, CarteBancaire carteBancaire) {
		super(numCompte, dateOuverture, solde);
		this.carteBancaire = carteBancaire;
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

	public int getAutorisationDecouvert() {
		return autorisationDecouvert;
	}

	public void setAutorisationDecouvert(int autorisationDecouvert) {
		this.autorisationDecouvert = autorisationDecouvert;
	}

	@Override
	public String toString() {
		return "CompteCourant [carteBancaire=" + carteBancaire + ", getNumCompte()=" + getNumCompte()
				+ ", getDateOuverture()=" + getDateOuverture() + ", getSolde()=" + getSolde() + ", getClientAssocie()="
				+ getClientAssocie() + "]";
	}
}
