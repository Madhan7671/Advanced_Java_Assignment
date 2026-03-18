package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;

import lombok.AllArgsConstructor;

@Controller
@AllArgsConstructor
public class CustomerController{
	private final CustomerService service;
	@GetMapping("/addCustomers")
	public String ShowForm(Model model) {
		model.addAttribute("customer", new Customer());
		return "addcustomers";
	}
	@PostMapping("/saveCustomer")
	public String saveCustomer(@ModelAttribute Customer customer) {
		service.saveCustomer(customer);
		return "redirect:/customers";
	}
	@GetMapping("/customers")
	public String showCustomers(Model model) {
		model.addAttribute("customers",service.fetchAllCustomer());
		return("CustomerList");
	}
}
