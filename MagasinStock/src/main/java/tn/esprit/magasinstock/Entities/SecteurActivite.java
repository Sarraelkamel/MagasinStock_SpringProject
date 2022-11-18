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
public class SecteurActivite implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idSecteurActivite;

    private String codeSecteurActivite;

    private String libelleSecteurActivite;

    @JsonIgnore
    @ManyToMany(mappedBy = "secteurActivites")
    private Set<Fournisseur> fournisseurs = new HashSet<>();
}
