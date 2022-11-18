package tn.esprit.magasinstock.Entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class CategorieProduit implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idCategorieProduit;

    private String codeProduit;

    private String libelleCategorieProduit;

    @JsonIgnore
    @OneToMany(mappedBy = "categorieProduit")
    private Set<Produit> produits= new HashSet<>();
}
