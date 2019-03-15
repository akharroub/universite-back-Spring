package fr.akharroub.universite.etudiant.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.akharroub.universite.etudiant.controller.IEtudiantController;
import fr.akharroub.universite.etudiant.domain.Etudiant;
import fr.akharroub.universite.etudiant.service.impl.ServiceEtudiant;
@RestController
public class EtudiantController implements IEtudiantController{

	@Autowired
	ServiceEtudiant controllerEtudiant;
	
	@Override
	@GetMapping("/etudiants")
	public List<Etudiant> findAll() {
		List<Etudiant> liste = controllerEtudiant.getAll();
		return liste;
	}

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiant findOne( @PathVariable Integer id) {
		Etudiant et = controllerEtudiant.getOne(id);
		return et;
	}

	@Override
	@PostMapping("/etudiants")
	public Etudiant save( @RequestBody Etudiant etudiant) {
		Etudiant u = controllerEtudiant.ajouteretudiantV(etudiant);
		return u;
	}

}
