package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Fournisseur;

public interface FournisseurRepository extends JpaRepository<Fournisseur , Long> {
}
