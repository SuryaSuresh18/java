package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.employ.Employee;
import com.app.repository.EmployeeRepository;

@RestController
@RequestMapping("/emp")
public class EmployeeController {
	@Autowired//To create bean of interface
	EmployeeRepository empr;
	@PostMapping("/save")
	public void saveEmployee(@RequestBody Employee emp) {
		System.out.println("Hello");
		empr.save(emp);
	}
	@RequestMapping("/details")
	public List<Employee>getDetails(){
		return empr.findAll();
	}
	
	@RequestMapping("/details/{id}")
	public Employee getById(@PathVariable("id")Long id) {
		return empr.findById(id).get();
		
	}
	
	@RequestMapping("/update/{id}/{name}")//https://localhost:8080/employee/update.arun
	public void updateEmp(@PathVariable("id")Long id,@PathVariable("name")String name){
		Employee e1 = empr.findById(id).get();
		e1.setName(name);
		empr.save(e1);
	}
	@RequestMapping("/delete/{id}")
	public void deleteEmployee(@PathVariable("id") Long id) {
		empr.deleteById(id);
	}
	
}
