package org.formation.service;

import java.util.List;

import org.formation.entity.Client;

public interface ConseillerService {

	public void creerClient(Client client);
	
	public Client recupererClientParId(Long id);

	public void modifierClient(Client client);
	
	public void supprimerClient(Client client);
	
	public List<Client> recupererListeClients();
	
}
