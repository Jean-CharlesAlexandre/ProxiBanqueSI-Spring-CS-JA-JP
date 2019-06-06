package org.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CarteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String typePremierOuElectron;
	private CompteCourant compteAssocie;

	public CarteBancaire(String typePremierOuElectron, CompteCourant compteAssocie) {
		super();
		this.typePremierOuElectron = typePremierOuElectron;
		this.compteAssocie = compteAssocie;
	}

	public CarteBancaire() {
		super();
	}

	public Long getId() {
		return id;
	}

	public String getTypePremierOuElectron() {
		return typePremierOuElectron;
	}

	public void setTypePremierOuElectron(String typePremierOuElectron) {
		this.typePremierOuElectron = typePremierOuElectron;
	}

	public CompteCourant getCompteAssocie() {
		return compteAssocie;
	}

	public void setCompteAssocie(CompteCourant compteAssocie) {
		this.compteAssocie = compteAssocie;
	}

	@Override
	public String toString() {
		return "CarteBancaire [typePremierOuElectron=" + typePremierOuElectron + ", compteAssocie=" + compteAssocie
				+ "]";
	}
}
