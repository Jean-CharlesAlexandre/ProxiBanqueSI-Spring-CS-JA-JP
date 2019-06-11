package org.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Classe CB caractérisée par un id et un type de carte.
 * 
 * @author Chloé & Jean-Charles & Jérémi
 *
 */
@Entity
public class CarteBancaire {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String typePremierOuElectron;

	public CarteBancaire(String typePremierOuElectron) {
		super();
		this.typePremierOuElectron = typePremierOuElectron;
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

	@Override
	public String toString() {
		return "CarteBancaire [typePremierOuElectron=" + typePremierOuElectron + "]";
	}

}
