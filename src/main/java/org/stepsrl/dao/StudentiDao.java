package org.stepsrl.dao;

import java.util.List;

import org.stepsrl.model.Studenti;


public interface StudentiDao {

	public void addPerson(Studenti studenti);
	public void updatePerson(Studenti studenti);
	public List<Studenti> listStudenti();
	public Studenti getStudentiById(int id);
	public void removeStudenti(int id);
	
}
