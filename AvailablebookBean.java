package com.example.demo.Bean;

import com.example.demo.Model.Availablebook;

public class AvailablebookBean {
	
	private Availablebook availablebook;


	public AvailablebookBean(Availablebook availablebook) {
		super();
		this.availablebook = availablebook;
	}

	
	public String getBookid() {
		return availablebook.getBookid();
	}
	
	public String getBookname() {
		return availablebook.getBookname();
	}
	public String getBookauther() {
		return availablebook.getBookauther();
	}

	public String getCourse() {
		return availablebook.getCourse();
	}

	public String getDate() {
		return availablebook.getDate();
	}

	

}
