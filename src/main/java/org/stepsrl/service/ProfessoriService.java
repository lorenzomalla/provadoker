package org.stepsrl.service;

import java.util.List;

import org.stepsrl.model.Professori;


public interface ProfessoriService {
	
	public void addProfessori(Professori p);
	public void updateProfessori(Professori p);
	public List<Professori> listProfessori();
	public Professori getPersonById(int id);
	public void removeProfessore(int id);

}
