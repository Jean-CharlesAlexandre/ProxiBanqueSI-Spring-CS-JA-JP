package org.formation.service;

import java.util.List;

import org.formation.entity.Client;
import org.formation.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public void creerClient(Client client) {
		if( client != null) {
		clientRepository.save(client);
		}
	}

	@Override
	public Client recupererClientParId(Long id) {
		return clientRepository.findById(id).get();
	}

	@Override
	public void modifierClient(Client client) {
		clientRepository.save(client);
	}

	@Override
	public void supprimerClient(Client client) {
		clientRepository.delete(client);
		
	}

	@Override
	public List<Client> recupererListeClients() {
		return clientRepository.findAll();
	}
	
	
	

}
