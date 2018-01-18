package org.stepsrl.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import java.util.List;


/**
 * The persistent class for the corsi_di_laurea database table.
 * 
 */
@Entity
@Table(name="corsi_di_laurea")
@NamedQuery(name="CorsiDiLaurea.findAll", query="SELECT c FROM CorsiDiLaurea c")
public class CorsiDiLaurea implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="CORSO_DI_STUDIO")
	private String corsoDiStudio;

	@OneToMany(mappedBy="corsiDiLaurea")
	@JsonManagedReference
	private List<CorsoDiLaureaSpecifico> corsoDiLaureaSpecificos;

	public CorsiDiLaurea() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorsoDiStudio() {
		return this.corsoDiStudio;
	}

	public void setCorsoDiStudio(String corsoDiStudio) {
		this.corsoDiStudio = corsoDiStudio;
	}

	public List<CorsoDiLaureaSpecifico> getCorsoDiLaureaSpecificos() {
		return this.corsoDiLaureaSpecificos;
	}

	public void setCorsoDiLaureaSpecificos(List<CorsoDiLaureaSpecifico> corsoDiLaureaSpecificos) {
		this.corsoDiLaureaSpecificos = corsoDiLaureaSpecificos;
	}

	public CorsoDiLaureaSpecifico addCorsoDiLaureaSpecifico(CorsoDiLaureaSpecifico corsoDiLaureaSpecifico) {
		getCorsoDiLaureaSpecificos().add(corsoDiLaureaSpecifico);
		corsoDiLaureaSpecifico.setCorsiDiLaurea(this);

		return corsoDiLaureaSpecifico;
	}

	public CorsoDiLaureaSpecifico removeCorsoDiLaureaSpecifico(CorsoDiLaureaSpecifico corsoDiLaureaSpecifico) {
		getCorsoDiLaureaSpecificos().remove(corsoDiLaureaSpecifico);
		corsoDiLaureaSpecifico.setCorsiDiLaurea(null);

		return corsoDiLaureaSpecifico;
	}

}