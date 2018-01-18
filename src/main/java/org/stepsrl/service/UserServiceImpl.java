package org.stepsrl.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stepsrl.dao.UserDao;
import org.stepsrl.model.AnagraficaStudente;
import org.stepsrl.model.User;
@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private UserDao userDao;
	
	@Override
	public void addUser(User user) {
		userDao.addUser(user);
	}

	@Override
	public void addAnagrafica(AnagraficaStudente anagrafica) {
		userDao.addAnagrafica(anagrafica);
	}

	@Override
	public User controllaLogin(String username, String password) {
		return userDao.controllaLogin(username, password);
	}

	

}
