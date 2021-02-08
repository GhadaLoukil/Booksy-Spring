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

	@Override
	public int ajouterLivreEmp(Bookemp bookemp) {
		return 0;
	}

	@Override
	public int ajouterLivreVente(livreVente livreVente) {
		return 0;
	}

	@Override
	public int ajouterBookToBuy(BookToBuy BookToBuy) {
		return 0;
	}

	@Override
	public void affecterLivreEmpACatergorie(int idLivreEmp, int idCategorie) {

	}

	@Override
	public void affecterLivreVenteACatergorie(int idLivreVente, int idCategorie) {

	}

	@Override
	public void affecterBookToBuyACatergorie(int idBookToBuy, int idCategorie) {

	}

	@Override
	public List<String> getAllLivreEmpNamesByCategorie(int idCategorie) {
		return null;
	}

	@Override
	public List<String> getAllLivreVenteNamesByCategorie(int idCategorie) {
		return null;
	}

	@Override
	public List<String> getAllBookToBuyNamesByCategorie(int idCategorie) {
		return null;
	}
}