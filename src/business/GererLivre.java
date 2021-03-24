/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package business;

import IServiceDao.IDaoGererLivre;
import entities.Livre;
import java.util.List;

/**
 *
 * @author hajer
 */
public class GererLivre {

    IDaoGererLivre _DBLivre;

    public GererLivre(IDaoGererLivre db) {
        this._DBLivre = db;
    }

   public  boolean ajouter(Livre l) {
        _DBLivre.insert(l);
        return true;

    }

     public List<Livre> listeLivres() {
        return _DBLivre.getListLivre();

    }

    public boolean supprimer(Livre l) {
        _DBLivre.delete(l);
        return true;

    }

}
