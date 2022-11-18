package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Operateur;

public interface OperateurRepository extends JpaRepository<Operateur , Long> {
}
