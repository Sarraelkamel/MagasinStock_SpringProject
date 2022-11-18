package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.DetailFournisseur;
import tn.esprit.magasinstock.Entities.Fournisseur;
import tn.esprit.magasinstock.Repository.DetailFournisseurRepository;
import tn.esprit.magasinstock.Repository.FournisseurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class FournisseurService implements IFournisseur{

    private FournisseurRepository fournisseurRepository;
    private DetailFournisseurRepository detailFournisseurRepository;
    @Override
    public List<Fournisseur> retrieveAllFournisseurs() {
        return fournisseurRepository.findAll();
    }

    @Override
    public Fournisseur addFournisseur(Fournisseur f) {
        DetailFournisseur detailFournisseur = new DetailFournisseur();
        detailFournisseurRepository.save(detailFournisseur);
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
}
