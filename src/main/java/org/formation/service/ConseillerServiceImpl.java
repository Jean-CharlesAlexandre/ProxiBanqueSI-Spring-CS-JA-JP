package org.formation.service;

import org.formation.entity.Client;
import org.formation.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConseillerServiceImpl implements ConseillerService {

	@Autowired
	ClientRepository clientRepository;
	
	@Override
	public Client creerClient(Client client) {
		return clientRepository.save(client);
	}

}
