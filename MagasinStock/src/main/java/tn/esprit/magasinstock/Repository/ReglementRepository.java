package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Reglement;

public interface ReglementRepository extends JpaRepository<Reglement , Long> {
}
