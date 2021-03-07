/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import IServiceDao.IDaoGererNvEmprunt;
import entities.Emprunt;
import java.util.List;

/**
 *
 * @author hajer
 */
public class GererNvEmprunt {

    IDaoGererNvEmprunt _dbEmprunt;

    public GererNvEmprunt(IDaoGererNvEmprunt _dbEmprunt) {
        this._dbEmprunt = _dbEmprunt;
    }

    public boolean ajouter(Emprunt e) {
        _dbEmprunt.insert(e);
        return true;

    }

    public List<Emprunt> listeEmprunts() {
        return _dbEmprunt.getListEmprunt();
    }

    public boolean suprimer(Emprunt e) {
        _dbEmprunt.delete(e);
        return true;

    }

}
