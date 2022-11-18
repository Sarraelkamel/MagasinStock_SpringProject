package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.DetailFournisseur;

public interface DetailFournisseurRepository extends JpaRepository<DetailFournisseur , Long> {
}
