package fr.akharroub.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.akharroub.universite.note.controller.IControllerNote;
import fr.akharroub.universite.note.domain.Note;
import fr.akharroub.universite.note.service.impl.ServiceNote;
@RestController
public class ControllerNote implements IControllerNote{

	@Autowired
	ServiceNote controllernote;
	
	@Override
	@GetMapping("/notes")
	public List<Note> findeAll() {
		List<Note> liste = controllernote.findAll();
		return liste;
	}

	@Override
	@GetMapping("/notes/{idMatiere}/{idEtudiant}")
	public Note findOne(@PathVariable Integer idMatiere,@PathVariable Integer idEtudiant) {
		Note n =  controllernote.findOne(idMatiere, idEtudiant);
		return n;
	}

	@Override
	@PostMapping("/notes")
	public Note save(@RequestBody Note note) {
		Note n = controllernote.save(note);
		return n;
	}

}
