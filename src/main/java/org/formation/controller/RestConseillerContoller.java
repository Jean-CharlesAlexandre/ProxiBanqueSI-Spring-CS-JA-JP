package org.formation.controller;

import java.util.List;

import javax.websocket.server.PathParam;

import org.formation.entity.Client;
import org.formation.service.ConseillerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/clients")
public class RestConseillerContoller {

	@Autowired
	ConseillerService conseillerService;
	
	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping
	public Client createClient(@RequestBody Client client) {
		conseillerService.creerClient(client);
		return client;
	}
	
	@GetMapping("/{id}")
	public Client getClient(@PathVariable("id") Long id) {
		return conseillerService.recupererClientParId(id);
	}
	
	@ResponseStatus(code = HttpStatus.I_AM_A_TEAPOT)
	@DeleteMapping("/{id}")
	public Client deleteClient(@PathVariable("id") Long id) {
		Client client = conseillerService.recupererClientParId(id);
		conseillerService.supprimerClient(client);
		return client;
	}
	
	
	// /!\  A REVOIR 
	@ResponseStatus(code = HttpStatus.CREATED)
	@PutMapping("/{id}")
	public Client updateClient(@RequestBody Client client, @PathVariable("id") Long id) { //, @PathVariable("id") Long id) {
//		client.setId(id);
//		conseillerService.modifierClient(client);
//		Client clientAModif = conseillerService.recupererClientParId(id);
//		conseillerService.modifierClient(client);
//		client.setId(id);
		client.setId(id);
		return conseillerService.modifierClient(client);
	}
	
	@GetMapping
	public List<Client> getClients() {
		return conseillerService.recupererListeClients();
	}
	
	
//	@Autowired
//	ClientRepository clientRepository;
//
//	@Autowired
//	CompteRepository compteRepository;
//
//	@Autowired
//	ConseillerRepository conseillerRepository;
//
//	@Autowired
//	OperationRepository operationRepository;

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
