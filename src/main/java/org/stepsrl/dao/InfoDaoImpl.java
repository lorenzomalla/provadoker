package org.stepsrl.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;
import org.stepsrl.model.CorsoDiLaureaSpecifico;

@Repository
@Transactional
public class InfoDaoImpl implements InfoDao{

	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<CorsoDiLaureaSpecifico> getAllCorsiDiLaurea() {
		List<CorsoDiLaureaSpecifico> corsoDiLaurea = entityManager.createNamedQuery("CorsoDiLaureaSpecifico.findAll",CorsoDiLaureaSpecifico.class).getResultList();
		return corsoDiLaurea;
		
	}

}
