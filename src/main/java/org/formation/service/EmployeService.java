package org.formation.service;

import org.formation.entity.Employe;

public interface EmployeService {
	
	public Employe trouverEmployeParIdentifiantEtMotDePasse(String identifiant, String motDePasse);

}
