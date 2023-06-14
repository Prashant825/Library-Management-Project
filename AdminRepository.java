package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer>   {


	boolean existsByEmailAndUsername(String email, String username);

	Admin findByEmailAndUsername(String email, String username);


	boolean existsByEmailAndUsernameAndPassword(String email, String username, String password);

	boolean existsByEmailAndPassword(String email, String password);

	Admin findByEmailAndPassword(String email, String password);

	boolean existsByUsernameAndPassword(String username, String password);

   


	
	

	


}
