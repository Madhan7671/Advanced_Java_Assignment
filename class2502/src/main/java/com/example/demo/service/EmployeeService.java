package com.example.demo.service;

import org.springframework.stereotype.Service;

import java.util.List;
import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeService {
	public EmployeeRepository empRepository;
	
	public EmployeeService(EmployeeRepository empRepository)
	{
		this.empRepository=empRepository;
	}
	public List<Employee> getAllEmployees(){
		return empRepository.findAll();
	}
	public void saveEmployee(Employee employee) {
	     empRepository.save(employee);
	}
}
