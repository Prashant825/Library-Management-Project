package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

	boolean existsByRollnoAndNameAndEmailAndPassword(String rollno, String name, String email, String password);


	boolean existsByEmailAndName(String email, String name);

	Student findByEmailAndName(String email, String name);

	

	boolean existsByRollnoAndPassword(String rollno, String password);


	boolean existsByEmailAndRollnoAndPassword(String email, String rollno, String password);


	Student findByEmailAndPassword(String email, String password);


	boolean existsByEmailAndPassword(String email, String password);

	
	

	
	

}
