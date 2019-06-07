package org.formation.service;

import java.util.List;

import org.formation.entity.Conseiller;
import org.formation.entity.Gerant;
import org.formation.repository.ConseillerRepository;
import org.formation.repository.GerantRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GerantServiceImpl implements GerantService {

	private static final Logger LOGGER = LoggerFactory.getLogger(GerantServiceImpl.class);

	@Autowired
	private ConseillerRepository consRepository;

	@Autowired
	private GerantRepository gerantRepository;

	@Override
	public void creerConseiller(Conseiller cons) {
		if (cons != null) {
			consRepository.save(cons);
			LOGGER.info("Conseiller d'id " + cons.getId() + " a été créé");
		}
	}

	@Override
	public Conseiller recupererConseillerParId(Long id) {
		LOGGER.info("Conseiller d'id " + id + " a été récupéré");
		return consRepository.findById(id).get();
	}

	@Override
	public List<Conseiller> recupererListeConseillers() {
		LOGGER.info("Liste conseillers récuperée");
		return consRepository.findAll();
	}

	@Override
	public void creerGerant(Gerant gerant) {
		if (gerant != null) {
			gerantRepository.save(gerant);
			LOGGER.info("Gerant d'id " + gerant.getId() + " a été créé");
		}
	}

	@Override
	public Gerant recupererGerantParId(Long id) {
		LOGGER.info("Gerant d'id " + id + " a été récupéré");
		return gerantRepository.findById(id).get();
	}

}
