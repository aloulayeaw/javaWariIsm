/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.List;
import models.Profil;
import models.User;
import services.SystemService;

/**
 *
 * @author hp
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SystemService system=new SystemService ();
      // system.modifierProfil(new Profil(1,"Users Partenaire"));
       system.creerCaissier(new User("Diop", "Fall", "user", "user"));
      
       system.listerCaissier().forEach(
              (user)->{
                  System.out.println(user.getNom() +" "+ user.getProfil().getLibelle());
              }
      );
       
    }
    
}
