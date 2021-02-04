package tn.esprit.booksy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.booksy.entities.livreVente;


@Repository
public interface LivreVenteRepository extends CrudRepository <livreVente, Long> {

}
