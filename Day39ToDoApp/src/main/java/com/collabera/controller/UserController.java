package com.collabera.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.collabera.model.User;
import com.collabera.services.UserService;

@Controller
public class UserController {

	@Autowired
	UserService service;
	
	@RequestMapping(value="/listusers", method =RequestMethod.GET)
	public String listUsers(ModelMap model) {
		model.put("users", service.listAllUsers());
		return "listusers";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.GET)
	public String getAddUser(ModelMap model) {
		User user= new User(0,"", "", "", "");
		model.addAttribute("user", user);
		return "user";
	}
	
	@RequestMapping(value="/user", method = RequestMethod.POST)
	public String addUser(ModelMap model, @Valid User user, BindingResult result) {
		
		if(result.hasErrors()) {
			return "user";
		}
		service.addUser(user.getUserName(), user.getPassword(), user.getFullName(), user.getRoles());
		return "redirect:/listusers";
	}
	
	
	@RequestMapping(value="/deleteuser", method = RequestMethod.GET)
	public String deleteUser(@RequestParam int userId) {
		User user = service.deleteUser(userId);
		return "redirect:/listusers";
	}
	
	@RequestMapping(value="/edituser", method = RequestMethod.GET)
	public String showEditUser(ModelMap model,@RequestParam int userId) {
		User user = service.getUser(userId);
		model.addAttribute("user", user);
		return "user";
	}

	@RequestMapping(value="/edituser", method = RequestMethod.POST)
	public String editTodo(ModelMap model, @Valid User user,
			BindingResult result) { 
		if(result.hasErrors()) {
			return "user";
		}
		//todo.setUser((String) model.get("name"));
		service.editUser(user);
		return "redirect:/listusers";
	}
	
	
}
