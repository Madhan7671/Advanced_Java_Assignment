package com.example.demo.service;

import java.util.*;

import org.springframework.stereotype.Service;

import com.example.demo.model.Customer;
import com.example.demo.repository.CustomerRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class CustomerService {
	CustomerRepository customerrepo;
	
	public void saveCustomer(Customer customer) {
		customerrepo.save(customer);
	}
	public List<Customer> fetchAllCustomer(){
		return(customerrepo.findAll());
	}
}
