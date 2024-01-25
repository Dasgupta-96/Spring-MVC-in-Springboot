package com.webapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.webapp.EmployeeDto.EmployeeDto;
import com.webapp.Entity.Employee;
import com.webapp.Service.EmailService;
import com.webapp.Service.Employee_Service;

@Controller
public class Employee_Controller {

	@Autowired
	Employee_Service ser;
	
	@Autowired
	EmailService es;
	
	@RequestMapping("/viewData")
	public String viewData() {
		
		return "Employee";
	}
	
	@RequestMapping("/save")
	public String saveData(Employee e1, ModelMap model,@RequestParam("email") String email) {
		
		ser.saveData(e1);
//		es.sendMail(email, "Interview Invitation", "Interview Date is tommorow, be prepared!!");
		model.addAttribute("x", "Data saved!!");
		
		return "Employee";
	}
	@RequestMapping("/display")
	public String displayData( ModelMap model) {
		
		List<Employee> res = ser.displayData();
		
		model.addAttribute("res", res);
		
		return "displayEmployee";
	}
	@RequestMapping("/delete")
	public String deleteEmployee(@RequestParam("id")int id, ModelMap model) {
		
		ser.deleteData(id);
		
List<Employee> res = ser.displayData();
		
		model.addAttribute("res", res);
		
		return "displayEmployee";
	}
	@RequestMapping("/update")
	public String getAllData(@RequestParam("id") int id, ModelMap model) {
		
		Employee res = ser.getData(id);
		model.addAttribute("r", res);
		return "UpdateEmployee";
	}
	
	@RequestMapping("/updateEmp")
	public String updateemployee(ModelMap model, 
			
			EmployeeDto dto
			) {
	
		Employee e1 = new Employee();
		e1.setId(dto.getId());
		e1.setName(dto.getName());
		e1.setCity(dto.getCity());
		e1.setEmail(dto.getEmail());
		e1.setState(dto.getState());
		e1.setPhone(dto.getPhone());
		
		ser.saveData(e1);
		
List<Employee> res = ser.displayData();
		
		model.addAttribute("res", res);
		
		return "displayEmployee";
	}
	
	// http://localhost:8080/viewData
}
