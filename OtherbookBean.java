package com.example.demo.Bean;

import com.example.demo.Model.Otherbook;

public class OtherbookBean {
	private Otherbook otherbook;


	public OtherbookBean(Otherbook otherbook) {
		super();
		this.otherbook = otherbook;
	}
	public String getOthersid() {
		return otherbook.getOthersid();
	}

	public String getOtherbookid() {
		return otherbook.getOtherbookid();
	}
	
	public String getOtherbookname() {
		return otherbook.getOtherbookname();
	}
	
	public String getOtherbookauthor() {
		return otherbook.getOtherbookauthor();
	}

	public String getOthercourse() {
		return otherbook.getOthercourse();
	}

	public String getOthersem() {
		return otherbook.getOthersem();
	}

	public String getOtherdate() {
		return otherbook.getOtherdate();
	}

}
