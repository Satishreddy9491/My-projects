package com.example.demo.aspect;

import org.aspectj.lang.JoinPoint;

import org.aspectj.lang.annotation.After;

public class EmployeeServiceAspect {
	@After(value = "execution(* com.javatpoint.service.EmployeeService.*(..)) and args(empId,fname,sname)")
	public void afterAdvice(JoinPoint joinPoint, String empId, String fname, String sname) {  
		System.out.println("After method:" + joinPoint.getSignature());  
}
}