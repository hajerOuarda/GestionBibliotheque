/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IServiceDao;

import entities.Emprunt;
import java.util.List;

/**
 *
 * @author hajer
 */
public interface IDaoGererNvEmprunt {
    public void insert(Emprunt e);
    public List<Emprunt> getListEmprunt();
    public void delete(Emprunt e);
}
