package fr.akharroub.universite.matiere.controller;

import java.util.List;

import fr.akharroub.universite.matiere.domain.Matiere;

public interface IControllerMatiere {
	
	public List<Matiere> findAll();
	
	public Matiere findOne(Integer id);
	
	public Matiere save(Matiere matiere);
	
	public Matiere update(Matiere matiere, Integer id);
	
	public void delete(Integer id);

}
