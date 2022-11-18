package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.CategorieProduit;

import java.util.List;

public interface ICategorieProduit {

    List<CategorieProduit> retrieveAllCategorieProduits();

    CategorieProduit addCategorieProduit(CategorieProduit cp);

    CategorieProduit updateCategorieProduit(CategorieProduit cp);

    CategorieProduit retrieveCategorieProduit(Long id);

    void removeCategorieProduit(Long id);
}
