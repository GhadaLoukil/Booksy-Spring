package tn.esprit.booksy.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "personne")
public class personne implements Serializable{
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY) 
	
	 private int id;
	@Column
	    private String nom;
	@Column
	    private String prenom;
	@Column
	    private String sex;
	@Column
	    private String email;
	@Column
	    private String motdepasse;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="personne")
	private Set<Commande> commandes;

	public Set<Commande> getCommandes() {
		return commandes;
	}

	public void setCommandes(Set<Commande> commandes) {
		this.commandes = commandes;
	}

	@Column
	    private int numero;
		public personne(int id, String nom, String prenom, String sex, String email, String motdepasse, int numero) {
			super();
			this.id = id;
			this.nom = nom;
			this.prenom = prenom;
			this.sex = sex;
			this.email = email;
			this.motdepasse = motdepasse;
			this.numero = numero;
			
		}
		public personne() {
			super();
		}
		@Override
		public boolean equals(Object arg0) {
			// TODO Auto-generated method stub
			return super.equals(arg0);
		}
		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}
		@Override
		public String toString() {
			// TODO Auto-generated method stub
			return super.toString();
		}
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNom() {
			return nom;
		}
		public void setNom(String nom) {
			this.nom = nom;
		}
		public String getPrenom() {
			return prenom;
		}
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex = sex;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getMotdepasse() {
			return motdepasse;
		}
		public void setMotdepasse(String motdepasse) {
			this.motdepasse = motdepasse;
		}
		public int getNumero() {
			return numero;
		}
		public void setNumero(int numero) {
			this.numero = numero;
		}
		
		
		
		
		
}
