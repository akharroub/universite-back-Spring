package fr.akharroub.universite.enseignant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.akharroub.universite.enseignant.domain.Enseignant;

@Repository
public interface RepositoryEnseignant extends JpaRepository<Enseignant, Integer>{

}
