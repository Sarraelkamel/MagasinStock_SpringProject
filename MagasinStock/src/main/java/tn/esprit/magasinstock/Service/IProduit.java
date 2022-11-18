package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.Produit;

import java.util.List;

public interface IProduit {

    List<Produit> retrieveAllProduits();

    Produit addProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit updateProduit (Produit p, Long idCategorieProduit, Long idStock);

    Produit retrieveProduit(Long id);
}
