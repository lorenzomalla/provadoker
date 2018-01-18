package org.stepsrl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.stepsrl.dao.ProfessoriDao;
import org.stepsrl.model.Professori;


@Service("professoriService")
public class ProfessoriServiceImpl implements ProfessoriService{

	@Autowired
	private ProfessoriDao professoriDao;
	
	@Override
	public void addProfessori(Professori p) {
		professoriDao.addProfessori(p);
	}

	@Override
	public void updateProfessori(Professori p) {
		professoriDao.updateProfessori(p);
	}

	@Override
	public List<Professori> listProfessori() {
		return professoriDao.listProfessori();
	}

	@Override
	public Professori getPersonById(int id) {
		return professoriDao.getPersonById(id);
	}

	@Override
	public void removeProfessore(int id) {
		professoriDao.removeProfessore(id);
	}

	
}
