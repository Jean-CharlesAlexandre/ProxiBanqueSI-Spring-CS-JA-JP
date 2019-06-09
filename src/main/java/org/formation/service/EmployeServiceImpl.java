package org.formation.service;

import org.formation.entity.Employe;
import org.formation.repository.EmployeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeServiceImpl implements EmployeService {

	@Autowired
	private EmployeRepository employeRepository;

	@Override
	public Employe trouverEmployeParIdentifiantEtMotDePasse(String identifiant, String motDePasse) {
		return employeRepository.findByIdentifiantAndMotDePasse(identifiant, motDePasse);
	}

}
