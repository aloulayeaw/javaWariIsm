/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import models.Profil;
import models.User;

/**
 *
 * @author hp
 */
public class UserDao implements ISystem<User>{
 private DaoMysql dao;

    public UserDao() {
        dao=  DaoMysql.getInstance();
    }
 
 
    @Override
    public int create(User obj) {
        int result=0;
       //DaoMysql dao=new DaoMysql(); 
     
     
       String sql="INSERT INTO `user` (`id_user`, `id_profil`, `id_partenaire`, `nom`, `prenom`, `login`, `password`, `etat`) VALUES (NULL, ?, ?, ?, ?, ?, ?, 'Actif');";
        try {
            dao.initPS(sql);
            dao.getPstm().setInt(1,obj.getProfil().getId() );
            dao.getPstm().setInt(2,0);
            dao.getPstm().setString(3, obj.getNom());
            dao.getPstm().setString(4, obj.getPrenom());
            dao.getPstm().setString(5, obj.getLogin());
            dao.getPstm().setString(6, obj.getPwd());
            result=dao.executeMaj();
            
            dao.CloseConnection();
             
        } catch (SQLException ex) {
            Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
        }
       
       return result;
    }

    @Override
    public int update(User obj) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public User findById(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<User> findAll() {
        List<User> result=null;
        ProfilDao profildao=new ProfilDao();
        String sql="select * from user";
     try {
         result=new ArrayList<>();
         dao.initPS(sql);
        ResultSet rs= dao.executeSelect();
        while(rs.next()){
            User u =new User();
            u.setId(rs.getInt("id_user"));
            u.setLogin(rs.getString("login"));
            u.setPwd(rs.getString("password"));
            u.setNom(rs.getString("nom"));
            u.setPrenom(rs.getString("prenom"));
            u.setEtat(rs.getString("etat"));
            Profil p=profildao.findById(rs.getInt("id_profil"));
            u.setProfil(p);
            result.add(u);
        }
     } catch (SQLException ex) {
         Logger.getLogger(UserDao.class.getName()).log(Level.SEVERE, null, ex);
     }
        return result;
    }
    
}
