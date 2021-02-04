package tn.esprit.booksy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.booksy.repository.BookempRepo;

import tn.esprit.booksy.entities.Bookemp;



@Service
public class BookempService implements IBookempService {

	@Autowired
	BookempRepo bookemprepo ;
	
	@Override
	public List<Bookemp> retrieveAllBooks() {
		// TODO Auto-generated method stub
		 List<Bookemp> b= (List<Bookemp>) bookemprepo.findAll();
		 return b ;
	}

	@Override
	public Bookemp addBookemp(Bookemp b) {
		// TODO Auto-generated method stub
		return  bookemprepo.save(b);
	}

	@Override
	public void deleteBookemp(Long id) {
		// TODO Auto-generated method stub
		bookemprepo.deleteById(id);
		
	}

	@Override
	public Bookemp updateBookemp(Bookemp b) {
		// TODO Auto-generated method stub
		return bookemprepo.save(b);
	}

	@Override
	public Bookemp retrieveBookemp(Long id) {
		// TODO Auto-generated method stub
		return bookemprepo.findById(id).get();
	}

}
