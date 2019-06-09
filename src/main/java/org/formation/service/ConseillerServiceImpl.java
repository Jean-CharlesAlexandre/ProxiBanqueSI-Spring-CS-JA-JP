package org.formation.service;

import java.util.List;

import org.formation.entity.Client;
import org.formation.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ConseillerServiceImpl implements ConseillerService {

	private static final Logger LOGGER = LoggerFactory.getLogger(GerantServiceImpl.class);

	@Autowired
	ClientRepository clientRepository;

	@Override
	public void creerClient(Client client) {
		if (client != null) {
			clientRepository.save(client);
			LOGGER.info("Client d'id " + client.getId() + " a été créé");
		}
	}

	@Override
	public Client recupererClientParId(Long id) {
		LOGGER.info("Client d'id " + id + " a été récupéré");
		return clientRepository.findById(id).get();

	}

	@Override
	public Client modifierClient(Client client) {
		LOGGER.info("Client d'id " + client.getId() + " a été modifié");
		return clientRepository.save(client);
	}

	@Override
	public void supprimerClient(Client client) {
		clientRepository.delete(client);
		LOGGER.info("Client d'id " + client.getId() + " a été supprimé");

	}

	@Override
	public List<Client> recupererListeClients() {
		LOGGER.info("Liste conseillers récuperée");
		return clientRepository.findAll();
	}

}
