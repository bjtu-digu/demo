/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.chat;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author zxq
 */
public class ChatModule {

    public static List<chat> getChat(String bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from chat where bar_id = ? order by msg_id desc";
        List<chat> list = s.createSQLQuery(sql).addEntity(chat.class).setString(0, bar_id).list();
        
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        
        return list;
    }
    
    public static boolean addChat(String user_id, String bar_id, String msg){
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        
        String sql = "insert into chat(user_id,bar_id,msg) values(?,?,?)";
        
        int back = s.createSQLQuery(sql).setString(0,user_id).setString(1, bar_id).setString(2, msg).executeUpdate();
        
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        
        return back != 0;
    }
}
