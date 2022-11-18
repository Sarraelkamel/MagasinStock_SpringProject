package tn.esprit.magasinstock.Entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DetailFacture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFacture;

    private int qteCommande;

    private float prixTotalDetail;
    private int pourcentageRemise;
    private float montantRemise;

    @ManyToOne
    private Facture facture;

    @ManyToOne
    private Produit produit;
}
