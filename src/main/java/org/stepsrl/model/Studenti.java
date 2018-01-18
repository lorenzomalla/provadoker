package org.stepsrl.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the studenti database table.
 * 
 */
@Entity
@NamedQuery(name="Studenti.findAll", query="SELECT s FROM Studenti s")
public class Studenti implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String cognome;

	@Column(name="corso_di_laurea")
	private String corsoDiLaurea;

	private String email;

	private int eta;

	private String nome;

	//bi-directional one-to-one association to User
	@OneToOne
	@JoinColumn(name="id_user")
	@JsonIgnore
	private User user;

	//bi-directional one-to-one association to AnagraficaStudente
	@OneToOne
	@JoinColumn(name="id", referencedColumnName="id_studente")
	private AnagraficaStudente anagraficaStudente;

	public Studenti() {
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

	public String getCorsoDiLaurea() {
		return this.corsoDiLaurea;
	}

	public void setCorsoDiLaurea(String corsoDiLaurea) {
		this.corsoDiLaurea = corsoDiLaurea;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getEta() {
		return this.eta;
	}

	public void setEta(int eta) {
		this.eta = eta;
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public AnagraficaStudente getAnagraficaStudente() {
		return this.anagraficaStudente;
	}

	public void setAnagraficaStudente(AnagraficaStudente anagraficaStudente) {
		this.anagraficaStudente = anagraficaStudente;
	}

}