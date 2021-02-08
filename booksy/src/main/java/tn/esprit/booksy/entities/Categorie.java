package tn.esprit.booksy.entities;

import java.io.Serializable;
import java.util.Set;

import javax.persistence.*;


@Entity
@Table(name = "categorie")

public class Categorie implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	 private long Code_categorie;
	@Column
	    private String Nom_Categorie;
	@Column
	    private String Famille;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="categorie")
	private Set<livreVente> LivreVente;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="categorie")
	private Set<BookToBuy> BookToBuy;

	@OneToMany(cascade = CascadeType.ALL, mappedBy="categorie")
	private Set<Bookemp> Bookemp;

		@Override
		public String toString() {
			return "categorie [Code_categorie=" + Code_categorie + ", Nom_Categorie=" + Nom_Categorie + ", Famille="
					+ Famille + "]";
		}
		public Categorie() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Categorie(long code_categorie, String nom_Categorie, String famille) {
			super();
			Code_categorie = code_categorie;
			Nom_Categorie = nom_Categorie;
			Famille = famille;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + (int) (Code_categorie ^ (Code_categorie >>> 32));
			result = prime * result + ((Famille == null) ? 0 : Famille.hashCode());
			result = prime * result + ((Nom_Categorie == null) ? 0 : Nom_Categorie.hashCode());
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
			Categorie other = (Categorie) obj;
			if (Code_categorie != other.Code_categorie)
				return false;
			if (Famille == null) {
				if (other.Famille != null)
					return false;
			} else if (!Famille.equals(other.Famille))
				return false;
			if (Nom_Categorie == null) {
				if (other.Nom_Categorie != null)
					return false;
			} else if (!Nom_Categorie.equals(other.Nom_Categorie))
				return false;
			return true;
		}

		public long getCode_categorie() {
			return Code_categorie;
		}
		public void setCode_categorie(long code_categorie) {
			Code_categorie = code_categorie;
		}
		public String getNom_Categorie() {
			return Nom_Categorie;
		}
		public void setNom_Categorie(String nom_Categorie) {
			Nom_Categorie = nom_Categorie;
		}
		public String getFamille() {
			return Famille;
		}
		public void setFamille(String famille) {
			Famille = famille;
		}
		public static long getSerialversionuid() {
			return serialVersionUID;
		}
	

		
	
}




