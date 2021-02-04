package tn.esprit.booksy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.booksy.entities.personne;

@Repository
public interface personnerepo extends CrudRepository<personne, Integer> {

}
