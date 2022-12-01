package com.example.ResourceNotFound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

	@Autowired
	private CustomerService service;
	
	@GetMapping("/customer/{id}")
	public Customer getCustomerById(@PathVariable int id)
	{
		return service.getUserById(id);
	}
	
	@PostMapping("customer/add")
	public Customer addCustomer()
	{
		Customer customer=new Customer("yamani", "y", "yamani@gmail.co");
		return service.addCustomer(customer);
	}
}