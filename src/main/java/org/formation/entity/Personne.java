package org.formation.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String mail;
	private String telephone;
	
	@Embedded
	private Adresse adresse;

	public Personne(String mail, String telephone, Adresse adresse) {
		super();
		this.mail = mail;
		this.telephone = telephone;
		this.adresse = adresse;
	}
	
	public Personne(String mail, String telephone) {
		super();
		this.mail = mail;
		this.telephone = telephone;
	}

	public Personne() {
		super();
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Personne [mail=" + mail + ", telephone=" + telephone + ", adresse=" + adresse + "]";
	}
}
