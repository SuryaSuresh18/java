package com.app.employ;
import jakarta.persistence.*;
@Entity
@Table(name="employee_info")
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="employee_id")
	private long id;
	private String name;
	private String emailId;
	private String address;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Employee(String name, String emailId, String address) {
		super();
		this.name = name;
		this.emailId = emailId;
		this.address = address;
	}
	public Employee() {
		
	}
}
