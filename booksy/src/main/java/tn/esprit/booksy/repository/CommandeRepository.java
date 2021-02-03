package tn.esprit.booksy.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.booksy.entities.Commande;

public interface CommandeRepository extends JpaRepository<Commande,Long> {
}
