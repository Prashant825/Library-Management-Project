package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Availablebook;

@Repository
public interface AvailablebookRepository extends JpaRepository<Availablebook, Integer> {

	Availablebook[] findAllByBookname(String bookname);

	boolean existsByCourse(String course);

	boolean existsByBookname(String bookname);

	

	boolean existsByBookid(String bookid);

	
	boolean existsByBookauther(String bookauther);

	


	

	

	

}
