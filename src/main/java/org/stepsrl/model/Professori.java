package org.stepsrl.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the professori database table.
 * 
 */
@Entity
@NamedQuery(name="Professori.findAll", query="SELECT p FROM Professori p")
public class Professori implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String cognome;

	private String materia;

	private String nome;

	public Professori() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCognome() {
		return this.cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	public String getMateria() {
		return this.materia;
	}

	public void setMateria(String materia) {
		this.materia = materia;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}