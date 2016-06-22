/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.admin;
import Hibernate.bar;
import Hibernate.post;
import Hibernate.reply;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author zxq
 */
public class AdminModule {

    public static boolean login(String name, String password) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from admin where admin_name = ? and password = ?";
        List<admin> list = s.createSQLQuery(sql).setString(0, name).setString(1, password).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkAdmin(String name) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from admin where admin_name = ?";
        List<admin> list = s.createSQLQuery(sql).setString(0, name).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if (list.size() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean changeStatus(String table, String id, String status) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        //String hql = "insert into user(user_name,password,mail,register_date,pic_id) " + "values('?','?','?',SYSDATE(),?)";
        //List<user> list = s.createQuery(hql).setString(0, name).setString(1, pass).setString(2, mail).setString(3, pic_id).list();

        String sql = "update " + table + " set available = ? where " + table + "_id = ?";
        int back = s.createSQLQuery(sql).setString(0, status).setString(1, id).executeUpdate();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return back > 0;
    }

    public static List<user> getUsers() {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from user";
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list;
    }

    public static List<bar> getBars() {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from bar";
        List<bar> list = s.createSQLQuery(sql).addEntity(bar.class).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list;
    }

    public static List<post> getPosts() {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from post";
        List<post> list = s.createSQLQuery(sql).addEntity(post.class).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list;
    }

    public static List<reply> getReplys() {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from reply";
        List<reply> list = s.createSQLQuery(sql).addEntity(reply.class).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list;
    }

    public static String getUserNamebyId(int user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from user where user_id = ?";
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).setString(0, String.valueOf(user_id)).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list.get(0).getUser_name();
    }

    public static String getBarNamebyId(int bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from bar where bar_id = ?";
        List<bar> list = s.createSQLQuery(sql).addEntity(bar.class).setString(0, String.valueOf(bar_id)).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list.get(0).getBar_name();
    }

    public static String getPostNamebyId(int post_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from post where post_id = ?";
        List<post> list = s.createSQLQuery(sql).addEntity(post.class).setString(0, String.valueOf(post_id)).list();
        //System.out.println(hql);
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list.get(0).getPost_name();
    }
}
