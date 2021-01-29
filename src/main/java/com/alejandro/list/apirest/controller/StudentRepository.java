package com.alejandro.list.apirest.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alejandro.list.apirest.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
