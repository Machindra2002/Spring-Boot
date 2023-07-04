package mypackage.model;

import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
 
@Entity
@Table(name="tblemployees")
public class Employee {

	@Id
	private int employee_id;
	private String employee_name;
	private String photo_name;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employee_id, String employee_name, String photo_name) {
		super();
		this.employee_id = employee_id;
		this.employee_name = employee_name;
		this.photo_name = photo_name;
	}

	public int getEmployee_id() {
		return employee_id;
	}
	public void setEmployee_id(int employee_id) {
		this.employee_id = employee_id;
	}
	public String getEmployee_name() {
		return employee_name;
	}
	public void setEmployee_name(String employee_name) {
		this.employee_name = employee_name;
	}
	public String getPhoto_name() {
		return photo_name;
	}
	public void setPhoto_name(String photo_name) {
		this.photo_name = photo_name;
	}


}

