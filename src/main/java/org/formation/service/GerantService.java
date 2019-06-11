package org.formation.service;

import java.util.List;

import org.formation.entity.Conseiller;
import org.formation.entity.Gerant;

public interface GerantService {

	public void creerConseiller(Conseiller cons);
	
	public void updateConseiller(Conseiller cons);

	public Conseiller recupererConseillerParId(Long id);

	public List<Conseiller> recupererListeConseillers();
	
	public Conseiller modifierConseiller(Conseiller conseiller);
	
	public void creerGerant(Gerant gerant);
	
	public Gerant recupererGerantParId(Long id);

}
