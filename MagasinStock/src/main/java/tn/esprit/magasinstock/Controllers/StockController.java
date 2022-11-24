package tn.esprit.magasinstock.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.magasinstock.Service.IStock;

@RestController
@AllArgsConstructor
public class StockController {

    private IStock iStock;

    @GetMapping("/schedular")
    void retrieveStatusStock(){
        iStock.retrieveStatusStock();
    }
}
