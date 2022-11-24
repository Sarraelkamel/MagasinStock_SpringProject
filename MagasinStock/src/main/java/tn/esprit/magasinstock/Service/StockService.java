package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.Stock;
import tn.esprit.magasinstock.Repository.StockRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class StockService implements IStock {

    private StockRepository stockRepository;
    @Override
    public List<Stock> retrieveAllStocks() {
        return stockRepository.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock updateStock(Stock s) {
        return stockRepository.save(s);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return stockRepository.findById(id).orElse(null);
    }

    @Override
    public void removeStock(Long id) {
        stockRepository.deleteById(id);

    }

    @Override
    @Scheduled(cron ="*/10 * * * * *")  // 15:58:04=> first lancement :  16:15:10
        // si (cron = "*/10)" elle se lance immedia et se repete chaque 10s 15:58:04=>first lancement :  16:15:14
        //  second lancement :  16:15:24
    /*fixedRate = 60000 repeter chaque minute (en ms)
        fixeddelay = 60000 : faire un retard de 60 seconde
        cron("sec,min,heure,jour,mois,joursemaine")
        */
    public void retrieveStatusStock(){
        List<Stock> stocks = stockRepository.findAll();

        for(Stock s : stocks){
            if(s.getQteMin()>s.getQte())
                System.out.println(s.toString());
        }
    }
}
