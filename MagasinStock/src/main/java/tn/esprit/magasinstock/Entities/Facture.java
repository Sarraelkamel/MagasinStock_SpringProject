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
public class Facture implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFacture;
    private float montantRemise;
    private float montantFacture;

    @Temporal(TemporalType.DATE)
    private Date dateCreationFacture;

    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;

    private Boolean archivee;

    @JsonIgnore
    @OneToMany(mappedBy = "facture")
    private Set<DetailFacture> detailFactures;

    @JsonIgnore
    @OneToMany(mappedBy = "facture")
    private Set<Reglement> reglements;

    @JsonIgnore
    @ManyToOne
    private Fournisseur fournisseur;
}
