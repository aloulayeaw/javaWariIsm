/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author hp
 */
public class Depot {
    private Date date;
     private User caissier;
     private Compte compte;

    public Depot() {
    }

    public Depot( User caissier, Compte compte) {
        this.date =new Date() ;
        this.caissier = caissier;
        this.compte = compte;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getCaissier() {
        return caissier;
    }

    public void setCaissier(User caissier) {
        this.caissier = caissier;
    }

    public Compte getCompte() {
        return compte;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
     
     
}
