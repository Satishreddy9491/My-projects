package com.example.service;

import java.util.List;

import com.example.model.Employee;

public interface EmployeeService {
	
	Employee saveEmployee(Employee employee);
	List<Employee>getAllEmployees();
	Employee getEmployeeById(long id);
	Employee updateEmploye(Employee employee,long id);
	void deleteEmployee(long id);
}
