package com.collabera.mysql.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.mysql.model.Student;
import com.collabera.mysql.repository.StudentRepo;

@RestController
public class StudentController {
	
	@Autowired
	StudentRepo service;
	
	@GetMapping("/api/students")
	public List<Student> getAllStudents() {
		System.out.println("Returning all students..");
		return service.findAll();
	}
	
	@GetMapping("/api/students/{studentid}")
	public Student getStudent(@PathVariable String studentid) {
		Optional<Student> s = service.findById(Long.parseLong(studentid));
		if(s.isPresent()) {
			return s.get();
		}
		return new Student();
	}
	
	@PostMapping("/api/addstudent")
	public void addStudent(@RequestBody Student newStudent) {
		service.save(newStudent);
		System.out.println("Added: " + newStudent);
	}
	
	@PutMapping("/api/updatestudent")
	public @ResponseBody String updateStudent(@RequestBody Student student) {
		Optional<Student> found = service.findById(student.getId());
		
		if(found.isPresent()) {
			service.save(student);
			return "Saved: " + student.toString();
		}else {
			return "Could not update student with id " + student.getId();
		}
	}
	
	@DeleteMapping("/api/removestudent/{studentid}")
	public ResponseEntity<String> deleteStudent(@PathVariable Long studentid){
		
		if(studentid == 1L) {
			return ResponseEntity.status(400).body("Can't delete the admin");
		}else {
			service.deleteById(studentid);
			return ResponseEntity.status(200).body("Student deleted.");
		}
		
	}

}
