package org.stepsrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import org.stepsrl.model.*;
import org.stepsrl.service.StudentiService;
import org.stepsrl.service.UserService;

@Controller
public class RegistrazioneController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private StudentiService studenteService;
	
	@RequestMapping(value="/registrazione",method=RequestMethod.GET)
	public String registrazione(){
		return "registrazione";
	}

	@RequestMapping(value="/index/login", method = RequestMethod.POST)
	public String controllaRegistrazione(Studenti studente , User user,AnagraficaStudente anagrafica){
		if(user.getId() == 0){
			userService.addUser(user);
			studente.setUser(user);
			studenteService.addPerson(studente);
			anagrafica.setStudenti(studente);
			userService.addAnagrafica(anagrafica);
			return "login";
		}else
			return "errore";
	}
	
}
