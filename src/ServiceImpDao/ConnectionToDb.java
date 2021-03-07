/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServiceImpDao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author hajer
 */
public class ConnectionToDb {

    static Connection cnx;

    public static Connection connexion() {

        if (cnx == null) {

            String user = "root";
            String password = "";
            String dbname = "bibliotheque";

            try {
                Class.forName("com.mysql.jdbc.Driver");
                cnx = DriverManager.getConnection("jdbc:mysql://localhost/" + 
                        dbname + "?" + "user=" + user + "&password=" + password + "");
            
            } catch (SQLException e) {
                e.printStackTrace();
                System.out.println("Execption");
            } catch (ClassNotFoundException ex) {
                ex.printStackTrace();
            }

        }

        return cnx;
    }
}
