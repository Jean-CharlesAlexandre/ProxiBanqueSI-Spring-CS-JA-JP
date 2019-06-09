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
import org.formation.repository.EmployeRepository;
import org.formation.repository.GerantRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ProxiBanqueSiSpringCsJaJpApplicationTests {

	@Autowired
	private GerantRepository repository;
	
	@Autowired
	private EmployeRepository employeRepository;

	@Test
	void scenario() {

		CarteBancaire cb1 = new CarteBancaire("Electron");
		CarteBancaire cb2 = new CarteBancaire("Electron");
		CarteBancaire cb3 = new CarteBancaire("Premier");
		CarteBancaire cb4 = new CarteBancaire("Premier");
		CarteBancaire cb5 = new CarteBancaire("Premier");

		CompteCourant cc1 = new CompteCourant(24154754L, "06/04/12", 543.21, cb1, 500);
		CompteCourant cc2 = new CompteCourant(65214785L, "08/05/13", 654.32, cb2, 3000);
		CompteCourant cc3 = new CompteCourant(10235478L, "09/06/14", 765.43, cb3, 1000);
		CompteCourant cc4 = new CompteCourant(98547125L, "10/07/15", 876.54, cb4, 200);
		CompteCourant cc5 = new CompteCourant(65214708L, "11/08/16", 987.65, cb5, 0);

		CompteEpargne ce1 = new CompteEpargne(98563241L, "12/09/17", 1098.76, 0.05);
		CompteEpargne ce2 = new CompteEpargne(20321457L, "13/10/18", 2109.87, 0.02);
		CompteEpargne ce3 = new CompteEpargne(65742589L, "14/11/12", 3210.98, 0.01);
		CompteEpargne ce4 = new CompteEpargne(12453658L, "15/12/13", 4321.09, 0.04);
		CompteEpargne ce5 = new CompteEpargne(54632541L, "16/01/14", 5432.10, 0.03);

		Adresse a1 = new Adresse("1", "rue des chiots", "11000", "Paris");
		Adresse a2 = new Adresse("3", "allée des chats", "22000", "Bordeaux");
		Adresse a3 = new Adresse("5", "boulevard des rats", "33000", "Marseille");
		Adresse a4 = new Adresse("7bis", "avenue des oiseaux", "44000", "Lyon");
		Adresse a5 = new Adresse("9", "chemin des canards", "55000", "Toulouse");
		Adresse a6 = new Adresse("11", "allée des souris", "66000", "Brest");
		Adresse a7 = new Adresse("13", "boulevard des tortues", "77000", "Montpellier");
		Adresse a8 = new Adresse("15ter", "avenue des singes", "88000", "Nantes");
		Adresse a9 = new Adresse("17", "chemin des sauterelles", "99000", "Rennes");
		Adresse a10 = new Adresse("19", "rue des renards", "13000", "Lille");
		Adresse a11 = new Adresse("21", "allée des écureuils", "24000", "Strasbourg");

		Client cli1 = new ClientParticulier("albert.einstein@fr", "0123456789", a1, "EINSTEIN", "Albert");
		cli1.setCompteCourant(cc1);
		cli1.setCompteEpargne(ce1);
		cc1.setClientAssocie(cli1);
		ce1.setClientAssocie(cli1);

		Client cli2 = new ClientParticulier("antoine.lavoisier@fr", "0234567890", a2, "LAVOISIER", "Antoine");
		cli2.setCompteCourant(cc2);
		cc2.setClientAssocie(cli2);

		Client cli3 = new ClientParticulier("marie.curie@fr", "0345678901", a3, "CURIE", "Marie");
		cli3.setCompteEpargne(ce2);
		ce2.setClientAssocie(cli3);

		Client cli4 = new ClientParticulier("isaac.newton@fr", "0456789012", a4, "NEWTON", "Isaac");
		cli4.setCompteCourant(cc3);
		cc3.setClientAssocie(cli4);

		Client cli5 = new ClientParticulier("alfred.noble@fr", "0567890123", a5, "NOBEL", "Alfred");
		cli5.setCompteEpargne(ce3);
		ce3.setClientAssocie(cli5);

		Client cli6 = new ClientEntreprise("google@com", "0678901234", a6, "GOOGLE");
		cli6.setCompteCourant(cc4);
		cc4.setClientAssocie(cli6);

		Client cli7 = new ClientEntreprise("apple@com", "0789012345", a7, "APPLE");
		cli7.setCompteEpargne(ce4);
		ce4.setClientAssocie(cli7);

		Client cli8 = new ClientEntreprise("amazon@com", "0890123456", a8, "AMAZON");
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

		Conseiller cons1 = new Conseiller("louis.pasteur@proxibanque.fr", "0901234567", a9, "cons1", "cons1u",
				"PASTEUR", "Louis");
		cons1.setListeClients(listCli1);
		cli1.setConseiller(cons1);
		cli2.setConseiller(cons1);
		cli4.setConseiller(cons1);
		cli7.setConseiller(cons1);

		Conseiller cons2 = new Conseiller("charles.darwin@proxibanque.fr", "0134679013", a10, "cons2", "cons2",
				"DARWIN", "Charles");
		cons2.setListeClients(listCli2);
		cli3.setConseiller(cons2);
		cli5.setConseiller(cons2);
		cli6.setConseiller(cons2);
		cli8.setConseiller(cons2);

		List<Conseiller> listCons = new ArrayList<Conseiller>();
		listCons.add(cons1);
		listCons.add(cons2);

		Gerant gerant1 = new Gerant("nicolas.tesla@proxibanque.fr", "0357913579", a11, "admin", "admin", "TESLA",
				"Nicolas");
		gerant1.setListeConseillers(listCons);
		cons1.setGerant(gerant1);
		cons2.setGerant(gerant1);

		repository.save(gerant1);

	}

}
