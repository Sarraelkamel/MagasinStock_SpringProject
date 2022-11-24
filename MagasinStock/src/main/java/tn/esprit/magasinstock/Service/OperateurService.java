package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.Facture;
import tn.esprit.magasinstock.Entities.Operateur;
import tn.esprit.magasinstock.Repository.FactureRepository;
import tn.esprit.magasinstock.Repository.OperateurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OperateurService implements IOperateur {

    private OperateurRepository operateurRepository;
    private FactureRepository factureRepository;
    @Override
    public List<Operateur> retrieveAllOperateurs() {
        return operateurRepository.findAll();
    }

    @Override
    public Operateur addOperateur(Operateur o) {
        return operateurRepository.save(o);
    }

    @Override
    public Operateur updateOperateur(Operateur o) {
        return operateurRepository.save(o);
    }

    @Override
    public Operateur retrieveOperateur(Long id) {
        return operateurRepository.findById(id).orElse(null);
    }

    @Override
    public void removeOperateur(Long id) {

        operateurRepository.deleteById(id);
    }

    @Override
    public void assignOperateurToFacture(Long idOperateur, Long idFacture) {
        Operateur operateur = operateurRepository.findById(idOperateur).orElse(null);
        Facture facture = factureRepository.findById(idFacture).orElse(null);
        operateur.getFactures().add(facture);
        operateurRepository.save(operateur);

    }

}
