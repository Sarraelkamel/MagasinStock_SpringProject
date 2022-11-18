package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.SecteurActivite;

public interface SecteurActiviteRepository extends JpaRepository<SecteurActivite , Long> {
}
