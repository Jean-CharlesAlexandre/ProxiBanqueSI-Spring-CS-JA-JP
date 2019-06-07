package org.formation.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIgnore;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Entity
public class Compte {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private Long numCompte;
	private String dateOuverture;
	private Double solde;

//	@OneToMany(mappedBy = "compte", cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
//	private List<Operation> listeOperations;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client clientAssocie;

//	public Compte(Long numCompte, String dateOuverture, Double solde, List<Operation> listeOperations,
//			Client clientAssocie) {
//		super();
//		this.numCompte = numCompte;
//		this.dateOuverture = dateOuverture;
//		this.solde = solde;
////		this.listeOperations = listeOperations;
//		this.clientAssocie = clientAssocie;
//	}

	public Compte() {
		super();
	}

	public Compte(Long numCompte, String dateOuverture, Double solde) {
		super();
		this.numCompte = numCompte;
		this.dateOuverture = dateOuverture;
		this.solde = solde;
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

//	public List<Operation> getListeOperations() {
//		return listeOperations;
//	}
//
//	public void setListeOperations(List<Operation> listeOperations) {
//		this.listeOperations = listeOperations;
//	}

	public Client getClientAssocie() {
		return clientAssocie;
	}

	public void setClientAssocie(Client clientAssocie) {
		this.clientAssocie = clientAssocie;
	}

	public Long getId() {
		return id;
	}

//	@Override
//	public String toString() {
//		return "Compte [numCompte=" + numCompte + ", dateOuverture=" + dateOuverture + ", solde=" + solde
//				+ ", listeOperations=" + listeOperations + ", clientAssocie=" + clientAssocie + "]";
//	}
}
