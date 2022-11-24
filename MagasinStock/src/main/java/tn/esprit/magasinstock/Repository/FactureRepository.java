package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Facture;

import java.util.List;

public interface FactureRepository extends JpaRepository<Facture , Long> {

    List<Facture> findByFournisseurIdFournisseur(Long idfournisseur);


}
