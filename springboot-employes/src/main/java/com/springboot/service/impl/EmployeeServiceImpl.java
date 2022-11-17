package com.springboot.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.springboot.exception.ResourceNotFoundException;
import com.springboot.model.Employee;
import com.springboot.repository.EmployeeRepository;
import com.springboot.service.EmployeeService;
 
@Service

public class EmployeeServiceImpl implements EmployeeService{
	
	private EmployeeRepository employeeRepository;
	
	public EmployeeServiceImpl(EmployeeRepository employeeRepository) {
		super();
		this.employeeRepository = employeeRepository;
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee getEmployeeById(long id) {
		Optional<Employee> employee =employeeRepository.findById(id);
		if(employee.isPresent()) {
			return employee.get();
		}
		else{
			throw new ResourceNotFoundException("Employee", "id", id); 
		}
	}

	@Override
	public Employee updateEmploye(Employee employee, long id) {
		//we need to check the whether employee with you given id is exist in DB or NOT
		
		Employee existingEmployee=employeeRepository.findById(id).orElseThrow(
				()-> new ResourceNotFoundException("Employee", "id", id));	
		
		existingEmployee.setFirstName(employee.getFirstName());
		existingEmployee.setLastName(employee.getLastName());
		existingEmployee.setEmail(employee.getEmail());
		
		// Save to existing employye data in DataBase
		employeeRepository.save(existingEmployee);
		return existingEmployee;
		
	}

	@Override
	public void deleteEmployee(long id) {
		// check whether a employee exist or not
		employeeRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("EMployee", "id", id));
		employeeRepository.deleteById(id);
	}
	
}
