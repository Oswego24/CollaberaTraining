package com.collabera.school.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.collabera.school.model.Student;

@Service
public class StudentService {

	//mock "database"
	private static List<Student> students = new ArrayList<Student>();
	private static int idCounter = 1;
	
	static {
		students.add(new Student(idCounter++, "LeBron", "James", 
				LocalDate.of(1984, 12, 30), "Basketball"));
		students.add(new Student(idCounter++, "John", "Truong", 
				LocalDate.of(1997, 8, 7), "Software Engineering"));
		students.add(new Student(idCounter++, "Jeffery", "Epstein", 
				LocalDate.of(1979, 3, 14), "Pilot"));
		students.add(new Student(idCounter++, "Emma", "Stone", 
				LocalDate.of(1992, 7, 10), "Physics"));
		students.add(new Student(idCounter++, "Barack", "Obama", 
				LocalDate.of(1961, 8, 4), "Law"));
		students.add(new Student(idCounter++, "Shia", "LeBeouf", 
				LocalDate.of(1986, 6, 11), "Film"));
	}
	
	//CRUD: Create Read Update Delete
	
	//Create
	public Student addStudent(String firstName, String lastName, LocalDate dob, String major) {
		Student newStudent = new Student(idCounter++, firstName, lastName, dob, major);
		students.add(newStudent);
		return newStudent;
	}
	
	//Read
	
	//Read all students
	public List<Student> getAllStudents() {
		return students;
		
	}
	//Read one student based on id
	public Student getStudent(int id) {
		Student student = new Student();
		
		for(int s=0; s<students.size(); s++) {
			if(students.get(s).getId() == id) {
				student = students.get(s);
				break;
			}
		}
		
		return student;
	}
	//Read all students from the same major
	public List<Student> getStudentsInMajor(String major){
		List<Student> studentMajor = new ArrayList<Student>();
		
		for(int s=0; s<students.size(); s++) {
			if(students.get(s).getMajor().toLowerCase().equals(major.toLowerCase())) {
				studentMajor.add(students.get(s));
			}
		}
		return studentMajor;
	}
	
	//Update
	public Student updateStudent(Student student) {
	
		Student studentToUpdate = getStudent(student.getId());
		if(studentToUpdate.getId() != -1) {
			studentToUpdate.setFirstName(student.getFirstName());
			studentToUpdate.setLastName(student.getLastName());
			studentToUpdate.setDateOfBirth(student.getDateOfBirth());
			studentToUpdate.setMajor(student.getMajor());
		}
		return studentToUpdate;
		
	}
	
	//Delete
	public Student deleteStudent(int id) {
		Student studentToRemove = new Student();
		
		for(int s=0; s<students.size(); s++) {
			if(students.get(s).getId() == id) {
				studentToRemove = students.get(s);
				students.remove(s);
				break;
			}
		}
		return studentToRemove;
	}
	public void deleteAllStudents() {
		students.clear();
	}
	
	
	
	
	
	
	
	
	
	
	
}
