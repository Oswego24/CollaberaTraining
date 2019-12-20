package com.collabera.mysql.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.collabera.mysql.model.Student;

public interface StudentRepo extends JpaRepository<Student, Long> {

	//returns all students
	List<Student> findAll();
	
	//returns one student based on id
	Optional<Student> findById(long id);
	
	//Student save();
}
