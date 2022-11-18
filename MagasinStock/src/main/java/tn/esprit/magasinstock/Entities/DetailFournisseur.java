package tn.esprit.magasinstock.Entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class DetailFournisseur implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idDetailFournisseur;

    @Temporal(TemporalType.DATE)
    private Date dateDebutCollaboration;

    private String adresse;
    private String matricule;

    @JsonIgnore
    @OneToOne(mappedBy = "detailFournisseur")
    private Fournisseur fournisseur;
}
