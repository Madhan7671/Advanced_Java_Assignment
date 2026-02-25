package com.example.demo.Service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.Repository.CustomerRepository;
import com.example.demo.model.Customer;


@Service
public class CustomerService {
	public CustomerRepository customerRepository;

	public CustomerService(CustomerRepository customerRepository) {
		this.customerRepository = customerRepository;
	}
	public List<Customer> getAllCustomers(){
		return(customerRepository.findAll());
	}
	public void saveCustomer(Customer customer)
	{
		customerRepository.save(customer);
	}
	public Customer getCustomerById(Long id){
	    return customerRepository.findById(id).orElse(null);
	}

	public void deleteCustomer(Long id){
	    customerRepository.deleteById(id);
	}
}
