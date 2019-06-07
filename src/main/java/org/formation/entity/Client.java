package org.formation.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlTransient;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Client extends Personne {

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "compteCourant_id")
	private CompteCourant compteCourant;

	@OneToOne(cascade = { CascadeType.PERSIST, CascadeType.REMOVE })
	@JoinColumn(name = "compteEpargne_id")
	private CompteEpargne compteEpargne;

	@JsonIgnore
	@ManyToOne
	@JoinColumn(name = "conseiller_id")
	private Conseiller conseiller;

	public Client(String mail, String telephone, Adresse adresse) {
		super(mail, telephone, adresse);
	}

	public Client() {
		super();
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	public CompteCourant getCompteCourant() {
		return compteCourant;
	}

	public void setCompteCourant(CompteCourant compteCourant) {
		this.compteCourant = compteCourant;
	}

	public CompteEpargne getCompteEpargne() {
		return compteEpargne;
	}

	public void setCompteEpargne(CompteEpargne compteEpargne) {
		this.compteEpargne = compteEpargne;
	}

	public void setId(Long id) {		
	}
	
	@Override
	public String toString() {
		return "Client [compteCourant=" + compteCourant + ", compteEpargne=" + compteEpargne + ", conseiller="
				+ conseiller + ", getMail()=" + getMail() + ", getTelephone()=" + getTelephone() + ", getAdresse()="
				+ getAdresse() + "]";
	}


}
