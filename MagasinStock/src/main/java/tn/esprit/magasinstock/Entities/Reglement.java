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
public class Reglement implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReglement;
    private float montantPaye;
    private float montantRestant;
    private boolean payee;
    @Temporal(TemporalType.DATE)
    private Date dateReglement;

    @JsonIgnore
    @ManyToOne
    private Facture facture;
}
