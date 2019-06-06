package org.formation;

import org.formation.entity.Personne;
import org.formation.repository.ClientRepository;
import org.formation.repository.PersonneRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;

@SpringBootTest
class ProxiBanqueSiSpringCsJaJpApplicationTests {

	@Autowired
	private PersonneRepository repository;
	
	@Test
	void createClient() {
		
		Personne p = new Personne("personne@mail.com", "0659631456");
		repository.save(p);
		
//		Adresse a = new Adresse("8","rue saint louis", "64000", "Biarritz");
//		Client clientP = new Client("clientp@mail.com", "0659642536"); // "Spinnato", "Chloé");
//		repository.save(clientP);
//		System.out.println("////////////////////////////////////////////ca marche");
		
	}

	
//	@Autowired
//	private ClientRepository repository;
//
//	@Test
//	void createClient() {
//		Client c = new Client();
//		c.setAge(66);
//		c.setFirstname("Bob");
//		c.setLastname("Bullet");	
//		repository.save(c);
//
//	}
//	@Test
//	public void testFindClientById() {
//		Client c = repository.findById(1L).get();
//	}
//	
//	@Test
//	public void testUpdateClient() {
//		Client c = repository.findById(1L).get();
//		c.setAge(33);
//		repository.save(c);
//	}
//	
//	@Test
//	public void testDeleteClient() {
//		Client c = new Client();
//		c.setId(1l);
//		repository.delete(c);
//	}
//
//	@Test
//	public void testFindClient() {
//		Client c = new Client();
//		c.setFirstname("Bob");
//		c.setLastname("Bullet");
//		Client c2 = new Client();
//		c2.setFirstname("Jane");
//		c2.setLastname("Bullet");
//		repository.save(c);
//		repository.save(c2);
//		List<Client> l = repository.findByLastname("Bullet");
//		//Assert.isTrue(l.size()==2, " two bullet ");
//	}
//
//	@Test
//	public void testFindClientByAge() {
//		Client c = new Client();
//		c.setFirstname("Bob");
//		c.setLastname("B");
//		c.setAge(100);
//		Client c2 = new Client();
//		c2.setFirstname("Jane");
//		c2.setLastname("bb");
//		c2.setAge(100);
//		repository.save(c);
//		repository.save(c2);
//		List<Client> l = repository.findByAge(100);
//		//Assert.isTrue(l.size()==2, " two bullet ");
//	}
//

}
