package com.example.demo.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Bean.AvailablebookBean;
import com.example.demo.Bean.BookBean;
import com.example.demo.Model.Availablebook;
import com.example.demo.Model.Book;
import com.example.demo.Model.Otherbook;
import com.example.demo.Repository.AvailablebookRepository;
import com.example.demo.Repository.BookRepository;
import com.example.demo.Repository.OtherbookRepository;

@Service
public class BookService {
	
	@Autowired private BookRepository bookRepo;
	
	@Autowired private OtherbookRepository otherbookRepo;
	
	@Autowired private AvailablebookRepository availablebookRepo;

	
	//BookIssue by Admin...
	public String bookIssue(String sid, String bookid, String bookname,String bookauther,String course, String sem, String date) {
		if(bookRepo.existsBySid(sid)&&bookRepo.existsByBookid(bookid)&&bookRepo.existsByCourse(course)&&bookRepo.existsBySem(sem)) {
			return "/Book/bookexists";
		}
		
		Book book =new Book(sid,bookid,bookname,bookauther,course,sem,date);
		bookRepo.save(book);
		

		
		return "/Admin/success";
		 
		
	}
	
	//Issue Other book by Admin
	public String OtherbookIssue(String othersid, String otherbookid, String otherbookname, String otherbookauthor, String othercourse, String othersem, String otherdate) {
		if(otherbookRepo.existsByOthersid(othersid)&&otherbookRepo.existsByOthercourse(othercourse) 
				&& otherbookRepo.existsByOtherbookid(otherbookid) && otherbookRepo.existsByOthersem(othersem)) {
			return "/Book/bookexists";
		}
		Otherbook otherbook =new Otherbook(othersid,otherbookid,otherbookname,otherbookauthor,othercourse,othersem,otherdate);
		otherbookRepo.save(otherbook);
		return "/Admin/success";
	}

	
	//Book delete by Admin
	public String deleteBook(String sid, String bookid, String sem) {
		if(bookRepo.existsBySidAndBookidAndSem(sid,bookid,sem)) {
			for(Book book : bookRepo.findAll()) {
				bookRepo.delete(book);
			}
			return "/Admin/success";
		}
		return "/Book/booknotexists";
	}

	//Delete other book by Admin..
	public String otherBookdel(String othersid, String otherbookid, String othersem) {
		if(otherbookRepo.existsByOthersidAndOtherbookidAndOthersem(othersid,otherbookid,othersem)) {
			for(Otherbook otherbook : otherbookRepo.findAll()) {
				otherbookRepo.delete(otherbook);
			}
			return "/Admin/success";
		}
		return "/Admin/booknotexists";
	}
	
	// Book Show by Admin..
	public List<BookBean> findAllBySidAndSem(String sid, String sem) {
		List<BookBean> list = new ArrayList<BookBean>();
		for(Book book : bookRepo.findAllBySidAndSem(sid,sem)) {
			list.add(new BookBean(book));
			
		}
		return list;
	}

	public List<BookBean> findAllBySem(String sem) {
		List<BookBean> list = new ArrayList<BookBean>();
		for(Book book : bookRepo.findAllBySem(sem)) {
			list.add(new BookBean(book));
		}
		return list;
	}
// Show Available book in library...

	public List<AvailablebookBean> findAllByBookname(String bookname) {
		List<AvailablebookBean> list = new ArrayList<AvailablebookBean>();
		for(Availablebook availablebook : availablebookRepo.findAllByBookname(bookname)) {
			list.add(new AvailablebookBean(availablebook));
		}
		return list;
	}

	public String AddBook(String bookid, String bookname, String bookauther, String course, String date) {
       
		if( availablebookRepo.existsByCourse(course)
				&& availablebookRepo.existsByBookname(bookname)&&availablebookRepo.existsByBookauther(bookauther)) {
			return "/Book/bookexists";
		}
		Availablebook availablebook =new Availablebook(bookid,bookname, bookauther,course,date);
		availablebookRepo.save(availablebook);
		return "/Admin/success";
	}

	
	
	

			
}
