package tn.esprit.booksy.services;

import java.util.List;


import tn.esprit.booksy.entities.*;
public interface ICategorie {

		
        List<Categorie> retrieveAllCategorie();
		Categorie addCategorie(Categorie cat);
		void deleteCategorie(Long id);
		Categorie updateCategorie(Categorie cat);
		Categorie retrieveCategorie(Long id);
	}

