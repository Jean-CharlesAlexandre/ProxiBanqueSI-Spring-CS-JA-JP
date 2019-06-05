package org.formation.entity;

import java.util.List;

public class Client extends Personne {

	private List<Compte> listeComptes;
	private Conseiller conseiller;

	public Client(String mail, String telephone, Adresse adresse, List<Compte> listeComptes, Conseiller conseiller) {
		super(mail, telephone, adresse);
		this.listeComptes = listeComptes;
		this.conseiller = conseiller;
	}

	public List<Compte> getListeComptes() {
		return listeComptes;
	}

	public void setListeComptes(List<Compte> listeComptes) {
		this.listeComptes = listeComptes;
	}

	public Conseiller getConseiller() {
		return conseiller;
	}

	public void setConseiller(Conseiller conseiller) {
		this.conseiller = conseiller;
	}

	@Override
	public String toString() {
		return "Client [listeComptes=" + listeComptes + ", conseiller=" + conseiller + ", getMail()=" + getMail()
				+ ", getTelephone()=" + getTelephone() + ", getAdresse()=" + getAdresse() + "]";
	}
}
