package com.webapp.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.webapp.Entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

	
}
