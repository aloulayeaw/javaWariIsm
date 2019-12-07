/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author hp
 */
//Beans
public class User {
    
   private int id;
   private String nom;
   private String prenom;
   private String login;
   private String pwd;
   private String etat;
   
   //Navigabilité
   private Profil profil;

    public User() {
          this.etat = "Actif";
    }

    public User(int id, String nom, String prenom, String login, String pwd) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.pwd = pwd;
        this.etat = "Actif";
    }

    public User(int id, String nom, String prenom, String login, String pwd, String etat, Profil profil) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.pwd = pwd;
        this.etat = etat;
        this.profil = profil;
    }
    
      public User(String nom, String prenom, String login, String pwd) {
        
        this.nom = nom;
        this.prenom = prenom;
        this.login = login;
        this.pwd = pwd;
        
        
    }


    public Profil getProfil() {
        return profil;
    }

    public void setProfil(Profil profil) {
        this.profil = profil;
    }
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }
   
   
    
}
