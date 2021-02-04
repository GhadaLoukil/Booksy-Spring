package tn.esprit.booksy.services;

import java.util.List;

import tn.esprit.booksy.entities.*;

public interface Book {
	public BookToBuy addBook(BookToBuy u);
	public void deleteBook (int isbn);
	public BookToBuy updateBook(BookToBuy u);
	List<BookToBuy> retrieveAllBooks();
	BookToBuy retrieveBook(int isbn);
	
}
