package fr.akharroub.universite.enseignant.controller;

import java.util.List;

import fr.akharroub.universite.enseignant.domain.Enseignant;

public interface IControllerEnseignant {

	public List<Enseignant> findAll();
	
	public  Enseignant findOne(Integer id);
	
	public Enseignant save(Enseignant enseignant);
	
	public void delete(Integer id);
	
	public Enseignant update(Enseignant enseignant, Integer id);
}
