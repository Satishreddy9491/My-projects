package com.example;

import java.util.ArrayList;
import java.util.List;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {
	
	// To get the student
	@GetMapping("/student")
	public Student getStudent() {
		return new Student("Satish","Reddy",1);
	}
	
	// To get the List of all the Students
	@GetMapping("/students")
	public List<Student> getStudents(){
		List<Student>students=new ArrayList<>();
		students.add(new Student("Satish","Reddy", 1));
		students.add(new Student("Reddy","Satish", 2));
		students.add(new Student("Sirisha","Siddamurthi", 3));
		students.add(new Student("siddamurthi","sirisha", 4));
		students.add(new Student("Venakta","Satish", 5));
		students.add(new Student("Satish","Venkata", 6));
		return students;
	}
	@GetMapping("/{id}")
	public Student studentPathVariable(@PathVariable("id")int id) {
		return new Student("satish", "reddy",10);
	}
	
	//Build rest API to handle Query parameters
	@GetMapping("/query")
	public Student studentQueryParam(
			@RequestParam(name="firstName")String firstName,
			@RequestParam(name="lastName")String lastName) {
		return new Student(firstName, lastName, 3);
	}
}
