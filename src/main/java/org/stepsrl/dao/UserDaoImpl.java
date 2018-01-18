package org.stepsrl.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.stepsrl.model.AnagraficaStudente;
import org.stepsrl.model.User;

@Repository
@Transactional
public class UserDaoImpl implements UserDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void addUser(User user) {
		entityManager.persist(user);
	}

	@Override
	public void addAnagrafica(AnagraficaStudente anagrafica) {
		entityManager.persist(anagrafica);
	}

	@Override
	public User controllaLogin(String username, String password) {
		User user = (User)entityManager.createQuery("FROM User WHERE username =:username AND password =:password").setParameter("username", username).setParameter("password", password).getSingleResult();
		return user;
	}
}
