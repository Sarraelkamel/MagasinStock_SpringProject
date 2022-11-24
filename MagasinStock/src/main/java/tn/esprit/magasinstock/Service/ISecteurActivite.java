package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.SecteurActivite;

import java.util.List;

public interface ISecteurActivite {
    List<SecteurActivite> retrieveAllSecteurActivites();

    SecteurActivite addSecteurActivite (SecteurActivite sa);

    SecteurActivite updateSecteurActivite (SecteurActivite sa);

    SecteurActivite retrieveSecteurActivite (Long id);

    void removeSecteurActivite (Long id);

    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) ;
}
