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

import tn.esprit.booksy.entities.livreVente;
import tn.esprit.booksy.services.ILivreVenteService;

@RestController
public class livreVenteController {

	@Autowired
	ILivreVenteService ILV;
	
	// http://localhost:8081/SpringMVC/servlet/retrieve-all-books
	 @GetMapping("/retrieve-all-books")
	 @ResponseBody
	 public List<livreVente> getBooks() {
	 List<livreVente> list = ILV.retrieveAllBooks();
	 return list;
	 }
	  
	  
	// http://localhost:8081/SpringMVC/servlet/retrieve-book/{book-ISBN}
	   @GetMapping("/retrieve-book/{book-ISBN}")
	   @ResponseBody
	   public livreVente retrieveBook(@PathVariable("book-ISBN") String bookISBN) {
	   return ILV.retrieveLivre(Long.parseLong(bookISBN));	   }
	   
	// Ajouter livre : http://localhost:8081/SpringMVC/servlet/add-book
	    @PostMapping("/add-book")
	    @ResponseBody
	    public livreVente addBook(@RequestBody livreVente l) {
	    livreVente lv = ILV.addLivre(l);
	    return lv;
	    }
	    
	     // http://localhost:8081/SpringMVC/servlet/remove-book/{book-ISBN}
	     @DeleteMapping("/remove-book/{book-ISBN}")
	     @ResponseBody
	     public void removeBook(@PathVariable("book-ISBN") String bookISBN) {
	     ILV.deletelivreVente(Long.parseLong(bookISBN));
	     }
	    
	     // http://localhost:8081/SpringMVC/servlet/modify-book
	     @PutMapping("/modify-book")
	     @ResponseBody
	     public livreVente modifyBook(@RequestBody livreVente lv) {
	     return ILV.updateLivre(lv);
	     }
	   
}
