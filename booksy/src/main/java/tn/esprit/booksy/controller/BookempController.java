package tn.esprit.booksy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.esprit.booksy.services.IBookempService;

import tn.esprit.booksy.entities.Bookemp;

@RestController
public class BookempController {
	@Autowired
	IBookempService bookempservice ;

	 // http://localhost:8081/Booksy/servlet/retrieve-all-Books
	@GetMapping("/retrieve-all-Books")
	 @ResponseBody
	 public List<Bookemp> retrieveAllBooks() {
	 List<Bookemp> list =  bookempservice.retrieveAllBooks() ;
		return list;
		}
	
	// http://localhost:8081/Booksy/servlet/add-book
	@PostMapping("/add-bookemp")
	@ResponseBody
	public Bookemp addBookemp(@RequestBody Bookemp b) {
		// TODO Auto-generated method stub
		return bookempservice.addBookemp(b);
      }
	//http://localhost:8081/Booksy/servlet/remove-book/{id}
	@DeleteMapping("/remove-book/{id}")
	 @ResponseBody
	public void deleteBookemp(@PathVariable Long id) {
		// TODO Auto-generated method stub
		bookempservice.deleteBookemp(id);
	}
	
	
	//http://localhost:8081/Booksy/servlet/update-book/{id}
	@PutMapping("/update-book/{id}")
	 @ResponseBody
	public Bookemp  updateBookemp (@RequestBody Bookemp b) {
		return  bookempservice.addBookemp(b);
		}
//	http://localhost:8081/Booksy/servlet/retrieve-book/{id}
		  @GetMapping("/retrieve-book/{id}")
		   @ResponseBody
		public Bookemp retrieveBookemp(@PathVariable Long id) {
			return bookempservice.retrieveBookemp(id);
		}
		
		
		
		
	}
	
	
	
	
	
