package com.collabera.mysql.controller;

import java.sql.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.mysql.model.Address;
import com.collabera.mysql.model.Person;
import com.collabera.mysql.repository.PersonRepo;

@RestController
public class PersonController {

	@Autowired
	PersonRepo service;
	
	@GetMapping("/api/people")
	public List<Person> getAllPeople(){
		return service.findAll();
	}
	
	@GetMapping("/api/people/{personid}")
	public Person getPerson(@PathVariable Long personid) {
		
		Optional<Person> found = service.findById(personid);
		
		if(found.isPresent()) {
			return found.get();
		}else {
			return new Person();
		}
		
	}
	
	@PostMapping("/api/addperson")
	public void addPerson(@RequestBody Person person) {
		service.save(person);
		
		//service.save(new Person(-1L, "a", "a", new Date(0), new Address()));
	}
}
