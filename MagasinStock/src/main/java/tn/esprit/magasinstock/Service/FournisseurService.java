package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.DetailFournisseur;
import tn.esprit.magasinstock.Entities.Fournisseur;
import tn.esprit.magasinstock.Entities.SecteurActivite;
import tn.esprit.magasinstock.Repository.DetailFournisseurRepository;
import tn.esprit.magasinstock.Repository.FournisseurRepository;
import tn.esprit.magasinstock.Repository.SecteurActiviteRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@AllArgsConstructor
public class FournisseurService implements IFournisseur{

    private FournisseurRepository fournisseurRepository;
    private SecteurActiviteRepository secteurActiviteRepository;

    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur updateFournisseur(Fournisseur f) {
        return fournisseurRepository.save(f);
    }

    @Override
    public Fournisseur retrieveFournisseur(Long id) {
        return fournisseurRepository.findById(id).orElse(null);
    }

    @Override
    @Transactional
    public void assignSecteurActiviteToFournisseur(Long fournisseurId, Long secteurActiviteId) {
        Fournisseur fournisseur = fournisseurRepository.findById(fournisseurId).orElse(null);
        SecteurActivite secteurActivite = secteurActiviteRepository.findById(secteurActiviteId).orElse(null);
        fournisseur.getSecteurActivites().add(secteurActivite);
        //fournisseurRepository.save(fournisseur); 5ater @Transac yatsir lkol ya maysir chy
    }
}
