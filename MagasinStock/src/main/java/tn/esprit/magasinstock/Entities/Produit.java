package tn.esprit.magasinstock.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Produit implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;

    private String codeProduit;

    private String libelleProduit;

    private float prix;

    @Temporal(TemporalType.DATE)
    private Date dateCreation;

    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;

    @JsonIgnore
    @OneToMany(mappedBy = "produit")
    private Set<DetailFacture> detailFactures;

    @JsonIgnore
    @ManyToOne
    private Stock stock;

    @JsonIgnore
    @ManyToOne
    private CategorieProduit categorieProduit;
}
