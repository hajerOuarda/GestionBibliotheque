/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

/**
 *
 * @author hajer
 */
public class Auteur {
     private int idAut;
    private String prenom;
    private String nom;
    private String Adresse;

    public Auteur() {
    }
    

    public Auteur(int id, String prenom, String nom, String Adresse) {
        this.idAut = id;
        this.prenom = prenom;
        this.nom = nom;
        this.Adresse = Adresse;
    }

    public int getId() {
        return idAut;
    }

    public void setId(int id) {
        this.idAut = id;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getAdresse() {
        return Adresse;
    }

    public void setAdresse(String Adresse) {
        this.Adresse = Adresse;
    }

    @Override
    public String toString() {
        return "Auteur{" + "id=" + idAut + ", prenom=" + prenom + ", nom=" + nom + ", Adresse=" + Adresse + '}';
    }
    
    
}
