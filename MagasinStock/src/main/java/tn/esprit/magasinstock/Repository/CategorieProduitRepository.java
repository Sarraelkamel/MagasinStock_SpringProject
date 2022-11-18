package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.CategorieProduit;

public interface CategorieProduitRepository extends JpaRepository<CategorieProduit , Long> {
}
