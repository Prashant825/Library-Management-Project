package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.Book;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

	

	Book[] findAllBySidAndSem(String sid, String sem);

	
	boolean existsBySidAndBookidAndSem(String sid, String bookid, String sem);


	boolean existsByBookid(String bookid);


	boolean existsByCourse(String course);


	boolean existsBySid(String sid);


	boolean existsBySem(String sem);


	Book[] findAllBySem(String sem);


	

	
	

}
