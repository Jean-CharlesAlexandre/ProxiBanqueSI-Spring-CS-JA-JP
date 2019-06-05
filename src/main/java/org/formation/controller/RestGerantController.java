package org.formation.controller;

import org.formation.repository.AgenceRepository;
import org.formation.repository.ConseillerRepository;
import org.formation.repository.GerantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clients")
@CrossOrigin("http://localhost:4200")
public class RestGerantController {

	@Autowired
	AgenceRepository agenceRepository;

	@Autowired
	ConseillerRepository conseillerRepository;

	@Autowired
	GerantRepository gerantRepository;

}
