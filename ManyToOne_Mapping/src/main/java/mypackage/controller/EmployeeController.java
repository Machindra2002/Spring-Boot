package mypackage.controller;
import mypackage.model.*;

import mypackage.repository.*;
import mypackage.services.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class EmployeeController {

	
	@Autowired
	EmployeeService service;
	
	@PostMapping("api/employee")
	public Employee AddEmployee(@RequestBody Employee e) {
		return  service.saveEmployee(e);
	}
	
	@GetMapping("api/employee")
	public List<Employee> GetEmployee() {
		return  service.GetAllEmployee();
	}
	
	@PostMapping("api/city")
	public City AddEmployee(@RequestBody City c) {
		return  service.saveCity(c);
	}
	
	@GetMapping("api/city")
	public List<City> GetCity() {
		return  service.GetAllCity();
	}
	
	@PostMapping("api/designation")
	public Designation AddDesignation(@RequestBody Designation d) {
		return  service.saveDesignation(d);
	}
	
	@GetMapping("api/designation")
	public List<Designation> GetDesignation() {
		return  service.GetAllDesignation();
	}
}
