package com.collabera.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.ResponseBody;

import com.collabera.services.LoginService;

@Controller
public class LoginController {
	
	@Autowired
	LoginService logSrv;
	
	//When calling /login with GET, we get the login page that asks for credentials
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	
	//View resolver which is managed by springboot (The view resolver is located in application.properties)
	public String login() {
		return "login";
	}
	//When calling /login with POST, we get the welcome page
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String validateLogin(@RequestParam(defaultValue="guest") String name, @RequestParam String password, ModelMap model) {
		if(!logSrv.validateUser(name, password)) {
			return "login";
		}else {
			model.put("name", name);
			model.put("password", password);
			return "welcome";
		}
	}
	
}

