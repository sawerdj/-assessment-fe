package com.alejandro.list.apirest.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.alejandro.list.apirest.model.Student;

@RestController

//for angular
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedOrigins("*").allowedMethods("GET", "POST", "PUT", "DELETE", "UPDATE");
			}
		};
	}

	@Autowired
	private StudentServices studentServices;

	/*
	 * public List<Student> getStudent(){ List<Student> studentList = new
	 * ArrayList<>();
	 * 
	 * Student e = new Student(); e.setId(1); e.setName("Alejandro");
	 * e.setSurname("Burgos"); e.setEmail("a@a.com"); e.setMark(5D);
	 * 
	 * Student e1 = new Student(); e1.setId(2); e1.setName("Diana");
	 * e1.setSurname("Bujor"); e1.setEmail("a@a.com"); e1.setMark(9D);
	 * 
	 * studentList.add(e); studentList.add(e1);
	 * 
	 * return studentList; }
	 */

	@PostMapping("api/students")
	public Student saveStudent(@RequestBody Student student) {

		System.out.println(student);
		studentServices.saveStudent(student);
		return student;
	}

	@GetMapping("api/students")
	public List<Student> get() {
		return studentServices.getAll();
	}

	@GetMapping("api/students/{id}")
	public Student getStudent(@PathVariable("id") Integer id) {
		return studentServices.getStudent(id);
	}

	@PutMapping("api/students")
	public void updateStudent(@RequestBody Student student) {
		studentServices.updateSt(student);

	}

	@DeleteMapping("api/student/{id}")
	public void delete(@PathVariable("id") Integer id) {
		studentServices.delete(id);
	}
}
