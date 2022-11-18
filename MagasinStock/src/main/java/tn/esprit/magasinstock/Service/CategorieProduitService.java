package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.CategorieProduit;
import tn.esprit.magasinstock.Repository.CategorieProduitRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class CategorieProduitService implements ICategorieProduit{

    private CategorieProduitRepository categorieProduitRepository;

    @Override
    public List<CategorieProduit> retrieveAllCategorieProduits() {
        return categorieProduitRepository.findAll();
    }

    @Override
    public CategorieProduit addCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit updateCategorieProduit(CategorieProduit cp) {
        return categorieProduitRepository.save(cp);
    }

    @Override
    public CategorieProduit retrieveCategorieProduit(Long id) {
        return categorieProduitRepository.findById(id).orElse(null);
    }

    @Override
    public void removeCategorieProduit(Long id) {

        categorieProduitRepository.deleteById(id);
    }
}
