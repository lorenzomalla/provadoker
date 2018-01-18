package org.stepsrl.model;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the corso_di_laurea_specifico database table.
 * 
 */
@Entity
@Table(name="corso_di_laurea_specifico")
@NamedQuery(name="CorsoDiLaureaSpecifico.findAll", query="SELECT c FROM CorsoDiLaureaSpecifico c")
public class CorsoDiLaureaSpecifico implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="CORSO_DI_LAUREA_SPECIFICO")
	private String corsoDiLaureaSpecifico;

	@ManyToOne
	@JoinColumn(name="ID_CORSO_DI_LAUREA")
	@JsonIgnore
	private CorsiDiLaurea corsiDiLaurea;

	public CorsoDiLaureaSpecifico() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCorsoDiLaureaSpecifico() {
		return this.corsoDiLaureaSpecifico;
	}

	public void setCorsoDiLaureaSpecifico(String corsoDiLaureaSpecifico) {
		this.corsoDiLaureaSpecifico = corsoDiLaureaSpecifico;
	}

	public CorsiDiLaurea getCorsiDiLaurea() {
		return this.corsiDiLaurea;
	}

	public void setCorsiDiLaurea(CorsiDiLaurea corsiDiLaurea) {
		this.corsiDiLaurea = corsiDiLaurea;
	}

}