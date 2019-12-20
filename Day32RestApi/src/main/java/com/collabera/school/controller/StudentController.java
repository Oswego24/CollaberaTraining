package com.collabera.school.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.school.model.Student;
import com.collabera.school.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService service;
	
	@GetMapping("/api/students")
	public List<Student> getStudents(){
		
		return service.getAllStudents();
		
	}
	
	@GetMapping("/api/students/{studentid}")
	public Student getStudent(@PathVariable String studentid) {
		
		return service.getStudent(Integer.parseInt(studentid));
		
	}
}
