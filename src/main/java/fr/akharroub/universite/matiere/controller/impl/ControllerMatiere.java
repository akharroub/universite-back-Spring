package fr.akharroub.universite.matiere.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.akharroub.universite.matiere.controller.IControllerMatiere;
import fr.akharroub.universite.matiere.domain.Matiere;
import fr.akharroub.universite.matiere.service.impl.ServiceMatiere;
@RestController
public class ControllerMatiere implements IControllerMatiere{

	@Autowired
	ServiceMatiere ControllerMatiere;
	
	@Override
	@GetMapping("/matieres")
	public List<Matiere> findAll() {
		List<Matiere> liste = ControllerMatiere.findAll();
		return liste;
	}

	@Override
	@GetMapping("/matieres/{id}")
	public Matiere findOne(@PathVariable Integer id) {
		Matiere m = ControllerMatiere.findOne(id);
		return m;
	}

	@Override
	@PostMapping("/matieres")
	public Matiere save( @RequestBody Matiere matiere) {
		Matiere mt = ControllerMatiere.ajouterMatiere(matiere);
		return mt;
	}

	@Override
	@PutMapping("/matieres/{id}")
	public Matiere update(@RequestBody Matiere matiere,@PathVariable Integer id) {
		matiere.setId(id);
		Matiere ma = ControllerMatiere.modifierMatiere(matiere);
		return ma;
	}

	@Override
	@DeleteMapping("/matieres/{id}")
	public void delete( @PathVariable Integer id) {
		ControllerMatiere.supprimerMatiere(id);


		
	}

	

}
