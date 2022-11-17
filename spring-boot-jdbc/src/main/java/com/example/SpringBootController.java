package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringBootController {
	
	@Autowired 
	JdbcTemplate jdbc;
	@RequestMapping("/insert")
	public String index() {
		jdbc.execute("insert into user(name,email)values('javatpoint','satish@gmail.com')");
		return "Datta inserted Successfully";
	}
}
