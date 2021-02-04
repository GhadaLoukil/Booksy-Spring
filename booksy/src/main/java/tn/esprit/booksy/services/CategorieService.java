package tn.esprit.booksy.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.booksy.entities.*;
import tn.esprit.booksy.repository.CategorieRepo;
@Service
public class CategorieService implements ICategorie {
	@Autowired
	CategorieRepo CategorieRepo;
	@Override
	public java.util.List<Categorie> retrieveAllCategorie() {
		List<Categorie> l= (List<Categorie>) CategorieRepo.findAll();
		return l;
	}

	@Override
	public Categorie addCategorie(Categorie cat) {
		CategorieRepo.save(cat);
		return cat;
	}

	@Override
	public void deleteCategorie(Long id) {
		CategorieRepo.deleteById(id);
		
	}

	@Override
	public Categorie updateCategorie(Categorie cat) {
		return CategorieRepo.save(cat);
	}

	@Override
	public Categorie retrieveCategorie(Long id) {
		return CategorieRepo.findById(id).get();

	}
}