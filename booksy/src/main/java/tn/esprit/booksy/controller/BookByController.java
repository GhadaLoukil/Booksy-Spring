package tn.esprit.booksy.controller;

import java.util.ArrayList;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.booksy.*;
import tn.esprit.booksy.entities.*;

import tn.esprit.booksy.entities.*;
import tn.esprit.booksy.services.BookBuyService;


@RestController
//@RequestMapping("api/bookemp")
public class BookByController {
	@Autowired
	BookBuyService BookBuy ;

	@GetMapping("/getAllBook")
	@ResponseBody
	public ArrayList<BookToBuy> retrieveAllBookemps() {
		// TODO Auto-generated method stub
		return (ArrayList<BookToBuy>) BookBuy.retrieveAllBooks() ;
	

}
	
	
	@PostMapping
	public BookToBuy addBook(@RequestBody BookToBuy b) {
		// TODO Auto-generated method stub
		return  BookBuy.addBook(b);
	}
	
	@DeleteMapping("{id}")

	public void deleteBook(@PathVariable int isbn) {
		
		BookBuy.deleteBook(isbn);
	}
	@PutMapping("{id}")
	
	public BookToBuy  updateBook (@RequestBody BookToBuy b) {
		return  BookBuy.addBook(b);
	
		
		
	}
	
    @GetMapping("{id}")


	public BookToBuy retrieveBook(@PathVariable int isbn) {
		return BookBuy.retrieveBook(isbn);
		
	}
}
