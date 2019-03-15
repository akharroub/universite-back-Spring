package fr.akharroub.universite.note.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;


@Embeddable
public class NotePK implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -8334815162066288070L;

	@Column(name="id_etudiant")
	private Integer etudiant;
	
	@Column(name="id_matiere")
	private Integer matiere;

	public Integer getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Integer etudiant) {
		this.etudiant = etudiant;
	}

	public Integer getMatiere() {
		return matiere;
	}

	public void setMatiere(Integer matiere) {
		this.matiere = matiere;
	}
	
}
