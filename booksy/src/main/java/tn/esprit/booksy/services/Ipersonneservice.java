package tn.esprit.booksy.services;
import java.util.ArrayList;
import java.util.List;

import tn.esprit.booksy.entities.Commande;
import tn.esprit.booksy.entities.personne;
public interface Ipersonneservice {
	 ArrayList<personne> retrieveAllUsers();
	 personne addUser(personne b);
	 void deletepersonne(int id);
	 String updateUser(personne u,int id);
	 personne retrieveUser(int id);
	 public int ajouterCommande(Commande commande);
	 public void affecterCommanderAPersonne(int idCommande, int idPersonne);
	 List<String> getAllCommandeByPersonne(int idPersonne, int idCommande);

}
