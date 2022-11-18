package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.Operateur;
import tn.esprit.magasinstock.Repository.OperateurRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class OperateurService implements IOperateur {

    private OperateurRepository operateurRepository;
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
}
