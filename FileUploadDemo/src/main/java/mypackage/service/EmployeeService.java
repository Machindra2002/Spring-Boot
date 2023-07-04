package mypackage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import mypackage.model.Employee;
import mypackage.repository.EmployeeRepository;
 
@Service
public class EmployeeService {

	@Autowired
	EmployeeRepository emprepo;
	
	public void AddEmployee(Employee e) {
		emprepo.save(e);
		
	}
	
	public List<Employee>GetAll(){
		return emprepo.findAll();
	}
}