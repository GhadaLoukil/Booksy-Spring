package tn.esprit.booksy.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.repository.CrudRepository;



import tn.esprit.booksy.entities.*;

@Repository
public interface CategorieRepo  extends CrudRepository< Categorie, Long>  {

}