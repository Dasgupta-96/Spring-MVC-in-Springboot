package com.webapp.ReadEmployeeDto;

import java.util.List;

import com.webapp.Entity.Employee;

public class ReadEmployeeDto {

	private List<Employee> result;
	private String message;
	
	public List<Employee> getResult() {
		return result;
	}
	public void setResult(List<Employee> result) {
		this.result = result;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
