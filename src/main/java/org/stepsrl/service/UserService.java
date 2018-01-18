package org.stepsrl.service;

import org.stepsrl.model.AnagraficaStudente;
import org.stepsrl.model.User;

public interface UserService {
	
	public void addUser(User user);
	public void addAnagrafica(AnagraficaStudente anagrafica);
	public User controllaLogin(String username,String password);
}
