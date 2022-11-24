package tn.esprit.magasinstock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableScheduling
@SpringBootApplication
public class MagasinStockApplication {

    public static void main(String[] args) {
        SpringApplication.run(MagasinStockApplication.class, args);
    }

}
