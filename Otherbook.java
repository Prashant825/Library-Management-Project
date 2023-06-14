package com.example.demo.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Otherbook {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ID;
	
	private String othersid;
	private String otherbookid;
	private String otherbookname;
	private String otherbookauthor;
	private String othercourse;
	private String othersem;
	private String otherdate;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getOthersid() {
		return othersid;
	}
	public void setOthersid(String othersid) {
		this.othersid = othersid;
	}
	public String getOtherbookid() {
		return otherbookid;
	}
	public void setOtherbookid(String otherbookid) {
		this.otherbookid = otherbookid;
	}
	public String getOtherbookname() {
		return otherbookname;
	}
	public void setOtherbookname(String otherbookname) {
		this.otherbookname = otherbookname;
	}
	public String getOtherbookauthor() {
		return otherbookauthor;
	}
	public void setOtherbookauthor(String otherbookauthor) {
		this.otherbookauthor = otherbookauthor;
	}
	public String getOthercourse() {
		return othercourse;
	}
	public void setOthercourse(String othercourse) {
		this.othercourse = othercourse;
	}
	public String getOthersem() {
		return othersem;
	}
	public void setOthersem(String othersem) {
		this.othersem = othersem;
	}
	public String getOtherdate() {
		return otherdate;
	}
	public void setOtherdate(String otherdate) {
		this.otherdate = otherdate;
	}
	public Otherbook(String othersid, String otherbookid, String otherbookname, String otherbookauthor,
			String othercourse, String othersem, String otherdate) {
		super();
		this.othersid = othersid;
		this.otherbookid = otherbookid;
		this.otherbookname = otherbookname;
		this.otherbookauthor = otherbookauthor;
		this.othercourse = othercourse;
		this.othersem = othersem;
		this.otherdate = otherdate;
	}
	public Otherbook() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
}
