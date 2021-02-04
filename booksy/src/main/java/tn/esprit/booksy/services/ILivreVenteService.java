package tn.esprit.booksy.services;

import java.util.List;

import tn.esprit.booksy.entities.*;

public interface ILivreVenteService {
	List<livreVente> retrieveAllBooks();
	livreVente addLivre(livreVente l);
	void deletelivreVente(Long id);
	livreVente updateLivre(livreVente l);
	livreVente retrieveLivre(Long id);

}
