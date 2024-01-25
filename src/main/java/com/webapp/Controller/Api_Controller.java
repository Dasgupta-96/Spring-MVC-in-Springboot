package com.webapp.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webapp.EmployeeDto.EmployeeDto;
import com.webapp.EmployeeSaveDto.EmployeeSaveDto;
import com.webapp.Entity.Employee;
import com.webapp.Exception.ResourceNotFoundException;
import com.webapp.ReadEmployeeDto.ReadEmployeeDto;
import com.webapp.Repository.EmployeeRepository;

@RestController
@RequestMapping("/api/show")
public class Api_Controller {

	// http://localhost:8080/api/show
	@Autowired
	EmployeeRepository employeeRepo;
	
	@GetMapping
	public ResponseEntity<?> show() {
		
		List<Employee> result = employeeRepo.findAll();
		ReadEmployeeDto dto = new ReadEmployeeDto();
		dto.setResult(result);
		dto.setMessage("The record is displayed");
		return new ResponseEntity<>(dto, HttpStatus.OK);
	}
	
	// http://localhost:8080/api/show/5
	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteEmployee(@PathVariable int id){
		Optional<Employee> data = employeeRepo.findById(id);
		
		if(data.isPresent()){
			
			employeeRepo.deleteById(id);
		}
		else {
			
	throw new ResourceNotFoundException("The data is not present in this id " +id);

		}
		return new ResponseEntity<>("The data is deleted", HttpStatus.OK);
	}
	
	@PostMapping
	public ResponseEntity<?> SaveEmployee(@RequestBody Employee e) {
		
		Employee emp = employeeRepo.save(e);
		EmployeeSaveDto dto = new EmployeeSaveDto();
		dto.setEmp(emp);
		dto.setMessage("The record is saved!!");
		
		return new ResponseEntity<>(dto, HttpStatus.CREATED);
	}
	@PutMapping
	public ResponseEntity<?> updateEmployee(@RequestParam("id") int id, @RequestBody EmployeeDto dto){
		
		Employee e = employeeRepo.findById(id).get();
		e.setId(dto.getId());
		e.setName(dto.getName());
		e.setCity(dto.getCity());
		e.setEmail(dto.getEmail());
		e.setState(dto.getState());
		e.setPhone(dto.getPhone());
		
		Employee emp = employeeRepo.save(e);
		
		return new ResponseEntity<>(emp, HttpStatus.OK);
	}
}
