package tn.esprit.booksy.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
//@Table(name="booktobuy")
public class BookToBuy implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue (strategy = GenerationType.IDENTITY)
private int isbn;
@Column
private String titre;
@Column
private String auteur;
@Column
private String description;
@Column
private Double prix;
@Column
private int quantite;
@Column
private String marque;
@Column
private int category_id;
@Temporal(TemporalType.DATE)
private Date edition ;

	public BookToBuy() {

	}

	public void setTitre (String s)
{this.titre= s;}
public void setAuteur (String a)
{this.auteur= a;}
public void setDescription (String desc)
{this.description= desc;}
public void setPrix(double p)
{this.prix= p;}
public void setQuantite (int q)
{this.quantite= q;}
public void setDate (Date m)
{
	this.edition=m;}
public void setCategory(int cat)
{this.category_id=cat;}
public String getTitre (){
	return this.titre;
}
public String getAuteur(){
	return this.auteur;
}
public String getDescription (){
	return this.description;
}
public double getPrix()
{return this.prix;}
public int getQuantite()
{
	return this.quantite;}

public String getMarque (){
	return this.marque;
}
public int getCategorie (){
	return this.category_id;
	}
public Date getEdition()
{return this.edition;}

public BookToBuy(int isbn , String titre, String auteur , String description , double prix , int quantite , String marque , Date d , int cat )
{this.isbn = isbn ;
this.titre = titre;
this.auteur= auteur ; 
this.description = description ; 
this.prix=prix ; 
this.quantite=quantite;
this.marque=marque;
this.edition=d;
this.category_id=cat;
	}
}