package tn.esprit.booksy.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.booksy.entities.Commande;
import tn.esprit.booksy.repository.CommandeRepository;

import java.util.List;

@Service
public class CommandeServices implements ICommandeServices{

    @Autowired
    CommandeRepository commandeRepository;


    @Override
    public Commande save(Commande commande) {
        return commandeRepository.save(commande);
    }

    @Override
    public Commande findById(Long id) {
        return commandeRepository.findById(id).orElse(null);
    }

    @Override
    public List<Commande> findAll() {
        return commandeRepository.findAll();
    }

    @Override
    public void deleteById(Long id) {
         commandeRepository.deleteById(id);
    }
}
