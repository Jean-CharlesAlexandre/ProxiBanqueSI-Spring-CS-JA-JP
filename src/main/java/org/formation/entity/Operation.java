package org.formation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

//@Entity
public class Operation {

//	@Id
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String dateOperation;
	
//	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
//	@JoinColumn(name = "compte_id", unique = true)
	private Compte compte;
	private Double montant;
	private String typeDebitOuCredit;

	public Operation(String dateOperation, Compte compte, Double montant, String typeDebitOuCredit) {
		super();
		this.dateOperation = dateOperation;
		this.compte = compte;
		this.montant = montant;
		this.typeDebitOuCredit = typeDebitOuCredit;
	}

	public Operation() {
		super();
	}

	public String getDateOperation() {
		return dateOperation;
	}

	public void setDateOperation(String dateOperation) {
		this.dateOperation = dateOperation;
	}

	public Compte getCompte() {
		return compte;
	}

	public void setCompte(Compte compte) {
		this.compte = compte;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}

	public String getTypeDebitOuCredit() {
		return typeDebitOuCredit;
	}

	public void setTypeDebitOuCredit(String typeDebitOuCredit) {
		this.typeDebitOuCredit = typeDebitOuCredit;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Operation [dateOperation=" + dateOperation + ", compte=" + compte + ", montant=" + montant
				+ ", typeDebitOuCredit=" + typeDebitOuCredit + "]";
	}
}
