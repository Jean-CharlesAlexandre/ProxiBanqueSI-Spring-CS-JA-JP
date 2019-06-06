package org.formation.entity;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
//@DiscriminatorColumn(name = "TypeClient", discriminatorType = DiscriminatorType.STRING)
public class Client extends Personne {

	@OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
	private List<Compte> listeComptes;
	
	private Conseiller conseiller;

	public Client(String mail, String telephone, Adresse adresse, List<Compte> listeComptes, Conseiller conseiller) {
		super(mail, telephone, adresse);
		this.listeComptes = listeComptes;
		this.conseiller = conseiller;
	}
	
	public Client(String mail, String telephone, Adresse adresse) {
		super(mail, telephone, adresse);
	}
	
	public Client() {
		super();
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
