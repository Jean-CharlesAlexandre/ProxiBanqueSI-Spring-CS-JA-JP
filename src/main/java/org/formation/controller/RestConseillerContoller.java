package org.formation.controller;

import org.formation.repository.ClientRepository;
import org.formation.repository.CompteRepository;
import org.formation.repository.ConseillerRepository;
import org.formation.repository.OperationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@CrossOrigin("http://localhost:4200")
public class RestConseillerContoller {

	@Autowired
	ClientRepository clientRepository;

	@Autowired
	CompteRepository compteRepository;

	@Autowired
	ConseillerRepository conseillerRepository;

	@Autowired
	OperationRepository operationRepository;

//	@GetMapping
//	public List<Client> getClients() {
//		System.out.println("//////////////////////////////////////////////////////");
//		return clientRepository.findAll();
//	}
//
//	@PostMapping
//	public Client createClient(@RequestBody Client client) {
//		System.out.println("///////////////////////////POST///////////////////////////");
//		return clientRepository.save(client);
//	}
//
//	@PutMapping
////	@CrossOrigin(origins = "*", methods = RequestMethod.PUT, allowedHeaders = "*")
//	public Client updateClient(@RequestBody Client client) {
//		System.out.println("///////////////////////////PUT///////////////////////////");
//		return clientRepository.save(client);
//
//	}
//
//	@DeleteMapping("/{id}")
//	public void deleteClient(@PathVariable("id") Long id) {
//		clientRepository.deleteById(id);
//	}
//
//	@GetMapping("/{id}")
//	public Client getClient(@PathVariable("id") Long id) {
//		return clientRepository.findById(id).get();
//	}
}
