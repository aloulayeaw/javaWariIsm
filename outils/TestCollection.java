/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import models.Partenaire;

/**
 *
 * @author hp
 */
public class TestCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       List<String> lstring=new ArrayList<>();
        lstring.add("Bonjour");
        lstring.add("Au revoir");
        lstring.add(2,"Bonjour");
        
        lstring.forEach((c) -> {
            System.out.println(c);
        });
        lstring.remove(0);
        
        lstring.forEach((c)->{
            System.out.println(c);
        });
        
    }
    
}
