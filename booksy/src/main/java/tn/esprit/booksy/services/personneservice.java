package tn.esprit.booksy.services;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.esprit.booksy.entities.Commande;
import tn.esprit.booksy.repository.*;
import tn.esprit.booksy.entities.personne;


@Service
public class personneservice implements Ipersonneservice {
@Autowired
personnerepo personnerepo;

//private static final Logger  L = (Logger) LogManager.getLogger(personne.class);
    
	CommandeRepository commandeRepository;
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

	@Override
	public int ajouterCommande(Commande commande) {
		commandeRepository.save(commande);
		return commande.getNumCommande();
	}

	@Override

	public void affecterCommanderAPersonne(int idCommande, int idPersonne) {
		personne personneManagerEntity=personnerepo.findById(idPersonne).get();
		Commande CommandeManagerEntity=commandeRepository.findById((long) idCommande).get();
		personneManagerEntity.getCommandes().add(CommandeManagerEntity);

	}

	@Override
	public List<String> getAllCommandeByPersonne(int idPersonne, int idCommande) {
		personne personneManagerEntity=personnerepo.findById(idPersonne).get();
		List<String> commandes=new ArrayList<>();
		for(Commande commande  : personneManagerEntity.getCommandes()){
			commandes.add(String.valueOf(commande.getNumCommande()));
		}
		return commandes;
	}


}
