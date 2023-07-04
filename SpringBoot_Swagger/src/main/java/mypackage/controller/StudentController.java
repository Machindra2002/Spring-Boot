package mypackage.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mypackage.model.Student;

@RestController
public class StudentController {

	public static List<Student> lststudent= new ArrayList<Student>();
	
	@GetMapping("/student")
	public List<Student> GetAllStudent() {
		lststudent.add(new Student(1, "Machindra Nikat"));
		lststudent.add(new Student(2, "Abhi korhale"));
		lststudent.add(new Student(3, "Laxman Ishwargund"));
		return lststudent;
	}
	
	@PostMapping("/student")
	public String AddStudent(@RequestBody Student st) {
		lststudent.add(st);
		return "Student Add Successfully \n Total Student= "+lststudent.size();
	}
	
}
