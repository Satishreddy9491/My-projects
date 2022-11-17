package com.example.service;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.model.Student;
import com.example.repository.StudentRepository;
@Service

public class StudentService {
	@Autowired
	StudentRepository studentRepository;
	// For getting all StudentRecords
	public List<Student>getAllStudents(){
	List<Student> students=new ArrayList<>();
	studentRepository.findAll().forEach(student->students.add(student));
	return students;  
	}
}
