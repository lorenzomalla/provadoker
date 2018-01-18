package org.stepsrl.service;

import org.stepsrl.dao.InfoDao;
import org.stepsrl.model.CorsoDiLaureaSpecifico;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("infoService")
public class InfoServiceImpl implements InfoService{
	
	@Autowired
	private InfoDao infoDao;

	@Override
	public List<CorsoDiLaureaSpecifico> getAllCorsiDiLaurea() {
		return infoDao.getAllCorsiDiLaurea();
	}
	
	
	
}
