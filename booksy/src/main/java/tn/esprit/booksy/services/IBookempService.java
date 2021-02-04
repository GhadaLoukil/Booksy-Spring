package tn.esprit.booksy.services;

import java.util.List;

import tn.esprit.booksy.entities.Bookemp;

public interface IBookempService {
	List<Bookemp> retrieveAllBooks();
	Bookemp addBookemp(Bookemp b);
	void deleteBookemp(Long id);
	Bookemp updateBookemp(Bookemp b);
	Bookemp retrieveBookemp(Long id);
}
