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
<<<<<<< HEAD
import HibernateUtil.HibernateUtil;
=======

>>>>>>> develop
/**
 *
 * @author zqhPC
 */
public class test {
     public static void main(String[] args) {
         try {
<<<<<<< HEAD
       
             Session s=HibernateUtil.currentSession();
             HibernateUtil.beginTransaction();//开始操作
             
             
              user u=new user();
              u.setUser_name("wertiyuio");
              s.save(u);
              
              
             HibernateUtil.commitTransaction();//结束操作
             HibernateUtil.closeSession();
                 } catch (HibernateException e) {
=======
         SessionFactory sf= new Configuration().configure().buildSessionFactory();
         Session s=sf.openSession();
         Transaction tx=s.beginTransaction();
         user u=new user();
         u.setUser_name("uuu");
         s.save(u);
         tx.commit();
             System.out.println("hhhhhhhhhhhhhhhhhhhhh");
         s.close();
         } catch (HibernateException e) {
>>>>>>> develop
             e.printStackTrace();
         }
       
         
     }

}

 

   
