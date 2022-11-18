package tn.esprit.magasinstock.Service;

import tn.esprit.magasinstock.Entities.Operateur;

import java.util.List;

public interface IOperateur {
    List<Operateur> retrieveAllOperateurs();

    Operateur addOperateur (Operateur o);

    Operateur updateOperateur (Operateur o);

    Operateur retrieveOperateur (Long id);

    void removeOperateur (Long id);
}
