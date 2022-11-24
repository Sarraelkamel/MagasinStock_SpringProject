package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.Fournisseur;
import tn.esprit.magasinstock.Entities.SecteurActivite;
import tn.esprit.magasinstock.Repository.FactureRepository;
import tn.esprit.magasinstock.Repository.FournisseurRepository;
import tn.esprit.magasinstock.Repository.SecteurActiviteRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class SecteurActiviteService implements ISecteurActivite {

    private SecteurActiviteRepository secteurActiviteRepository;
    private FournisseurRepository fournisseurRepository;
    @Override
    public List<SecteurActivite> retrieveAllSecteurActivites() {
        return secteurActiviteRepository.findAll();
    }

    @Override
    public SecteurActivite addSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepository.save(sa);
    }

    @Override
    public SecteurActivite updateSecteurActivite(SecteurActivite sa) {
        return secteurActiviteRepository.save(sa);
    }

    @Override
    public SecteurActivite retrieveSecteurActivite(Long id) {
        return secteurActiviteRepository.findById(id).orElse(null);
    }

    @Override
    public void removeSecteurActivite(Long id) {

        secteurActiviteRepository.deleteById(id);
    }

    @Override
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        SecteurActivite secteurActivite = secteurActiviteRepository.findById(secteurActiviteId).orElse(null);
        fournisseur.getSecteurActivites().add(secteurActivite);
        fournisseurRepository.save(fournisseur);
    }
}
