package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Reglement;

import java.util.Date;
import java.util.List;

public interface ReglementRepository extends JpaRepository<Reglement , Long> {

    List<Reglement> findByFactureIdFacture(Long idFacture);


    List<Reglement> findByFactureArchiveeAndDateReglementBetween(boolean archive, Date startDate, Date endDate);
}
