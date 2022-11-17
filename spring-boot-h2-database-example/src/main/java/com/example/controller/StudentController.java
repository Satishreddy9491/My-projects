package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Student;
import com.example.service.StudentService;

@RestController

public class StudentController {
	
	@Autowired
	StudentService studentService;
	@GetMapping("/student")  
	private List<Student>getAllStudent(){
		return studentService.getAllStudents();
	}
	
	
	
	
}
