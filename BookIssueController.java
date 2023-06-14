package com.example.demo.Controller;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.Bean.AvailablebookBean;
import com.example.demo.Bean.BookBean;
import com.example.demo.Bean.OtherbookBean;

import com.example.demo.Service.BookService;
import com.example.demo.Service.OtherbookService;

@Controller
public class BookIssueController {

	@Autowired
	private BookService bookServ;
	

	@Autowired
	private OtherbookService otherbookServ;
	
	@GetMapping("/bookissue")
	public String BookIssue() {
		return "/Book/bookissue";
		
	}

	// BookIssue by Admin...
	@GetMapping("/bookIssue")
	public String bookIssue(@RequestParam("sid") String sid,
			@RequestParam("bookid") String bookid,@RequestParam("bookname") String bookname, @RequestParam("bookauther") String bookauther, @RequestParam("course") String course,
			@RequestParam("sem") String sem, @RequestParam("date") String date) {

		return bookServ.bookIssue(sid, bookid, bookname,bookauther, course, sem, date);
	}
	
	
	@GetMapping("/Addbook")
	public String AddBook() {
		return "/Book/addbook";
		
	}
	
	@GetMapping("/AddBook")
	public String AddBook(@RequestParam("bookid") String bookid, @RequestParam("bookname") String bookname, @RequestParam("bookauther") String bookauther, @RequestParam("course") String course,
			@RequestParam("date") String date) {

		return bookServ.AddBook( bookid,bookname,bookauther, course,date);
	}
	
	@GetMapping("/otherbookissue")
	public String otherbookissue() {
		return "/Book/Otherbookissue";
	}

	// Other book Issue...
	@GetMapping("/OtherbookIssue")
	public String OtherbookIssue(@RequestParam("othersid") String othersid,
			@RequestParam("otherbookid") String otherbookid, @RequestParam("otherbookname") String otherbookname, @RequestParam("otherbookauthor") String otherbookauthor,
			@RequestParam("othercourse") String othercourse,
			@RequestParam("othersem") String othersem, @RequestParam("otherdate") String otherdate) {

		return bookServ.OtherbookIssue(othersid, otherbookid,otherbookname, otherbookauthor, othercourse, othersem, otherdate);
	}
	
	@GetMapping("/deletebook")
	public String deleteBook() {
		return "/Book/Bookreturn";
	}
	

	// Book delete..
	@GetMapping("/deleteBook")
	public String deleteBook(@RequestParam("sid") String sid, @RequestParam("bookid") String bookid,
			@RequestParam("sem") String sem) {
		return bookServ.deleteBook(sid, bookid, sem);
	}
	
	@GetMapping("/otherbookdelete")
	public String otherbokkdelete() {
		return "/Book/otherbookreturn";
	}

	// Other Book Delete..
	@GetMapping("/otherBookdel")
	public String otherBookdel(@RequestParam("othersid") String othersid, @RequestParam("otherbookid") String otherbookid,
			@RequestParam("othersem") String othersem) {
		return bookServ.otherBookdel(othersid, otherbookid, othersem);
	}
	
	@GetMapping("/fetchbook")
	public String fetchbook() {
		return "/Book/showbook";
	}

	// Show Book which are issue by the Student....

	@GetMapping("/fetchBook")
	public String fetchBook(Model model, @RequestParam("sid") String sid, @RequestParam("sem") String sem) {
		List<BookBean> list = bookServ.findAllBySidAndSem(sid, sem);
		model.addAttribute("book", list);
		return "/Book/table";

	}
	
	@GetMapping("/fetchotherbook")
	public String fetchotherbook() {
		return "/Book/showotherbook";
	}

	// show other book which are issue by the student...

	@GetMapping("/fetchOtherbook")
	public String fetchOtherbook(Model model, @RequestParam("othersid") String othersid, @RequestParam("othersem") String othersem) {
		List<OtherbookBean> list = otherbookServ.findAllByOthersidAndOthersem(othersid, othersem);
		model.addAttribute("otherbook", list);
		return "/Book/table2";
	}

	//show all book by semester..
	
	@GetMapping("/Allbook")
	public String Allbook() {
		return "/Book/allbook";
	}
	
	@GetMapping("/AllBook")
	public String fetchAllbook(Model model, @RequestParam("sem") String sem) {
		List<BookBean> list = bookServ.findAllBySem(sem);
		model.addAttribute("book", list);
		return "/Book/allbookshow";
	}
	@GetMapping("/ShowAvailablebook")
	public String Availablebook() {
		return "/Book/availablebook";
	}
	
	@GetMapping("/Availablebook")
	public String fetchAvailablebook(Model model, @RequestParam("bookname") String bookname) {
		List<AvailablebookBean> list = bookServ.findAllByBookname(bookname);
		model.addAttribute("availablebook2", list);
		return "/Book/showavailablebook";
	}
}
