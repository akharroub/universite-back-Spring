package fr.akharroub.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.akharroub.universite.matiere.domain.Matiere;

@Repository
public interface RepositoryMatiere extends JpaRepository<Matiere, Integer>{

}
