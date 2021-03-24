/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpDao;

import IServiceDao.IDaoGererNvEmprunt;
import entities.Emprunt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author hajer
 */
public class DaoImpGererNvEmprunt implements IDaoGererNvEmprunt{

    Connection cnx = ConnectionToDb.connexion();
    
    @Override
    public void insert(Emprunt e) {
       
        String date = e.getDateEmprunt();
        String dateRetour = e.getDateRetourEmprunt();
      
       
        try {

            String requet = "insert into emprunt (dateEmprunt,dateRetourEmprunt) values(?,?) ";

            PreparedStatement ps = cnx.prepareStatement(requet);
            ps.setString(1, date);
            ps.setString(2, dateRetour);
          

            ps.execute();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("|| Execption ||"+ex.getMessage());
            
        }

        System.out.println("insertion    avec succee");
    }

    @Override
    public List<Emprunt> getListEmprunt() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Emprunt e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
