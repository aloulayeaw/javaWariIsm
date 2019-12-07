/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.List;

/**
 *
 * @author hp
 */
public class Partenaire extends User{
    private String email;
    private String adresse;
    private String telephone;
    List<Compte> mescomptes;

    public List<Compte> getMescomptes() {
        return mescomptes;
    }

    public void setMescomptes(List<Compte> mescomptes) {
        this.mescomptes = mescomptes;
    }
    
    

    public Partenaire() {
    }

    public Partenaire(String email, String adresse, String telephone, int id, String nom, String prenom, String login, String pwd) {
        super(id, nom, prenom, login, pwd);
        this.email = email;
        this.adresse = adresse;
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }
      
    
    
    
}
