
package com.example.demo;

import org.springframework.beans.factory.annotation.Required;

public class Machine {
	private Integer cost;
	@Required
	
	public void setCost(Integer cost) {
		this.cost = cost;
	}
	public Integer getCost()   
	{ 
		return cost;
	}
} 
