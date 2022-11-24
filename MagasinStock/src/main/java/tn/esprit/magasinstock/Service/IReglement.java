package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.Reglement;

import java.util.Date;
import java.util.List;

public interface IReglement {

    public List<Reglement> retrieveReglementByFacture(Long idFacture);

    Reglement addReglement(Reglement r, Long idFacture);

    public float getChiffreAffaireEntreDeuxDate(Date startDate, Date endDate);
}
