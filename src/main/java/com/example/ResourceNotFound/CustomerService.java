package com.example.ResourceNotFound;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

	@Autowired
	private CustomerRepository repo;
	
	public Customer getUserById(int id)
	{
		Optional<Customer> opt=repo.findById(id);
		
		if(opt.isPresent())
		{
			return(opt.get());
		}
		throw new ResourceNotFoundException("Customer", "id", id);
	}

	public Customer addCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return repo.save(customer);
	}
	
}
