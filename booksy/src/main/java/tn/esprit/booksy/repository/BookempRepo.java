package tn.esprit.booksy.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.esprit.booksy.entities.Bookemp;

@Repository
public interface BookempRepo  extends CrudRepository< Bookemp, Long>  {

}
