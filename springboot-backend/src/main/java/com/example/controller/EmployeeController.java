package com.example.controller;

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

import com.example.model.Employee;
import com.example.service.EmployeeService;

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
		return new ResponseEntity<Employee>(employeeService.saveEmployee(employee), HttpStatus.CREATED);
	}
	
	@GetMapping
	public List<Employee>getAllEmployees(){
		return employeeService.getAllEmployees();
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Employee> getEmployeeById(@PathVariable("id")long employeId){
		return new ResponseEntity<Employee>(employeeService.getEmployeeById(employeId),HttpStatus.OK);
	}
	@PutMapping("{id}")
	public ResponseEntity<Employee>updateEmployee(@PathVariable("id")long id,
													@RequestBody Employee employee){
		return new ResponseEntity<Employee>(employeeService.updateEmploye(employee, id), HttpStatus.OK);
		}
	
	@DeleteMapping("{id}")
	public ResponseEntity<String>deleteEmployee(@PathVariable("id")long id){
		employeeService.deleteEmployee(id);
		return new ResponseEntity<String>("Employe Deletd Successfully",HttpStatus.OK);
	}
}
