package mypackage.services;
import mypackage.model.*;
import mypackage.repository.*;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {
	
	@Autowired EmployeeRepository erepo;
	@Autowired CityRepository crepo;
	@Autowired DesignationRepository drepo;

	public Employee saveEmployee(Employee employee) {
		return erepo.save(employee);
	}
	
	public List<Employee> GetAllEmployee() {
		List<Employee> lst = new ArrayList<Employee>(); 
		for(Employee e : erepo.findAll()) {
			City c =new City(e.getCity().getCity_id(), e.getCity().getCity_name(), null);
			Designation d = new Designation(e.getDesignation().getDesignation_id(), e.getDesignation().getDesignation_name(),null);
			Employee edata = new Employee(e.getEmployee_id(), e.getEmployee_name(), c, e.getEmail_id(),d, e.getSalary());
			lst.add(edata);
		}
		return lst;
	}
	
	public City saveCity(City c) {
		return crepo.save(c);
	}
	
	public List<City> GetAllCity() {
		List<City> lst = new ArrayList<City>(); 
		for(City c : crepo.findAll()) {
			City ct =new City(c.getCity_id(), c.getCity_name(), null);
			lst.add(ct);
		}
		return lst;
	}
	
	public Designation saveDesignation(Designation d) {
		return drepo.save(d);
	}
	
	public List<Designation> GetAllDesignation() {
		List<Designation> lst = new ArrayList<Designation>(); 
		for(Designation d : drepo.findAll()) {
			Designation dt =new Designation(d.getDesignation_id(),d.getDesignation_name(),null);
			lst.add(dt);
		}
		return lst;
	}
}
