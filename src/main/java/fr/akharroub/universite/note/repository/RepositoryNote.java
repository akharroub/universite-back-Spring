package fr.akharroub.universite.note.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.akharroub.universite.note.domain.Note;
import fr.akharroub.universite.note.domain.NotePK;
@Repository
public interface RepositoryNote extends JpaRepository<Note, NotePK>{

}
