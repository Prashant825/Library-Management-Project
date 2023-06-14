package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Model.Otherbook;



@Repository
public interface OtherbookRepository extends JpaRepository<Otherbook, Integer> {

	
	
	

	boolean existsByOthercourse(String othercourse);

	boolean existsByOthersem(String othersem);

	boolean existsByOthersid(String othersid);

	boolean existsByOtherbookid(String otherbookid);

	boolean existsByOthersidAndOtherbookidAndOthersem(String othersid, String otherbookid, String othersem);

	Otherbook[] findAllByOthersidAndOthersem(String othersid, String othersem);

	
	

	
	

	
	
	
	


}
