/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpDao;

import IServiceDao.IDaoGererLivre;
import entities.Auteur;
import entities.Livre;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hajer
 */
public class DaoImpGererLivre implements IDaoGererLivre {

    Connection cnx = ConnectionToDb.connexion();

    @Override
    public void insert(Livre l) {
        int isbn = l.getIsbn();
        String titre = l.getTitre();
        String theme = l.getTheme();
      
        int idAuteur = l.getIdAuteur();

        try {

            String requet = "insert into livre (isbn,titre,theme,idAut) values(?,?,?,?) ";

            PreparedStatement ps = cnx.prepareStatement(requet);
            ps.setInt(1, isbn);
            ps.setString(2, titre);
            ps.setString(3, theme);
            ps.setInt(4, idAuteur);

            ps.execute();
            ps.close();

        } catch (SQLException ex) {
            System.out.println("|| Execption ||"+ex.getMessage());
            
        }

        System.out.println("insertion livre " + isbn + " , " + titre + "  avec succee");
    }

    @Override
    public List<Livre> getListLivre() {
        List<Livre> listeLivres = new ArrayList<Livre>();
        
        int idAut = 0;
       
        try {

            String requet = "select * from livre ";

            Statement ps = cnx.createStatement();
            ResultSet rs = ps.executeQuery(requet);
            while (rs.next()) {
                Livre livre = new Livre(rs.getInt("isbn"), rs.getString("titre"), rs.getString("theme"));
                idAut = rs.getInt("idAut");
           

                listeLivres.add(livre);

            }
            
            ps.close();

        } catch (SQLException ex) {
           System.out.println("|| Execption ||"+ex.getMessage());
        }

        System.out.println(" selection de liste de livres avec succee");

        return listeLivres;
    }

    @Override
    public void delete(Livre l) {
       int isbn=l.getIsbn();
        System.out.println(isbn);
     try {

            String requet = "delete from livre where isbn = ? ";

           PreparedStatement ps=cnx.prepareStatement(requet);
           ps.setInt(1, isbn);
            ps.execute();
            ps.close();

        } catch (SQLException ex) {
           System.out.println("|| Execption ||"+ex.getMessage());
        }
        System.out.println("deleted ");
       
    }

}


    

 
