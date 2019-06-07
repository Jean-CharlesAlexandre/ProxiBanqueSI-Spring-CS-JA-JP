package org.formation.entity;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Personne {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String email;
	private String telephone;
	
	@Embedded
	private Adresse adresse;

	public Personne(String email, String telephone, Adresse adresse) {
		super();
		this.email = email;
		this.telephone = telephone;
		this.adresse = adresse;
	}
	
	public Personne(String email, String telephone) {
		super();
		this.email = email;
		this.telephone = telephone;
	}

	public Personne() {
		super();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
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
	
	public void setId(Long id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Personne [mail=" + email + ", telephone=" + telephone + ", adresse=" + adresse + "]";
	}
}
