package org.stepsrl.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.stepsrl.model.Studenti;
import org.stepsrl.model.User;
import org.stepsrl.service.UserService;

@Controller
public class LoginController {
	
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/login",method=RequestMethod.GET)
	public String homepage(){
		return "login";
	}
	
	@RequestMapping(value="/bacheca",method=RequestMethod.POST)
	public String controlloLogin(ModelMap model, @ModelAttribute("studente") Studenti studente,User user,@RequestParam("username")String username,@RequestParam("password")String password){
		try{
			if((user = userService.controllaLogin(user.getUsername(), user.getPassword())) != null){
				model.addAttribute("studente",studente);
				return "bacheca";
			}
		}catch(Exception e){
			e.printStackTrace();
		}
		return "errore";
	}
	
}
	
