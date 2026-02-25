package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.service.EmployeeService;
import java.util.List;
import com.example.demo.model.Employee;
import org.springframework.ui.Model;

//import ch.qos.logback.core.model.Model;

@Controller
public class EmployeeController {
	public EmployeeService employeeService;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService=employeeService;
	}
	
	//model
	@GetMapping("/employees")
	public String getEmployeesDetails(Model model)
	{
		List<Employee> employees=employeeService.getAllEmployees();
		model.addAttribute("employees",employees);
		return "employee";
	}
	
	//modelandview
	@GetMapping("/employee")
	public ModelAndView getEmployeesDetails() {
		List<Employee> employees=employeeService.getAllEmployees();
		ModelAndView mv=new ModelAndView();
		mv.addObject("employees",employees);
		mv.setViewName("employee");
		return mv;
		}
	
	@GetMapping("/addEmployee")
	public String showAddForm(Model model)
	{
		model.addAttribute("employee",new Employee());
		return "addEmployee";
	}
	
	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee employee)
	{
		employeeService.saveEmployee(employee);
		return "redirect:/employees";
	}
}
