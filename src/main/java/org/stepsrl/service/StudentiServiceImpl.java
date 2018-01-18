package org.stepsrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stepsrl.dao.StudentiDao;
import org.stepsrl.model.Studenti;


@Service("studentiService")
public class StudentiServiceImpl implements StudentiService{

	@Autowired
	private StudentiDao studenteDao;
	
	@Override
	public void addPerson(Studenti studenti) {
		studenteDao.addPerson(studenti);
	}

	@Override
	public void updatePerson(Studenti studenti) {
		studenteDao.updatePerson(studenti);
	}

	@Override
	public List<Studenti> listStudenti() {
		return studenteDao.listStudenti();
	}

	@Override
	public Studenti getStudentiById(int id) {
		return studenteDao.getStudentiById(id);
	}

	@Override
	public void removeStudenti(int id) {
		studenteDao.removeStudenti(id);
	}
}
