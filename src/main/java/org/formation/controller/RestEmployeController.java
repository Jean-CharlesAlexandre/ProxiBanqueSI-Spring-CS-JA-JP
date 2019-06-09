package org.formation.controller;

import org.formation.entity.Client;
import org.formation.entity.Employe;
import org.formation.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/employes")
public class RestEmployeController {

	@Autowired
	EmployeService employeService;
	
	@GetMapping("/{identifiant}/{motDePasse}")
	public Long getClient(@PathVariable("identifiant") String identifiant, @PathVariable("motDePasse") String motDePasse) {
		Long idEmploye = 0L;
		Employe e = employeService.trouverEmployeParIdentifiantEtMotDePasse(identifiant, motDePasse);
		if(e!=null) {
			idEmploye = e.getId();
		}
		return idEmploye;
	}
	
}
