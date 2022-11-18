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
public class Fournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFournisseur;

    private String codeFournisseur;

    private String libelleFournisseur;

    @Enumerated(EnumType.STRING)
    private CategorieFournisseur categorieFournisseur;

    @JsonIgnore
    @OneToMany(mappedBy = "fournisseur")
    private Set<Facture> factures;

    @JsonIgnore
    @OneToOne
    private DetailFournisseur detailFournisseur;

    @JsonIgnore
    @ManyToMany
    private Set<SecteurActivite> secteurActivites= new HashSet<>();
}
