package com.collabera.todoapp.controllers;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.collabera.todoapp.model.Todo;
import com.collabera.todoapp.services.TodoService;

@Controller
@SessionAttributes("name")
public class TodoController {
	
	@Autowired
	TodoService service;
	
	@RequestMapping(value="/listtodos", method =RequestMethod.GET)
	public String listTodos(ModelMap model) {
		String name = (String) model.get("name");
		model.put("todos", service.listTodos(name));
		return "listtodos";
	}
	
	@RequestMapping(value="/todo", method = RequestMethod.GET)
	public String getAddTodo() {
		return "todo";
	}
	
	@RequestMapping(value="/todo", method = RequestMethod.POST)
	public String addTodo(ModelMap model, @RequestParam String desc) {
		
		String name = (String) model.get("name");
		Todo todo = service.addTodo(name, desc, new Date(), false);

		return "redirect:/listtodos";
	}
	
	@RequestMapping(value="/deletetodo", method = RequestMethod.GET)
	public String deleteTodo(@RequestParam int todoId) {
		Todo todo = service.deleteTodo(todoId);
		return "redirect:/listtodos";
	}

}
