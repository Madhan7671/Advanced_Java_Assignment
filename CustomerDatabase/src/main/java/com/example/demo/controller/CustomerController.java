package com.example.demo.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.CustomerService;
import com.example.demo.model.Customer;

@Controller
public class CustomerController {
	public CustomerService customerService;

	public CustomerController(CustomerService customerService) {
		this.customerService = customerService;
	}
	@GetMapping("/customers")
	public String getCustomerDetails(ModelMap model)
	{
		List<Customer> ct=customerService.getAllCustomers();
		model.addAttribute("customers", ct);
		return "customers";
	}
	@GetMapping("/addCustomer")
	public String showCustomer(Model model)
	{
		model.addAttribute("customer", new Customer());
		return "addCustomer";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(Customer customer)
	{
		customerService.saveCustomer(customer);
		return "redirect:/customers";
	}
	@GetMapping("/deleteCustomer/{id}")
	public String deleteCustomer(@PathVariable Long id){
	    customerService.deleteCustomer(id);
	    return "redirect:/customers";
	}
	@GetMapping("/editCustomer/{id}")
	public String editCustomer(@PathVariable Long id, Model model){
	    Customer customer = customerService.getCustomerById(id);
	    model.addAttribute("customer", customer);
	    return "addCustomer";
	}
}
