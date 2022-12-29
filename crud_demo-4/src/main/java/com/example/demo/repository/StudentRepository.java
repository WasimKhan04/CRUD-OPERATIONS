package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.Student;

public interface StudentRepository extends CrudRepository<Student, Long> {
	Student findByCourse(String course);

}
