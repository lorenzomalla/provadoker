package org.stepsrl.dao;

import org.stepsrl.model.AnagraficaStudente;
import org.stepsrl.model.User;

public interface UserDao {

	public void addUser(User user);
	public void addAnagrafica(AnagraficaStudente anagrafica);
	public User controllaLogin(String username , String password);
	
}
