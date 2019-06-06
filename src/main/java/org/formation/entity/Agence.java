package org.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Agence {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String numAgence;
	private String dateCreation;

	public Agence(String numAgence, String dateCreation) {
		super();
		this.numAgence = numAgence;
		this.dateCreation = dateCreation;
	}

	public Agence() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumAgence() {
		return numAgence;
	}

	public void setNumAgence(String numAgence) {
		this.numAgence = numAgence;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Adresse [numAgence=" + numAgence + ", dateCreation=" + dateCreation + "]";
	}
}
