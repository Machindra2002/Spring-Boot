package mypackage.model;

import java.util.Set;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "City")
public class City {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int city_id;
	private String City_name;
	@OneToMany(mappedBy = "city",cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	@JsonIgnoreProperties("city")
	private Set<Employee> employees;
	
	public City() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public City(int city_id, String city_name, Set<Employee> employees) {
		super();
		this.city_id = city_id;
		City_name = city_name;
		this.employees = employees;
	}
	
	public int getCity_id() {
		return city_id;
	}
	public void setCity_id(int city_id) {
		this.city_id = city_id;
	}
	public String getCity_name() {
		return City_name;
	}
	public void setCity_name(String city_name) {
		City_name = city_name;
	}
	public Set<Employee> getEmployees() {
		return employees;
	}
	public void setEmployees(Set<Employee> employees) {
		this.employees = employees;
	}
	
	
	
}
