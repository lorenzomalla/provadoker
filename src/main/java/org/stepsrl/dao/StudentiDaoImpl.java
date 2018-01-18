package org.stepsrl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.stepsrl.model.Studenti;


@Repository
@Transactional
public class StudentiDaoImpl implements StudentiDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void addPerson(Studenti studenti) {
		entityManager.persist(studenti);
	}

	@Override
	public void updatePerson(Studenti studenti) {
		entityManager.merge(studenti);
	}

	@Override
	public List<Studenti> listStudenti() {
		List<Studenti> listaStudenti = entityManager.createNamedQuery("Studenti.findAll",Studenti.class).getResultList();
		return listaStudenti;
	}

	@Override
	public Studenti getStudentiById(int id) {
		return entityManager.find(Studenti.class, id);
	}

	@Override
	public void removeStudenti(int id) {
		Studenti studente = (Studenti)entityManager.find(Studenti.class, id);
		entityManager.remove(studente);
	}
	
}
