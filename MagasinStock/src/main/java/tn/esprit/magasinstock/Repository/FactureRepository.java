package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Facture;

public interface FactureRepository extends JpaRepository<Facture , Long> {
}
