package tn.esprit.booksy.entities;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bookemp")
public class Bookemp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	  private long ISBN ;
	@Column
	    private String auteur , titre , marque , image , description ;
	@Column
	    private Date edition;
	@Column
	    private Date datedebut;
	@Column
	    private Date datefin;
	@Column
	    private double prix ;
	@Column
	    private int quantite ;
	public long getISBN() {
		return ISBN;
	}
	public void setISBN(long iSBN) {
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (int) (ISBN ^ (ISBN >>> 32));
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bookemp other = (Bookemp) obj;
		if (ISBN != other.ISBN)
			return false;
		return true;
	}
	@Override
	public String toString() {
		return "Bookemp [ISBN=" + ISBN + ", auteur=" + auteur + ", titre=" + titre + ", marque=" + marque + ", image="
				+ image + ", description=" + description + ", edition=" + edition + ", datedebut=" + datedebut
				+ ", datefin=" + datefin + ", prix=" + prix + ", quantite=" + quantite + "]";
	}
	public Bookemp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bookemp(long iSBN, String auteur, String titre, String marque, String image, String description,
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
	
	
	
	
}