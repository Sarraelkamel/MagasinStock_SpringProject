package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Produit;

public interface ProduitRepository extends JpaRepository<Produit , Long> {
}
