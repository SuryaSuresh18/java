package com.app.model;

import jakarta.persistence.*;

@Entity
@Table(name="emp_info")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="emp_id")
	private long id;
	private String empName;
	private String empAdd;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpAdd() {
		return empAdd;
	}
	public void setEmpAdd(String empAdd) {
		this.empAdd = empAdd;
	}
	public Employee(String empName, String empAdd) {
		super();
		this.empName = empName;
		this.empAdd = empAdd;
	}
	Employee(){
		
	}
}
