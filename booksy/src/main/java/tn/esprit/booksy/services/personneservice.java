package tn.esprit.booksy.services;

import java.util.ArrayList;

import java.util.Optional;
import java.util.logging.LogManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.apache.logging.log4j.*;
import java.util.logging.Logger;

import tn.esprit.booksy.repository.*;
import tn.esprit.booksy.entities.personne;


@Service
public class personneservice implements Ipersonneservice {
@Autowired
personnerepo personnerepo;
//private static final Logger  L = (Logger) LogManager.getLogger(personne.class);
    
  
	@Override
	public ArrayList<personne> retrieveAllUsers() {
		
		  return (ArrayList<personne>) personnerepo.findAll();
	}

	@Override
	public personne addUser(personne b) {
		 return  personnerepo.save(b);
	
	}

	@Override
	public void deletepersonne(int id) {
		personnerepo.deleteById(id);
		
	}

	@Override
	public String updateUser(personne u,int id) {
		Optional<personne> v =personnerepo.findById(id);

		if (!v.isPresent())
			return "not found";

		u.setId(id);
		
		personnerepo.save(u);
		return "found";
		
	}

	@Override
	public personne retrieveUser( int id) {
		// TODO Auto-generated method stub
		return personnerepo.findById(id).get();
	}









}
