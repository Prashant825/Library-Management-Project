package com.example.demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Student;
import com.example.demo.Repository.StudentRepository;

@Service
public class StudentService {

	@Autowired
	private StudentRepository studentRepo;

	// Student Registration API...
	public String studentReg(String rollno, String name, String email, String password) {
		if (studentRepo.existsByRollnoAndNameAndEmailAndPassword(rollno, name, email, password)) {
			return "/Student/userexists";
		}
		Student stud = new Student(rollno, name, email, password);
		studentRepo.save(stud);
		return "/Student/success";
	}

	// Student Login...1``
	public String studentLogin(String rollno, String password) {
		if (studentRepo.existsByRollnoAndPassword(rollno, password)) {
			return "/Student/studentpanel";
		}
		return "/Student/error";
	}

	public String updatePassword(String email, String name, String newpassword) {
		Student stud = null;
		if (studentRepo.existsByEmailAndName(email, name) && newpassword != null) {
			stud = studentRepo.findByEmailAndName(email, name);
			stud.setPassword(newpassword);
			studentRepo.save(stud);
			return "/Student/success";
		}
		return "/Student/error";

	}

	public String updateRollno(String email, String password, String newrollno) {
		if (studentRepo.existsByEmailAndPassword(email, password) && newrollno != null) {
			Student stud = null;
			stud = studentRepo.findByEmailAndPassword(email, password);
			stud.setRollno(newrollno);
			studentRepo.save(stud);
			return "/Student/success";
		}
		return "/Student/error";
	}

	public String deleteStudent(String email, String rollno, String password) {
		if (studentRepo.existsByEmailAndRollnoAndPassword(email, rollno, password)) {
			for (Student stud : studentRepo.findAll()) {
				studentRepo.delete(stud);
			}
			return "/index";
		}

		return "/Student/error";
	}

}
