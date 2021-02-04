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
import tn.esprit.booksy.entities.personne;
import tn.esprit.booksy.services.Ipersonneservice;



@RestController
@RequestMapping("/api/bookemp/")
public class personnecontroller {
	
	
	@Autowired
	
	Ipersonneservice personneservice;

	@GetMapping("/getAllBook")
	@ResponseBody
	public ArrayList<personne> retrieveAllPersonne() {
		// TODO Auto-generated method stub
		return (ArrayList<personne>) personneservice.retrieveAllUsers() ;
	

}
	
	
	@PostMapping
	public personne addPersonne(@RequestBody personne b) {
		// TODO Auto-generated method stub
		return  personneservice.addUser(b);
	}
	
	@DeleteMapping("{id}")

	public void deletePersonne(@PathVariable int id) {
		// TODO Auto-generated method stub
		 personneservice.deletepersonne(id);
	}
	@PutMapping("{id}")
	
	public personne updatePersonne(@RequestBody personne b) {
		return   personneservice.addUser(b);
	
		
		
	}
	
    @GetMapping("{id}")


	public personne retrievePersonne(@PathVariable int id) {
		return  personneservice.retrieveUser(id);
		
	}
	
	
	
	
}
