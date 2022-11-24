package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.Facture;

import java.util.List;

public interface IFacture {

    List<Facture> retrieveAllFactures();
    void cancelFacture(Long id);
    Facture retrieveFacture(Long id);

    List<Facture> getFacturesByFournisseur(Long idFournisseur);

    Facture addFacture(Facture f, Long idFournisseur);
}
