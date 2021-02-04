package tn.esprit.booksy.services;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.booksy.repository.LivreVenteRepository;
import tn.esprit.booksy.entities.*;

@Service

public class livreVenteService implements ILivreVenteService {
	private static final Logger L=LogManager.getLogger(livreVenteService.class);
	
	@Autowired
	LivreVenteRepository LivreAVendreRepository;

	@Override
	public List<livreVente> retrieveAllBooks() {
		List<livreVente> l= (List<livreVente>) LivreAVendreRepository.findAll();
		return l;
	}

	@Override
	public livreVente addLivre(livreVente l) {
		livreVente lv=LivreAVendreRepository.save(l);
		return lv;
	}

	@Override
	public void deletelivreVente(Long id) {
		LivreAVendreRepository.deleteById(id);		
	}

	@Override
	public livreVente updateLivre(livreVente l) {
		return LivreAVendreRepository.save(l);
	}

	@Override
	public livreVente retrieveLivre(Long id) {
		return LivreAVendreRepository.findById(id).get();
	}
}
