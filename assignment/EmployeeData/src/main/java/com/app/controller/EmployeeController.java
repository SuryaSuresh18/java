package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.Employee;
import com.app.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository empr;
	@GetMapping("/all")
	public List<Employee> getAllEmployee(){
		return empr.findAll();
	}
	@PostMapping("/save")
	public ResponseEntity saveEmployee(@RequestBody Employee emp) {
		empr.save(emp);
		return new ResponseEntity(HttpStatus.OK);
	}
	@PutMapping("/update/{id}")
	public ResponseEntity updateEmployee(@PathVariable("id")Long id,@RequestBody Employee emp) {
		Employee e1 = empr.findById(id).get();
		e1.setEmpName(emp.getEmpName());
		e1.setEmpAdd(emp.getEmpAdd());
		empr.save(e1);
		return new ResponseEntity(HttpStatus.OK);
	}
	@DeleteMapping("/delete/{id}")
	public ResponseEntity deleteEmployee(@PathVariable("id")Long id) {
		empr.deleteById(id);
		return new ResponseEntity(HttpStatus.OK);
	}
}
