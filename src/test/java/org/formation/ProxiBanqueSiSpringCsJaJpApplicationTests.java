package org.formation;

import java.util.ArrayList;
import java.util.List;

import org.formation.entity.Adresse;
import org.formation.entity.CarteBancaire;
import org.formation.entity.Client;
import org.formation.entity.ClientEntreprise;
import org.formation.entity.ClientParticulier;
import org.formation.entity.CompteCourant;
import org.formation.entity.CompteEpargne;
import org.formation.entity.Conseiller;
import org.formation.entity.Gerant;
import org.formation.repository.GerantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxiBanqueSiSpringCsJaJpApplicationTests {

	@Autowired
	private GerantRepository repository;

	@Test
	void scenario() {

		CarteBancaire cb1 = new CarteBancaire("electron");
		CarteBancaire cb2 = new CarteBancaire("electron");
		CarteBancaire cb3 = new CarteBancaire("premier");
		CarteBancaire cb4 = new CarteBancaire("premier");
		CarteBancaire cb5 = new CarteBancaire("premier");

		CompteCourant cc1 = new CompteCourant(55L, "06/04", 500.0, cb1);
		
		CompteCourant cc2 = new CompteCourant(55L, "06/04", 500.0, cb2);
		CompteCourant cc3 = new CompteCourant(55L, "06/04", 500.0, cb3);
		CompteCourant cc4 = new CompteCourant(55L, "06/04", 500.0, cb4);
		CompteCourant cc5 = new CompteCourant(55L, "06/04", 500.0, cb5);

		CompteEpargne ce1 = new CompteEpargne(56L, "05/04", 1500.0);
		CompteEpargne ce2 = new CompteEpargne(56L, "05/04", 1500.0);
		CompteEpargne ce3 = new CompteEpargne(56L, "05/04", 1500.0);
		CompteEpargne ce4 = new CompteEpargne(56L, "05/04", 1500.0);
		CompteEpargne ce5 = new CompteEpargne(56L, "05/04", 1500.0);

		Adresse a = new Adresse("80", "rue des chiots", "75000", "Paris");

		Client cli1 = new ClientParticulier("je@fr", "0647", a, "ch", "lo");
		cli1.setCompteCourant(cc1);
		cli1.setCompteEpargne(ce1);
		cc1.setClientAssocie(cli1);
		ce1.setClientAssocie(cli1);
		
		Client cli2 = new ClientParticulier("je@fr", "0647", a, "ch", "lo");
		cli2.setCompteCourant(cc2);
		cc2.setClientAssocie(cli2);

		Client cli3 = new ClientParticulier("je@fr", "0647", a, "ch", "lo");
		cli3.setCompteEpargne(ce2);
		ce2.setClientAssocie(cli3);

		Client cli4 = new ClientParticulier("je@fr", "0647", a, "ch", "lo");
		cli4.setCompteCourant(cc3);
		cc3.setClientAssocie(cli4);

		Client cli5 = new ClientParticulier("je@fr", "0647", a, "ch", "lo");
		cli5.setCompteEpargne(ce3);
		ce3.setClientAssocie(cli5);

		Client cli6 = new ClientEntreprise("re@com", "0785", a, "HUMEX");
		cli6.setCompteCourant(cc4);
		cc4.setClientAssocie(cli6);

		Client cli7 = new ClientEntreprise("re@com", "0785", a, "HUMEX");
		cli7.setCompteEpargne(ce4);
		ce4.setClientAssocie(cli7);

		Client cli8 = new ClientEntreprise("re@com", "0785", a, "HUMEX");
		cli8.setCompteCourant(cc5);
		cli8.setCompteEpargne(ce5);
		cc5.setClientAssocie(cli8);
		ce5.setClientAssocie(cli8);

		List<Client> listCli1 = new ArrayList<Client>();
		listCli1.add(cli1);
		listCli1.add(cli2);
		listCli1.add(cli4);
		listCli1.add(cli7);

		List<Client> listCli2 = new ArrayList<Client>();
		listCli1.add(cli3);
		listCli1.add(cli5);
		listCli1.add(cli6);
		listCli1.add(cli8);

		Conseiller cons1 = new Conseiller("fe@de.com", "0985", a, "coucou", "coucou", "Damien","François");
		cons1.setListeClients(listCli1);
		cli1.setConseiller(cons1);
		cli2.setConseiller(cons1);
		cli4.setConseiller(cons1);
		cli7.setConseiller(cons1);

		Conseiller cons2 = new Conseiller("fe@de.com", "0985", a, "nba", "titles", "Damien","Françoise");
		cons2.setListeClients(listCli2);
		cli3.setConseiller(cons2);
		cli5.setConseiller(cons2);
		cli6.setConseiller(cons2);
		cli8.setConseiller(cons2);

		List<Conseiller> listCons = new ArrayList<Conseiller>();
		listCons.add(cons1);
		listCons.add(cons2);

		Gerant gerant1 = new Gerant("coucou@fr", "0185", a, "admin", "123", "Damien","Yves");
		gerant1.setListeConseillers(listCons);
		cons1.setGerant(gerant1);
		cons2.setGerant(gerant1);

		repository.save(gerant1);

	}

}
