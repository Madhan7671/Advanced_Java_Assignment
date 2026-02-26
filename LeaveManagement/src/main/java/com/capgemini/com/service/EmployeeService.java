package com.capgemini.com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.com.model.Employee;
import com.capgemini.com.repository.EmployeeRepository;

@Service
public class EmployeeService {

 @Autowired
 private EmployeeRepository repo;

 public List<Employee> getAll(){
     return repo.findAll();
 }

 public void save(Employee e){
     repo.save(e);
 }

 public Employee get(Long id){
     return repo.findById(id).orElse(null);
 }

 public void delete(Long id){
     repo.deleteById(id);
 }
}
