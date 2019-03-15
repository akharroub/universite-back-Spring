package fr.akharroub.universite.note.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.akharroub.universite.etudiant.domain.Etudiant;
import fr.akharroub.universite.matiere.domain.Matiere;

@Entity
@Table(name="t_note")
public class Note implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7493757349962335931L;

	@EmbeddedId
	private NotePK notePK;
	
	@Column(name="note")
	private Double note;
	
	@ManyToOne
	@JoinColumn(name="id_etudiant", insertable = false, updatable = false)
	private Etudiant etudiant ;
	
	@ManyToOne
	@JoinColumn(name="id_matiere", insertable = false, updatable = false)
	private Matiere matiere;

	public NotePK getNotePK() {
		return notePK;
	}

	public void setNotePK(NotePK notePK) {
		this.notePK = notePK;
	}

	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}

	public Matiere getMatiere() {
		return matiere;
	}

	public void setMatiere(Matiere matiere) {
		this.matiere = matiere;
	}
	
}
