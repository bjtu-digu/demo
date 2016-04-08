/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author bai
 */
public class LoginModule {

    public static int login(String name, String password) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        //String hql = "FROM User WHERE user_name = ? AND password = ?";
        //List<user>list = s.createQuery(hql).setString(0, name).setString(1, password).list(); 

        String sql = "select * from user where user_name = ? and password = ?";
        List<user> list = s.createSQLQuery(sql).setString(0, name).setString(1, password).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if (list.size() > 0) {
            return 1;
        } else {
            return 0;
        }

    }
}
