package com.springboot.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

@RestController 
@RequestMapping("/employees")
public class EmployeeController {
	private EmployeeService employeeService;

	public EmployeeController(EmployeeService employeeService) {
		super();
		this.employeeService = employeeService;
	}
	
	@PostMapping
	public ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee),HttpStatus.CREATED);
	}
	
	// Build all Empoyees REST Api
	@GetMapping
	public List<Employee> getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
//	Build get employee by ID
	//http://localhost:8080/employees/1
	@GetMapping("/{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")long id) {
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(id), HttpStatus.OK);	
	}
	
	// Build update employe Rest Api
	//http://localhost:8080/employees/1

	@PutMapping("{id}")
	public ResponseEntity<Employee> updateEmploye(@PathVariable("id") long id,
			@RequestBody Employee employee){
		return new ResponseEntity<>(employeeService.updateEmploye(employee,id),HttpStatus.OK);
	}
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id") long id){
		// delete employee from the daatbase
		
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employee deleted Sussfully!",HttpStatus.OK);
	}
}

