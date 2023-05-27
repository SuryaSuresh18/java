package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.Repository.CustomerRepository;
import com.app.model.Customer;

@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v1")
public class CustomerController {
	@Autowired
	private CustomerRepository cr;
	@GetMapping("/customers")
	public List<Customer>getCustomer(){
		return cr.findAll();
	}
	@PostMapping("/customers")
	public void saveCustomer(@RequestBody Customer cus) {
		this.cr.save(cus);
	}
	@PutMapping("/customers/{customerId}")
	public void updateCustomer(@PathVariable Long customerId, @RequestBody Customer customerDetails) {
		Customer cus = cr.findById(customerId).get();
		cus.setCustomerName(customerDetails.getCustomerName());
		cus.setCustomerMobile(customerDetails.getCustomerMobile());
		cus.setCustomerAddress(customerDetails.getCustomerAddress());
		
		Customer updateCustomer = cr.save(cus);
	}
}
