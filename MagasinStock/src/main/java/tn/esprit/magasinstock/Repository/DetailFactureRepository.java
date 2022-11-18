package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.DetailFacture;

public interface DetailFactureRepository extends JpaRepository<DetailFacture , Long> {
}
