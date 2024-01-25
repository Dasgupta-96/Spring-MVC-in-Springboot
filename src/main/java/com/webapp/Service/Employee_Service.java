package com.webapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webapp.Entity.Employee;
import com.webapp.Repository.EmployeeRepository;

@Service
public class Employee_Service {

	@Autowired
	EmployeeRepository employeeRepo;
	
	public void saveData(Employee e1) {
		employeeRepo.save(e1);
		
	}
	
	public List<Employee> displayData() {
		List<Employee> result = employeeRepo.findAll();
		
		return result;
		
	}

	public void deleteData(int id) {
		
		employeeRepo.deleteById(id);
	}
	
	public Employee getData(int id) {
		
		Employee result = employeeRepo.findById(id).get();
		
		return result;
	}
}
