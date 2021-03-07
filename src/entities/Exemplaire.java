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
public class Exemplaire extends Livre{
    int codeExmplr;

    public Exemplaire() {
    }

    public Exemplaire(int codeExmplr, int isbn, String titre, String theme) {
        super(isbn, titre, theme);
        this.codeExmplr = codeExmplr;
    }

    public Exemplaire(int codeExmplr, int isbn, String titre, String theme, int idAuteur) {
        super(isbn, titre, theme, idAuteur);
        this.codeExmplr = codeExmplr;
    }

   


    

    

   
    

    public int getCodeExmplr() {
        return codeExmplr;
    }

    public void setCodeExmplr(int codeExmplr) {
        this.codeExmplr = codeExmplr;
    }
    
}
