package tn.esprit.magasinstock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.magasinstock.Entities.CategorieProduit;
import tn.esprit.magasinstock.Service.ICategorieProduit;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategorieProduitController {

    private ICategorieProduit categorieProduit;

    @GetMapping("/retrieveAllcp")
    List<CategorieProduit> retrieveAllCategorieProduits(){
        return categorieProduit.retrieveAllCategorieProduits();
    }

    @PostMapping("/addcp")
    CategorieProduit add(@RequestBody CategorieProduit cp){
     return categorieProduit.addCategorieProduit(cp);
    }

    @PutMapping("/updatecp")
    CategorieProduit update(@RequestBody CategorieProduit cp){
        return categorieProduit.updateCategorieProduit(cp);
    }
    @GetMapping("/findcp/{id}")
    CategorieProduit retrieveCategorieProduit(@PathVariable Long id){

        return categorieProduit.retrieveCategorieProduit(id);
    }
    @DeleteMapping("/deletecp/{id}")
    void removeCategorieProduit(@PathVariable Long id){
        categorieProduit.removeCategorieProduit(id);
    }

}
