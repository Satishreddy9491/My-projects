package com.example.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ResourceNotFoundException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String resourceName	;
	private String feildName;
	private String feildValue;
	public ResourceNotFoundException(String resourceName, String feildName, String feildValue) {
		super();
		this.resourceName = resourceName;
		this.feildName = feildName;
		this.feildValue = feildValue;
	}
	
	public String getResourceName() {
		return resourceName;
	}
	public String getFeildName() {
		return feildName;
	}
	public String getFeildValue() {
		return feildValue;
	}
}
