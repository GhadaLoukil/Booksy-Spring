package tn.esprit.booksy.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.booksy.entities.*;
import tn.esprit.booksy.services.*;
@RestController
public class CategorieController {
	

	@Autowired
	ICategorie icategorie ;
		// http://localhost:8084/SpringMVC/servlet/retrieve-all-categories
		 @GetMapping("/retrieve-all-categories")
		 @ResponseBody
		 public List<Categorie> getCategories() {
		 List<Categorie> list = icategorie.retrieveAllCategorie();
		 return list;
		 }
		// http://localhost:8084/SpringMVC/servlet/retrieve-categorie/{categorie-id}
		  @GetMapping("/retrieve-categorie/{categorie-id}")
		   @ResponseBody
		   public Categorie retrieveCategorie(@PathVariable("categorie-id") Long categorieId) {
		   return icategorie.retrieveCategorie(categorieId);
		   }
		// http://localhost:8084/SpringMVC/servlet/add-categorie
		    @PostMapping("/add-categorie")
		    @ResponseBody
		    public Categorie addCategorie(@RequestBody Categorie cat) {
		    Categorie categorie = icategorie.addCategorie(cat);
		    return categorie;
		    }
		    // http://localhost:8084/SpringMVC/servlet/remove-categorie/{categorie-id}
		     @DeleteMapping("/remove-categorie/{categorie-id}")
		     @ResponseBody
		     public void deleteCategorie(@PathVariable("categorie-id") long categorieId) {
		    	 icategorie.deleteCategorie(categorieId);
		     }
		    
		     // http://localhost:8084/SpringMVC/servlet/modify-categorie
		     @PutMapping("/modify-categorie")
		     @ResponseBody
		     public Categorie updateCategorie(@RequestBody Categorie categorie) {
		     return icategorie.updateCategorie(categorie);
		     }
		   
}
