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
public class Emprunt {
    int idEmprunt;
    String dateEmprunt;
    String dateRetourEmprunt;

    public Emprunt() {
    }

    public Emprunt(String dateEmprunt, String dateRetourEmprunt) {
        this.dateEmprunt = dateEmprunt;
        this.dateRetourEmprunt = dateRetourEmprunt;
    }

    
    public Emprunt(int idEmprnt, String dateEmprunt, String dateRetourEmprunt) {
        this.idEmprunt = idEmprnt;
        this.dateEmprunt = dateEmprunt;
        this.dateRetourEmprunt = dateRetourEmprunt;
    }

    public int getIdEmprnt() {
        return idEmprunt;
    }

    public void setIdEmprnt(int idEmprnt) {
        this.idEmprunt = idEmprnt;
    }

    public String getDateEmprunt() {
        return dateEmprunt;
    }

    public void setDateEmprunt(String dateEmprunt) {
        this.dateEmprunt = dateEmprunt;
    }

    public String getDateRetourEmprunt() {
        return dateRetourEmprunt;
    }

    public void setDateRetourEmprunt(String dateRetourEmprunt) {
        this.dateRetourEmprunt = dateRetourEmprunt;
    }

    @Override
    public String toString() {
        return "Emprunt{" + "idEmprunt=" + idEmprunt + ", dateEmprunt=" + dateEmprunt + ", dateRetourEmprunt=" + dateRetourEmprunt + '}';
    }
    
    
}
