package org.formation.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Conseiller extends Employe {

	@OneToMany(mappedBy = "conseiller", cascade = { CascadeType.PERSIST })
	private List<Client> listeClients;

	@ManyToOne
	@JoinColumn(name = "gerant_id")
	private Gerant gerant;

	public Conseiller(String mail, String telephone, Adresse adresse, String identifiant, String motDePasse, String nom,
			String prenom) {
		super(mail, telephone, adresse, identifiant, motDePasse, nom, prenom);
	}

	public Conseiller() {
		super();
	}

	public List<Client> getListeClients() {
		return listeClients;
	}

	public void setListeClients(List<Client> listeClients) {
		this.listeClients = listeClients;
	}

	public Gerant getGerant() {
		return gerant;
	}

	public void setGerant(Gerant gerant) {
		this.gerant = gerant;
	}

	@Override
	public String toString() {
		return "Conseiller [listeClients=" + listeClients + ", gerant=" + gerant + ", getIdentifiant()="
				+ getIdentifiant() + ", getMotDePasse()=" + getMotDePasse() + ", getMail()=" + getMail()
				+ ", getTelephone()=" + getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
