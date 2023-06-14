package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Service.StudentService;

@Controller
public class StudentController {
	
	@Autowired private StudentService studentServ;
	
	@GetMapping("/studentpanel")
	public String getAdmin() {
		return "/Student/studentpanel";
		
}
	@GetMapping("/CreateAccount")
	public String CreateAccount() {
		return "/Student/studentregister";
	}
	
	//Student Registration...
	@GetMapping("/studentReg")
	public String studentReg(@RequestParam("rollno")String rollno,@RequestParam("name")String name,
			@RequestParam("email")String email,@RequestParam("password") String password){
				return studentServ.studentReg(rollno,name,email,password);
			}
	
	
	@GetMapping("/StudentLogin")
	public String StudentLogin() {
		return "/Student/studentlogin";
	}
	
	//Student Login...
	@GetMapping("/studentLogin")
	public String studentLogin(@RequestParam("rollno")String rollno,@RequestParam("password")
	String password) {
		return studentServ.studentLogin(rollno, password);
		
	}
	
	@GetMapping("/UpdateStudentPassword")
	public String studentUpdatePass() {
		return "/student/updatestudentpassword";
	}
	
	//Student Forgot password...
	@GetMapping("/updateStudentPassword")
	public String updatePassword(@RequestParam("email")String email,@RequestParam("name")
	String name, @RequestParam("newpassword")String newpassword) {
		return studentServ.updatePassword(email, name,newpassword);
	}

	@GetMapping("/UpdateStudentRollno")
	public String UpdateRollno() {
		return "/Student/updatestudentrollno";
	}
	
	//Student Forgot rollno...
	@GetMapping("/updateRollno")
	public String updateRollno(@RequestParam("email")String email, 
	String name,@RequestParam("newrollno")String newrollno, @RequestParam("password")String password) {
		return studentServ.updateRollno(email, password,newrollno);
	}
	
	@GetMapping("/DeleteStudentAccount")
	public String deleteStudentAccount() {
		return "/Student/deletestudentaccount";
	}
	
	//Student Delete Account..
	@GetMapping("/deleteStudentAccount")
	public String deleteStudent(@RequestParam("email")String email,@RequestParam("rollno")
	String rollno,@RequestParam("password")String password) {
		return studentServ.deleteStudent(email,rollno,password);
	}
		


}
