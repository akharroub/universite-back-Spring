package fr.akharroub.universite.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.akharroub.universite.etudiant.domain.Etudiant;
@Repository
public interface RepositoryEtudiant extends JpaRepository<Etudiant, Integer>{

}
