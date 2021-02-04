package tn.esprit.booksy.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.booksy.entities.BookToBuy;
import tn.esprit.booksy.repository.BookRspository;

@Service
public class BookBuyService implements Book{
	private static final Logger L=LogManager.getLogger(BookBuyService.class);
	@Autowired
	BookRspository Repository;
	@Override
	public BookToBuy addBook(BookToBuy u) {
	Repository.save(u);
		return u;
	}

	@Override
	public BookToBuy updateBook(BookToBuy u) {
		return Repository.save(u);
	}
	
	@Override
	public List<BookToBuy> retrieveAllBooks() {		
List<BookToBuy> l= (List<BookToBuy>)Repository.findAll();
return l;
	}
	@Override
	public BookToBuy retrieveBook(int isbn) {
		return Repository.findById(isbn).get();
	}

	@Override
	public void deleteBook(int isbn) {
	Repository.deleteById(isbn);
		
	}

	

	
	
}
