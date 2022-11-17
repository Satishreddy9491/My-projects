package com.springboot.controller;

import java.net.http.HttpClient.Redirect;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.springboot.entity.Student;
import com.springboot.service.StudentService;

@Controller
public class StudentContorller {
	private StudentService studentService;

	public StudentContorller(StudentService studentService) {
		super();
		this.studentService = studentService;
	}
	
	@GetMapping("/students")
	public String listStudents(Model model) {
			model.addAttribute("students",studentService.getAllStudents());
			return "students";
	}
	@GetMapping("/students/edit/{id}")
	public String editStudent(@PathVariable Long id ,Model model) {
		model.addAttribute("student",studentService.getStudntById(id));
		return "edit_student";
	}
	
	@PostMapping("/students/{id}")
	public String updateStudent(@PathVariable Long id,
			@ModelAttribute("student")Student student,
			Model model) {
	// Get Student By id
		Student existingStudent=studentService.getStudntById(id);
		existingStudent.setId(student.getId());
		existingStudent.setFirstName(student.getFirstName());
		existingStudent.setLastName(student.getLastName());
		existingStudent.setEmail(student.getEmail());
		studentService.updateStudent(existingStudent);
		return "redirect:/students";
	}
	@GetMapping("/students/{id}")
	public String deleteStudent(@PathVariable Long id) {
		studentService.deleteStudentById(id);
		return "redirect:/students";
		
	}
}
