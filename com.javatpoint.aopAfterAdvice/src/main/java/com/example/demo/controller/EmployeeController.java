package com.example.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;  
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RequestMethod;  
import org.springframework.web.bind.annotation.RequestParam;  
import org.springframework.web.bind.annotation.RestController;  
  



@RestController
public class EmployeeController {
	@Autowired
	private com.example.demo.service.EmployeeService employeeService;
	
	@RequestMapping(value="/add/employee",method=RequestMethod.GET)
	public com.example.demo.model.Employee addEmployee(@RequestParam("empId")String empId,
			@RequestParam("firstName")String firstName,
			@RequestParam("secondName")String secondName) {
		return employeeService.createEmployee(empId,firstName,secondName);
	}
	@RequestMapping(value = "/remove/employee", method = RequestMethod.GET)  
	public String removeEmployee( @RequestParam("empId") String empId)   
	{  
	employeeService.deleteEmployee(empId);  
	return " Aspect Oriented Programing After Advice is Succesfully Removed";  
	}  	
	
	
	
}
