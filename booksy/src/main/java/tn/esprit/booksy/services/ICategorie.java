package tn.esprit.booksy.services;

import java.util.List;


import tn.esprit.booksy.entities.*;
public interface ICategorie {

		
        List<Categorie> retrieveAllCategorie();
		Categorie addCategorie(Categorie cat);
		void deleteCategorie(Long id);
		Categorie updateCategorie(Categorie cat);
		Categorie retrieveCategorie(Long id);
		int ajouterLivreEmp(Bookemp bookemp);
		int ajouterLivreVente(livreVente livreVente);
		int ajouterBookToBuy(BookToBuy BookToBuy);
		void affecterLivreEmpACatergorie(int idLivreEmp, int idCategorie);
		void affecterLivreVenteACatergorie(int idLivreVente, int idCategorie);
		void affecterBookToBuyACatergorie(int idBookToBuy, int idCategorie);
		List<String>getAllLivreEmpNamesByCategorie(int idCategorie);
		List<String>getAllLivreVenteNamesByCategorie(int idCategorie);
		List<String>getAllBookToBuyNamesByCategorie(int idCategorie);
	}

