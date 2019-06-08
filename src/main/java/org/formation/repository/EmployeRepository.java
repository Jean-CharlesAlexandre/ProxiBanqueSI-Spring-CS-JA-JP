package org.formation.repository;

import org.formation.entity.Employe;
import org.formation.entity.Personne;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeRepository extends JpaRepository<Employe, Long> {
	
	public Employe findByIdentifiantAndMotDePasse(String identifiant, String motDePasse);

}
