package tn.esprit.booksy.services;

import tn.esprit.booksy.entities.Commande;

import java.util.List;

public interface ICommandeServices {
    public Commande save(Commande commande);
    public Commande findById(Long id);
    public List<Commande> findAll();
    public void deleteById(Long id);

}
