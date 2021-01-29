package com.alejandro.list.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejandro.list.apirest.model.Student;

@Service
public class StudentServices {

	@Autowired
	private StudentRepository studentRepository;

	public void saveStudent(Student student) {
		studentRepository.save(student);
	}

	public List<Student> getAll() {
		return studentRepository.findAll();
	}

	public Student getStudent(Integer id) {
		return studentRepository.getOne(id);
	}

	public void updateSt(Student student) {
		studentRepository.save(student);
	}

	public void delete(Integer id) {
		studentRepository.deleteById(id);
	}
}
