package tn.esprit.booksy.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.booksy.entities.Commande;
import tn.esprit.booksy.services.CommandeServices;

import java.util.List;

@RestController
@RequestMapping("api/commande")
public class CommandeController {

    @Autowired
    CommandeServices commandeServices;

    @PostMapping
    public Commande save(@RequestBody Commande commande) {
        return commandeServices.save(commande);
    }

    @PutMapping
    public Commande update(@RequestBody Commande commande) {
        return commandeServices.save(commande);
    }

    @GetMapping("{id}")
    public Commande findById(@PathVariable Long id) {
        return commandeServices.findById(id);
    }

    @GetMapping
    public List<Commande> findAll() {
        return commandeServices.findAll();
    }

    @DeleteMapping
    public void deleteById(@PathVariable Long id) {
        commandeServices.deleteById(id);
    }

}
