package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.demo.model.Student;
import com.example.demo.repository.StudentRepository;

@Service
public class StudentService {
	private StudentRepository studentrepository;
	
	public StudentService(StudentRepository studentrepository)
	{
		this.studentrepository=studentrepository;
	}
	
	public List<Student> getAllStudents(){
		return studentrepository.findAll();
	}

	public Student createStudent(Student student) {
		return(studentrepository.save(student));
	}

	public Optional<Student> getStudentById(Long id) {
	    return studentrepository.findById(id);
	}

	public Student updateStudent(Long id, Student student) {
		studentrepository.deleteById(id);
		studentrepository.save(student);
		return student;
	}

	public void deleteStudent(Long id) {
		studentrepository.deleteById(id);
	}
	
}
