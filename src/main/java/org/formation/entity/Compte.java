package org.formation.entity;

import java.util.List;

public class Compte {

	private Long id;
	private Long numCompte;
	private String dateOuverture;
	private Double solde;
	private List<Operation> listeOperations;
	private Client clientAssocie;

	public Compte(Long numCompte, String dateOuverture, Double solde, List<Operation> listeOperations,
			Client clientAssocie) {
		super();
		this.numCompte = numCompte;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
		this.listeOperations = listeOperations;
		this.clientAssocie = clientAssocie;
	}

	public Long getNumCompte() {
		return numCompte;
	}

	public void setNumCompte(Long numCompte) {
		this.numCompte = numCompte;
	}

	public String getDateOuverture() {
		return dateOuverture;
	}

	public void setDateOuverture(String dateOuverture) {
		this.dateOuverture = dateOuverture;
	}

	public Double getSolde() {
		return solde;
	}

	public void setSolde(Double solde) {
		this.solde = solde;
	}

	public List<Operation> getListeOperations() {
		return listeOperations;
	}

	public void setListeOperations(List<Operation> listeOperations) {
		this.listeOperations = listeOperations;
	}

	public Client getClientAssocie() {
		return clientAssocie;
	}

	public void setClientAssocie(Client clientAssocie) {
		this.clientAssocie = clientAssocie;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Compte [numCompte=" + numCompte + ", dateOuverture=" + dateOuverture + ", solde=" + solde
				+ ", listeOperations=" + listeOperations + ", clientAssocie=" + clientAssocie + "]";
	}
}
