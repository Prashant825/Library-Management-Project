package com.example.demo.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Availablebook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	
	
	private String bookid;
	private String bookname;
	private String bookauther;
	private String course;
	private String date;
	

	
	
	public String getBookid() {
		return bookid;
	}
	public void setBookid(String bookid) {
		this.bookid = bookid;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getBookauther() {
		return bookauther;
	}
	public void setBookauther(String bookauther) {
		this.bookauther = bookauther;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
		public Availablebook( String bookid, String bookname, String bookauther, String course, String date
			) {
		super();
		
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauther = bookauther;
		this.course = course;
		this.date = date;
		
	}
		public Availablebook() {
			super();
			// TODO Auto-generated constructor stub
		}
		
	
	
	

}
