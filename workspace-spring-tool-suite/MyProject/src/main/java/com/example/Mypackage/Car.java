package com.example.Mypackage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component

public class Car implements Vechile{
	
	@Autowired
	
	private Tyre Tyre;
	
	public Tyre getTyre() {
		return Tyre;
	}


	public void setTyre(Tyre tyre) {
		Tyre = tyre;
	}


	public void Drive() {
			
			System.out.println("Driving the car"+" " +Tyre);
		}
	}

