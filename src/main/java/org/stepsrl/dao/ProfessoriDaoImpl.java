package org.stepsrl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.stepsrl.model.Professori;

@Repository
public class ProfessoriDaoImpl implements ProfessoriDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public void addProfessori(Professori p) {
		entityManager.persist(p);
	}

	@Override
	public void updateProfessori(Professori p) {
		entityManager.merge(p);
	}

	@Override
	public List<Professori> listProfessori() {
		List<Professori> listaProfessori = entityManager.createNamedQuery("Professori.findAll",Professori.class).getResultList();
		return listaProfessori;
	}

	@Override
	public Professori getPersonById(int id) {
		return entityManager.find(Professori.class, id);
	}

	@Override
	public void removeProfessore(int id) {
		Professori professore = (Professori)entityManager.find(Professori.class, id);
		entityManager.remove(professore);
	}

	

}
