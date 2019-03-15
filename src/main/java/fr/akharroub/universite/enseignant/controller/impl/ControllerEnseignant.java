package fr.akharroub.universite.enseignant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.akharroub.universite.enseignant.controller.IControllerEnseignant;
import fr.akharroub.universite.enseignant.domain.Enseignant;
import fr.akharroub.universite.enseignant.service.impl.ServiceEnseignant;

@RestController
public class ControllerEnseignant implements IControllerEnseignant{
	
	Logger log = LoggerFactory.getLogger(ControllerEnseignant.class);

	@Autowired
	ServiceEnseignant controllerEnseignant;
	
	@Override
	@GetMapping("/enseignants")
	public List<Enseignant> findAll() {
		List<Enseignant> liste = controllerEnseignant.findAll();
		
		log.info("nombre des enseignants : {}", liste.size());
		
		return liste;
	}

	@Override
	@GetMapping("/enseignants/{id}")
	public Enseignant findOne( @PathVariable Integer id) {
		Enseignant n = controllerEnseignant.getOne(id);
		return n;
	}

	@Override
	@PostMapping("/enseignants")
	public Enseignant save( @RequestBody Enseignant enseignant) {
		Enseignant e = controllerEnseignant.ajouterEnseignantVD(enseignant);
		return e;
	}

	@Override
	@DeleteMapping("/enseignants/{id}")
	public void delete( @PathVariable Integer id) {
		controllerEnseignant.supprimerEnseignant(id);
		
	}

	@Override
	@PutMapping("/enseignants/{id}")
	public Enseignant update( @RequestBody Enseignant enseignant,@PathVariable Integer id) {
		enseignant.setId(id);
		Enseignant en = controllerEnseignant.modifierEnseignant(enseignant);
		return en;
	}

}
