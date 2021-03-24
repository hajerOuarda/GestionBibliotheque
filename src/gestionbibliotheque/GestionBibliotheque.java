/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestionbibliotheque;

import ServiceImpDao.DaoImpGererLivre;
import ServiceImpDao.DaoImpGererNvEmprunt;
import business.GererLivre;
import business.GererNvEmprunt;
import entities.Emprunt;
import entities.Livre;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author hajer
 */
public class GestionBibliotheque extends Application {

    Livre l1 = new Livre(1025, "titre1", "theme 1", 1);
    Livre l2 = new Livre(1026, "titre2", "theme 2", 2);
    DaoImpGererLivre impLivre = new DaoImpGererLivre();
    GererLivre gLivre = new GererLivre(impLivre);
    
    
    Emprunt emp=new Emprunt("1/1/1", "1/1/2");
    DaoImpGererNvEmprunt impEmp =new DaoImpGererNvEmprunt();
    GererNvEmprunt gereEmp=new GererNvEmprunt(impEmp);

    @Override
    public void start(Stage primaryStage) {
        Button btn = new Button();
        btn.setText("Say 'Hello World'");

        btn.setOnAction((event) -> {
            gereEmp.ajouter(emp);

//            List<Livre> mylist= gLivre.listeLivres();
//            System.out.println(mylist);
 //      gLivre.supprimer(l2);
        });

        StackPane root = new StackPane();
        root.getChildren().add(btn);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
