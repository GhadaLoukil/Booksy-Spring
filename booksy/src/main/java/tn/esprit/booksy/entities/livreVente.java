package tn.esprit.booksy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "T_SellBook")
public class livreVente implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
	  private Long ISBN ;
	@Column
	    private String auteur , titre , marque , image , description ;
	@Column
	    private Date edition;
	@Temporal(TemporalType.DATE)
	    private Date datedebut;
	@Temporal(TemporalType.DATE)
	    private Date datefin;
	@Column
	    private double prix ;
	@Column
	    private int quantite;
	
		public Long getISBN() {
			return ISBN;
		}
		public void setISBN(Long iSBN) {
			ISBN = iSBN;
		}
		public String getAuteur() {
			return auteur;
		}
		public void setAuteur(String auteur) {
			this.auteur = auteur;
		}
		public String getTitre() {
			return titre;
		}
		public void setTitre(String titre) {
			this.titre = titre;
		}
		public String getMarque() {
			return marque;
		}
		public void setMarque(String marque) {
			this.marque = marque;
		}
		public String getImage() {
			return image;
		}
		public void setImage(String image) {
			this.image = image;
		}
		public String getDescription() {
			return description;
		}
		public void setDescription(String description) {
			this.description = description;
		}
		public Date getEdition() {
			return edition;
		}
		public void setEdition(Date edition) {
			this.edition = edition;
		}
		public Date getDatedebut() {
			return datedebut;
		}
		public void setDatedebut(Date datedebut) {
			this.datedebut = datedebut;
		}
		public Date getDatefin() {
			return datefin;
		}
		public void setDatefin(Date datefin) {
			this.datefin = datefin;
		}
		public double getPrix() {
			return prix;
		}
		public void setPrix(double prix) {
			this.prix = prix;
		}
		public int getQuantite() {
			return quantite;
		}
		public void setQuantite(int quantite) {
			this.quantite = quantite;
		}
		public livreVente(Long iSBN, String auteur, String titre, String marque, String image, String description,
				Date edition, Date datedebut, Date datefin, double prix, int quantite) {
			super();
			ISBN = iSBN;
			this.auteur = auteur;
			this.titre = titre;
			this.marque = marque;
			this.image = image;
			this.description = description;
			this.edition = edition;
			this.datedebut = datedebut;
			this.datefin = datefin;
			this.prix = prix;
			this.quantite = quantite;
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		public livreVente() {
			super();
		}
	
	    
	    
}
