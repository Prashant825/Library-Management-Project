package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Admin;
import com.example.demo.Repository.AdminRepository;

@Service
public class AdminService {

	@Autowired
	private AdminRepository adminRepo;

// Create Admin Account..
	public String createAccount(String email, String username, String password) {
		if (adminRepo.existsByEmailAndUsernameAndPassword(email, username, password)) {
			return "/Admin/exists";
		}
		Admin admin = new Admin(email, username, password);
		adminRepo.save(admin);
		return "/Admin/success";
	}

	public String loginAccount(String username, String password) {
		if (adminRepo.existsByUsernameAndPassword(username, password)) {

			return "/Admin/panel";
		}
		return "/Admin/error";
	}

	// Delete Admin Account..
	public String deleteAccount(String email, String username, String password) {
		if (adminRepo.existsByEmailAndUsernameAndPassword(email, username, password)) {
			for (Admin admin : adminRepo.findAll()) {
				adminRepo.delete(admin);
			}
			return "index";
		}
		return "/Admin/error";
	}

	// Update Admin Username..
	public String updateUsername(String email, String newusername, String password) {
		Admin admin = null;
		if (adminRepo.existsByEmailAndPassword(email, password) && newusername != null) {
			admin = adminRepo.findByEmailAndPassword(email, password);
			admin.setUsername(newusername);
			adminRepo.save(admin);
			return "/Admin/success";
		}
		return "/admin/error";
	}

	// Update Admin Password...
	public String updatePassword(String email, String username, String newpassword) {
		Admin admin = null;
		if (adminRepo.existsByEmailAndUsername(email, username) && newpassword != null) {
			admin = adminRepo.findByEmailAndUsername(email, username);
			admin.setPassword(newpassword);
			adminRepo.save(admin);

			return "/Admin/success";
		}
		return "/Admin/error";

	}

}
