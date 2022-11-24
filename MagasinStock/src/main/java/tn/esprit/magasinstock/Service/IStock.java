package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.Stock;

import java.util.List;

public interface IStock {

    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock s);

    Stock retrieveStock(Long id);

    void removeStock(Long id);

    void retrieveStatusStock();
}
