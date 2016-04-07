/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

/**
 *
 * @author bai
 */
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;


public class RegisterModule {
    public static void register(String name, String pass, String mail, String pic_id) {
         Session s=HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String hql = "insert into user(user_name,password,mail,register_date,pic_id) "
				+ "values('?','?','?',SYSDATE(),?)";
		 List<user>list = s.createQuery(hql).setString(0, name).setString(1, pass).setString(2, mail).setString(3, pic_id).list();  
                 HibernateUtil.commitTransaction();//结束操作
             HibernateUtil.closeSession();
    }
    
    public static int checkRegister(String name) {
         Session s=HibernateUtil.currentSession();
        String hql = "FROM User WHERE username = ? ";
        List<user>list = s.createQuery(hql).setString(0, name).list();  
          
          if (list.size() > 0) {
            return 1;
        }
        else return 0;

    }

}
