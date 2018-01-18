package org.stepsrl.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the anagrafica_studente database table.
 * 
 */
@Entity
@Table(name="anagrafica_studente")
@NamedQuery(name="AnagraficaStudente.findAll", query="SELECT a FROM AnagraficaStudente a")
public class AnagraficaStudente implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	private String citta;

	@Column(name="codice_postale")
	private String codicePostale;

	private String stato;

	//bi-directional one-to-one association to Studenti
	@OneToOne(mappedBy="anagraficaStudente")
	private Studenti studenti;

	public AnagraficaStudente() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getcitta() {
		return this.citta;
	}

	public void setcitta(String citta) {
		this.citta = citta;
	}

	public String getCodicePostale() {
		return this.codicePostale;
	}

	public void setCodicePostale(String codicePostale) {
		this.codicePostale = codicePostale;
	}

	public String getStato() {
		return this.stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}

	public Studenti getStudenti() {
		return this.studenti;
	}

	public void setStudenti(Studenti studenti) {
		this.studenti = studenti;
	}

}