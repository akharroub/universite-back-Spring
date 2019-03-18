package fr.akharroub.universite.matiere.domain;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import fr.akharroub.universite.enseignant.domain.Enseignant;
import fr.akharroub.universite.note.domain.Note;

@Entity
@Table(name="t_matiere")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class Matiere implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6404106078661177786L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	
	@Column(name="id")
	private Integer id;
	
	@Column(name="numero")
	private Integer numero ;
	
	@Column(name="nom")
	private String nom ;
	
	@Column(name="coef")
	private Integer coef;
	
	@ManyToOne
	@JoinColumn(name="id_enseignant")
	private Enseignant enseignant;
	
	@OneToMany(mappedBy="matiere")
	@JsonIgnore
	private List<Note> notes ;

	public Integer getId() {
		return id;
	}

	public List<Note> getNotes() {
		return notes;
	}

	public void setNotes(List<Note> notes) {
		this.notes = notes;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Enseignant getEnseignant() {
		return enseignant;
	}

	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Integer getCoef() {
		return coef;
	}

	public void setCoef(Integer coef) {
		this.coef = coef;
	}
	

}
