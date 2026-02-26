package com.capgemini.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.capgemini.com.model.Employee;
import com.capgemini.com.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

 @Autowired
 private EmployeeService service;

 @GetMapping("/list")
 public String list(Model model){
     model.addAttribute("employees", service.getAll());
     return "employee";
 }

 @GetMapping("/add")
 public String addForm(Model model){
     model.addAttribute("employee", new Employee());
     return "employeeForm";
 }

 @PostMapping("/save")
 public String save(@ModelAttribute Employee emp){
     service.save(emp);
     return "redirect:/employee/list";
 }

 @GetMapping("/delete/{id}")
 public String delete(@PathVariable Long id){
     service.delete(id);
     return "redirect:/employee/list";
 }
}
