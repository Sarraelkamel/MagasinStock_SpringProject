package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.DetailFacture;
import tn.esprit.magasinstock.Entities.Facture;
import tn.esprit.magasinstock.Entities.Fournisseur;
import tn.esprit.magasinstock.Repository.DetailFactureRepository;
import tn.esprit.magasinstock.Repository.FactureRepository;
import tn.esprit.magasinstock.Repository.FournisseurRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class FactureService implements IFacture{

    private FactureRepository factureRepository;
    private FournisseurRepository fournisseurRepository;
    private DetailFactureRepository detailFactureRepository;
    @Override
    public List<Facture> retrieveAllFactures() {
        return factureRepository.findAll();
    }

    @Override
    public void cancelFacture(Long id) {

        Facture facture = factureRepository.findById(id).orElse(null);
        if(facture.getArchivee()== false)
        facture.setArchivee(true);

    }

    @Override
    public Facture retrieveFacture(Long id) {
        return factureRepository.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByFournisseur(Long idFournisseur) {
        return factureRepository.findByFournisseurIdFournisseur(idFournisseur);
    }

    @Override
    public Facture addFacture(Facture f, Long idFournisseur) {

        Fournisseur fournisseur = fournisseurRepository.findById(idFournisseur).orElse(null);
        Facture facture = factureRepository.findById(f.getIdFacture()).orElse(null);
        Long idFacture = facture.getIdFacture();
        DetailFacture detailFacture = detailFactureRepository.findByFactureIdFacture(idFacture);
        fournisseur.getFactures().add(facture);
        detailFacture.setFacture(facture);
        return factureRepository.save(facture);
    }
}
