package fr.akharroub.universite.note.controller;

import java.util.List;

import fr.akharroub.universite.note.domain.Note;

public interface IControllerNote {
	
	public List<Note> findeAll();
	
	public Note findOne(Integer idMatiere, Integer idEtudiant);
	
	public Note save(Note note);

}
