package tn.esprit.magasinstock.Service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.magasinstock.Entities.*;
import tn.esprit.magasinstock.Repository.CategorieProduitRepository;
import tn.esprit.magasinstock.Repository.ProduitRepository;
import tn.esprit.magasinstock.Repository.StockRepository;

import java.util.List;

@Service
@AllArgsConstructor
public class ProduitService implements IProduit{
    private ProduitRepository produitRepository;
    private CategorieProduitRepository categorieProduitRepository;
    private StockRepository stockRepository;

    @Override
    public List<Produit> retrieveAllProduits() {
        return produitRepository.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idCategorieProduit, Long idStock) {

        CategorieProduit categorieProduit = categorieProduitRepository.findById(idCategorieProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setStock(stock);
        p.setCategorieProduit(categorieProduit);
        return produitRepository.save(p);
    }

    @Override
    public Produit updateProduit(Produit p, Long idCategorieProduit, Long idStock) {
        CategorieProduit categorieProduit = categorieProduitRepository.findById(idCategorieProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        p.setStock(stock);
        p.setCategorieProduit(categorieProduit);
        return produitRepository.save(p);
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return produitRepository.findById(id).orElse(null);
    }
    @Override
    public void assignProduitToStock(Long idProduit, Long idStock){

        Produit produit = produitRepository.findById(idProduit).orElse(null);
        Stock stock = stockRepository.findById(idStock).orElse(null);
        produit.setStock(stock);
        produitRepository.save(produit);
    }


}
