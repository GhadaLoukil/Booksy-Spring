package tn.esprit.booksy.entities;

import com.fasterxml.jackson.annotation.JsonFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Commande {
    @Id
    @GeneratedValue
    private Long id;
    private int numCommande;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate date;
    private String ModePaiement;
    private String status;

    @ManyToOne
    private personne personne;

    public List<personne> getPersonnes() {
        List<personne> l=new ArrayList<>();
        return l;
    }

    public void setPersonne(personne personne) {
        this.personne = personne;
    }

    public Commande() {
    }

    public Commande(Long id, int numCommande, LocalDate date, String modePaiement, String status) {
        this.id = id;
        this.numCommande = numCommande;
        this.date = date;
        ModePaiement = modePaiement;
        this.status = status;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNumCommande() {
        return numCommande;
    }

    public void setNumCommande(int numCommande) {
        this.numCommande = numCommande;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getModePaiement() {
        return ModePaiement;
    }

    public void setModePaiement(String modePaiement) {
        ModePaiement = modePaiement;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Commande{" +
                "id=" + id +
                ", numCommande=" + numCommande +
                ", date=" + date +
                ", ModePaiement='" + ModePaiement + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
