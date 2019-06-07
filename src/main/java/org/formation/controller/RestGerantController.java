package org.formation.controller;

import java.util.List;

import org.formation.entity.Conseiller;
import org.formation.entity.Gerant;
import org.formation.service.GerantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin("http://localhost:4200")
@RestController
@RequestMapping("/gerants")
public class RestGerantController {

	@Autowired
	GerantService gerantService;

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/conseillers")
	public Conseiller creerConseiller(@RequestBody Conseiller conseiller) {
		gerantService.creerConseiller(conseiller);
		return conseiller;
	}

	@GetMapping("/conseillers/{id}")
	public Conseiller recupererConseillerParId(@PathVariable("id") Long id) {
		return gerantService.recupererConseillerParId(id);
	}

	@GetMapping("/conseillers")
	public List<Conseiller> recupererListeConseillers() {
		return gerantService.recupererListeConseillers();
	}

	@ResponseStatus(code = HttpStatus.CREATED)
	@PostMapping("/")
	public Gerant creerGerant(@RequestBody Gerant gerant) {
		gerantService.creerGerant(gerant);
		return gerant;
	}

	@GetMapping("/{id}")
	public Gerant recupererGerantParId(@PathVariable("id") Long id) {
		return gerantService.recupererGerantParId(id);
	}

}
