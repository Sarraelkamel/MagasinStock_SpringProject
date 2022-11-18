package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.Fournisseur;

import java.util.List;

public interface IFournisseur {

    List<Fournisseur> retrieveAllFournisseurs();
    Fournisseur addFournisseur (Fournisseur f);
    Fournisseur updateFournisseur (Fournisseur f);
    Fournisseur retrieveFournisseur (Long id);
}
