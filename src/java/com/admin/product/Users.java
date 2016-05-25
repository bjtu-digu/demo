/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.admin.product;

import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author zxq
 */
public class Users implements Lists {

    @Override
    public List get() {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from user";
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list;
    }
    
    @Override
    public boolean changeStatus(String status, String id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        //String hql = "insert into user(user_name,password,mail,register_date,pic_id) " + "values('?','?','?',SYSDATE(),?)";
        //List<user> list = s.createQuery(hql).setString(0, name).setString(1, pass).setString(2, mail).setString(3, pic_id).list();

        String sql = "update user set available = ? where user_id = ?";
        int back = s.createSQLQuery(sql).setString(0, status).setString(1, id).executeUpdate();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return back > 0;
    }
}
