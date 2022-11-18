package tn.esprit.magasinstock.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.magasinstock.Entities.Stock;

public interface StockRepository extends JpaRepository<Stock , Long> {
}
