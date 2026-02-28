package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Student;
import com.example.demo.service.StudentService;

@RestController
public class StudentController {
	private StudentService studentservice;

	public StudentController(StudentService studentservice) {
		this.studentservice = studentservice;
	}
	
	@GetMapping("/students")
	public List<Student> getStudents()
	{
		return(studentservice.getAllStudents());
	}
	
	@GetMapping("/students/{id}")
	public Optional<Student> getStudentById(@PathVariable Long id){
		return(studentservice.getStudentById(id));
	}
	@PostMapping("/student")
	public Student createStudent(@RequestBody Student student) {
		return studentservice.createStudent(student);
	}
}
