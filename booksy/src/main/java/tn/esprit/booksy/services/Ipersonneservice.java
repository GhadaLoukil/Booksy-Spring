package tn.esprit.booksy.services;
import java.util.ArrayList;

import tn.esprit.booksy.entities.personne;
public interface Ipersonneservice {
	 ArrayList<personne> retrieveAllUsers();
	 personne addUser(personne b);
	 void deletepersonne(int id);
	 String updateUser(personne u,int id);
	 personne retrieveUser(int id);

}
