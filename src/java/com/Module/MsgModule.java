/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.msg;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author bai
 */
public class MsgModule {

    //插入消息
    public static void Msg(String msg, String type, String sender_id, String reader_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "INSERT into msg(msg,type,sender_id,reader_id,msg_date) "
                + "VALUE('" + msg + "','" + type + "','" + sender_id + "','" + reader_id + "',SYSDATE());";
        int back = s.createSQLQuery(sql).executeUpdate();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
    }

    //获取用户名
    public static String getUserName(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "Select * from user"
                + " where user_id = " + user_id;
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return list.get(0).getUser_name();
    }

    //获取用户Id
    public static String getUserID(String name) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from user where user_name = '" + name + "'";
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if (list.isEmpty()) {
            return null;
        }
        return String.valueOf(list.get(0).getUser_id());
    }

    //获取某条对话内容
    public static String getMsg(String Msg_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from msg where msg_id = '" + Msg_id + "'";
        List<msg> list = s.createSQLQuery(sql).addEntity(msg.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list.get(0).getMsg();
    }
}
