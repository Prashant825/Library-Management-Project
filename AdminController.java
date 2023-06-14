package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.AdminService;

@Controller
public class AdminController {
	
	@Autowired private AdminService adminServ;
	
	@GetMapping("/index")
	public String getAdminfront() {
		return "/index";
		
}

	@GetMapping("/panel")
	public String getAdmin() {
		return "/Admin/panel";
		
}
	@GetMapping("/login")
	public String LoginAdmin() {
		return "/Admin/login";
	}
	
	@GetMapping("/registion")
	public String RegistionAdmin() {
		return "/Admin/register";
	}
	//for create Admin Account..
	@GetMapping("/createAccont")
	public String createAccount(@RequestParam("email") String email, @RequestParam("username")
	String username, @RequestParam("password") String password) {
		return adminServ.createAccount(email,username,password);
	}
	
	//login Admin Account..
	@GetMapping("/loginAdmin")
	public String loginAccount(@RequestParam("username") String username, 
			@RequestParam("password") String password) {
		return adminServ.loginAccount(username, password);
	}
	
	@GetMapping("/deleteadmin")
	public String deleteAdmin() {
		return "/Admin/deleteadmin";
	}
	
	//delete Admin Account..
	@GetMapping("/deleteAdmin")
	public String deleteAccount(@RequestParam("email") String email, 
			@RequestParam("username") String username, @RequestParam("password") String password) {
	return adminServ.deleteAccount(email,username,password);
	}
	
	@GetMapping("/updateadminusername")
	public String updateUsername() {
		return "/Admin/updateadminusername";
	}
	//update Admin username...
	@GetMapping("/updateUsername")
	public String updateAccount(@RequestParam("email") String email,
			@RequestParam("newusername")String newusername,
			@RequestParam("password")String password) {
		return adminServ.updateUsername(email,newusername,password);
		
	}
	
	@GetMapping("/updateadminpassword")
	public String updateadminpassword() {
		return "/Admin/updateadminpassword";
	}
	
	//update Admin password...
	@GetMapping("/updatePassword")
	public String updatePassword(@RequestParam("email")String email,@RequestParam("username")String username,
			@RequestParam("newpassword")String newpassword) {
		return adminServ.updatePassword(email,username,newpassword);
	}
	
}
