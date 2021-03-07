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
public class Livre {
   
    private int isbn;
    private String titre;
    private String theme;
    private int idAuteur;

    public Livre() {
    }

    public Livre(int isbn, String titre, String theme) {
        this.isbn = isbn;
        this.titre = titre;
        this.theme = theme;
    }

    public Livre(int isbn, String titre, String theme, int idAuteur) {
        this.isbn = isbn;
        this.titre = titre;
        this.theme = theme;
        this.idAuteur = idAuteur;
    }

   

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

   
    
   

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getIdAuteur() {
        return idAuteur;
    }

    public void setIdAuteur(int idAuteur) {
        this.idAuteur = idAuteur;
    }

    

    public String getTheme() {
        return theme;
    }

    public void setTheme(String theme) {
        this.theme = theme;
    }

    @Override
    public String toString() {
        return "Livre{" + "isbn=" + isbn + ", titre=" + titre + ", theme=" + theme + ", nom auteur =" + idAuteur + '}';
    }

    
}
