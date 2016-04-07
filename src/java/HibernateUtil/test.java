/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUtil;

import Hibernate.user;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import HibernateUtil.HibernateUtil;
/**
 *
 * @author zqhPC
 */
public class test {
     public static void main(String[] args) {
         try {
       
             Session s=HibernateUtil.currentSession();
             HibernateUtil.beginTransaction();//开始操作
             
             
              user u=new user();
              u.setUser_name("wertiyuio");
              s.save(u);
              
              
             HibernateUtil.commitTransaction();//结束操作
             HibernateUtil.closeSession();
                 } catch (HibernateException e) {
             e.printStackTrace();
         }
       
         
     }

}

 

   
