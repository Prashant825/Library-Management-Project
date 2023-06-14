package com.example.demo.Bean;

import com.example.demo.Model.Book;

public class BookBean {

	private Book book;

	public BookBean(Book book) {
		super();
		this.book = book;
	}

	public String getSid() {
		return book.getSid();

	}

	public String getBookid() {
		return book.getBookid();
	}
	public String getBookname() {
		return book.getBookname();
	}
	public String getBookauther() {
		return book.getBookauther();
	}

	public String getCourse() {
		return book.getCourse();
	}

	public String getSem() {
		return book.getSem();
	}

	public String getDate() {
		return book.getDate();
	}

}
