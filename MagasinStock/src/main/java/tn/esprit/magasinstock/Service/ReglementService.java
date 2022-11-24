package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.Facture;
import tn.esprit.magasinstock.Entities.Reglement;
import tn.esprit.magasinstock.Repository.FactureRepository;
import tn.esprit.magasinstock.Repository.ReglementRepository;

import java.util.Date;
import java.util.List;

@Service
@AllArgsConstructor
public class ReglementService implements IReglement{

    private ReglementRepository reglementRepository;
    private FactureRepository factureRepository;
    @Override
    public List<Reglement> retrieveReglementByFacture(Long idFacture) {
        return reglementRepository.findByFactureIdFacture(idFacture);
    }

    @Override
    public Reglement addReglement(Reglement r, Long idFacture) {
        Facture facture = factureRepository.findById(idFacture).orElse(null);
        Reglement reglement = reglementRepository.findById(r.getIdReglement()).orElse(null);
        float montantEffectue = reglement.getMontantPaye();
        float montantFacture = facture.getMontantFacture();
        List<Reglement> reglementList = reglementRepository.findByFactureIdFacture(idFacture);
        Reglement reg = reglementList.get(reglementList.size());
        if (montantEffectue <= reg.getMontantRestant()) {
            reglementRepository.save(r);
        }

            return r;
    }

    @Override
    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate){
        float chiffre_affaire = 0;

        List<Reglement> reglementList = reglementRepository.findByFactureArchiveeAndDateReglementBetween(false, startDate,endDate);
        for (Reglement r : reglementList){
            chiffre_affaire = chiffre_affaire + r.getMontantPaye();

        }
        return chiffre_affaire;
    }
}
