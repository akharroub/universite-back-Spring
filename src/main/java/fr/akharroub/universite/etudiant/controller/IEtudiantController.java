package fr.akharroub.universite.etudiant.controller;

import java.util.List;

import fr.akharroub.universite.etudiant.domain.Etudiant;

public interface IEtudiantController {
	
	public List<Etudiant> findAll();
	
	public Etudiant findOne(Integer id);
	
	public Etudiant save(Etudiant etudiant);
	
	public void delete(Integer id);
	
	public Etudiant update(Etudiant etudiant,Integer id);

}
