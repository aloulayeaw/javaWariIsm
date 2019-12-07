/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Profil;

/**
 *
 * @author hp
 */
public class ProfilDao implements ISystem<Profil> {
    
    private DaoMysql dao;

    public ProfilDao() {
        dao=  DaoMysql.getInstance();
    }

    @Override
    public int create(Profil obj) {
        int result=0;
        
       
            try {
                
                String sql="INSERT INTO `profil` (`id_profil`, `libelle`) VALUES (NULL, ?)";
             
                /* Execution requete */
                  //PreparedStatement ps=connexion.prepareStatement(sql);
                  dao.initPS(sql);
                  //ps.setString(1, obj.getLibelle());
                  dao.getPstm().setString(1, obj.getLibelle());
                  dao.executeMaj();
            } catch (SQLException ex) { 
             System.out.println("Erreur Connexion à la BD");
        }

         return result;
    }

    @Override
    public int update(Profil obj) {
       int result=0;
            try {
                
                String sql="UPDATE `profil` SET `libelle` = ? WHERE `profil`.`id_profil` =?";
             
                /* Execution requete */
                  //PreparedStatement ps=connexion.prepareStatement(sql);
                  dao.initPS(sql);
                  //ps.setString(1, obj.getLibelle());
                  dao.getPstm().setString(1, obj.getLibelle());
                  dao.getPstm().setInt(2, obj.getId());
                  result=dao.executeMaj();
            } catch (SQLException ex) { 
             System.out.println("Erreur Connexion à la BD");
        }

         return result; 
    }

    @Override
    public Profil findById(int id) {
       Profil result=null;
       
       
            try {
                result=new Profil();
                
                String sql="select * from profil where id_profil=?";
                dao.initPS(sql);
                /* Execution requete */
                dao.getPstm().setInt(1, id);

                  ResultSet rs=dao.executeSelect();
                  if(rs.next()){
                      
                     result.setId(rs.getInt("id_profil"));
                     result.setLibelle(rs.getString("libelle"));
                      
                  }
                  
                  dao.CloseConnection();
            } catch (SQLException ex) { 
             System.out.println("Erreur Connexion à la BD");
        }

         return result;
    }

    @Override
    public List<Profil> findAll() {
       List<Profil> result=null;
        
       
            try {
                result=new ArrayList<>();
                
                String sql="select * from profil";
                dao.initPS(sql);
                /* Execution requete */
                

                  ResultSet rs=dao.executeSelect();
                  while(rs.next()){
                      Profil p=new Profil();
                      p.setId(rs.getInt("id_profil"));
                      p.setLibelle(rs.getString("libelle"));
                      result.add(p);
                  }
            } catch (SQLException ex) { 
             System.out.println("Erreur Connexion à la BD");
        }

         return result;
    }
    public Profil findByLibelle(String libelle) {
       Profil result=null;
       
       
            try {
                result=new Profil();
                
                String sql="select * from profil where libelle=?";
                dao.initPS(sql);
                /* Execution requete */
                dao.getPstm().setString(1, libelle);

                  ResultSet rs=dao.executeSelect();
                  if(rs.next()){
                      
                     result.setId(rs.getInt("id_profil"));
                     result.setLibelle(rs.getString("libelle"));
                      
                  }
                  
                  dao.CloseConnection();
            } catch (SQLException ex) { 
             System.out.println("Erreur Connexion à la BD");
        }

         return result;
    }
}
