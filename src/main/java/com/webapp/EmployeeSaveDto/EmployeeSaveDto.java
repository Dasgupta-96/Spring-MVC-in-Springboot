package com.webapp.EmployeeSaveDto;

import com.webapp.Entity.Employee;

public class EmployeeSaveDto {

	private Employee emp;
	private String message;
	public Employee getEmp() {
		return emp;
	}
	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
