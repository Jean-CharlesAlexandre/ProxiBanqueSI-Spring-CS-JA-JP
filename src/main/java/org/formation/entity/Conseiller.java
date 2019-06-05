package org.formation.entity;

import java.util.List;

public class Conseiller extends Employe {

	private List<Client> listeClients;
	private Gerant gerant;

	public Conseiller(String mail, String telephone, Adresse adresse, String identifiant, String motDePasse,
			List<Client> listeClients, Gerant gerant) {
		super(mail, telephone, adresse, identifiant, motDePasse);
		this.listeClients = listeClients;
		this.gerant = gerant;
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
