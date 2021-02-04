package tn.esprit.booksy.repository;

import org.springframework.data.repository.CrudRepository;

import tn.esprit.booksy.*;
import tn.esprit.booksy.entities.BookToBuy;

public interface BookRspository extends CrudRepository<BookToBuy,Integer>{

}
