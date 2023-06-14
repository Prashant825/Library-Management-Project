package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	
	private String sid;
	private String bookid;
	private String bookname;
	private String bookauther;
	private String course;
	private String sem;
	private String date;
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
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
	public String getSem() {
		return sem;
	}
	public void setSem(String sem) {
		this.sem = sem;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Book(String sid, String bookid, String bookname, String bookauther, String course, String sem, String date) {
		super();
		this.sid = sid;
		this.bookid = bookid;
		this.bookname = bookname;
		this.bookauther = bookauther;
		this.course = course;
		this.sem = sem;
		this.date = date;
	}
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	

}
