/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.bar;
import Hibernate.msg;
import Hibernate.post;
import Hibernate.reply;
import Hibernate.star_bar;
import Hibernate.star_user;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.type.StandardBasicTypes;

/**
 *
 * @author bai
 */
public class UserModule {

    //获取个人资料
    public static String getUserInfo(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from user where user_id = " + user_id;
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if (list.isEmpty()) {
            return null;
        }
        return String.valueOf(list.get(0).getPic_id());
    }
    //获得用户ID

    public static String getUserID(String name) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from user where user_name = '" + name + "'";
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return String.valueOf(list.get(0).getUser_id());
    }
    //获取所有关注人

    public static List<star_user> getStarUser(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from star_user where user_id = " + user_id;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("star_id");
//		get.add("int");
        List<star_user> list = s.createSQLQuery(sql).addEntity(star_user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取粉丝ID
    public static List<star_user> getFansUser(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from star_user where star_id = " + user_id;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
        List<star_user> list = s.createSQLQuery(sql).addEntity(star_user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取所有关注贴吧
    public static List<bar> getStarBar(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select bar.* from star_bar,bar where star_bar.bar_id = bar.bar_id and star_bar.user_id = " + user_id;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("bar_id");
//		get.add("int");
//		get.add("bar_name");
//		get.add("String");
        List<bar> list = s.createSQLQuery(sql).addEntity("bar", bar.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;

    }

    //获取所有发帖
    public static List getPost(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select bar.*, post.* from "
                + "post left join bar on post.bar_id = bar.bar_id "
                + "where post.user_id = '" + user_id + "'";

//        get.add("post_id");
//        get.add("int");
//        get.add("post_name");
//        get.add("String");
//        get.add("bar_id");
//        get.add("int");
//        get.add("bar_name");
//        get.add("String");
//        get.add("post_date");
//        get.add("date");
        List list = s.createSQLQuery(sql).addEntity("post", post.class).addEntity("bar", bar.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
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

    //获取贴吧名
    public static String getBarName(String bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "Select * from bar"
                + " where bar_id = " + bar_id;
        List<bar> list = s.createSQLQuery(sql).addEntity(bar.class).list();

        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list.get(0).getBar_name();
    }

    //获取某贴回复数
    public static String getReplyNum(String post_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from reply where post_id = '" + post_id + "'";
        List<reply> list = s.createSQLQuery(sql).addEntity(reply.class).list();

        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return String.valueOf(list.size());
    }

    //获取回帖信息
    public static List getReply(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "SELECT reply.*, bar.* "
                + "from reply left join bar on reply.bar_id  = bar.bar_id "
                + "where reply.user_id = '" + user_id + "' ";
        List list = s.createSQLQuery(sql).addEntity("reply", reply.class).addEntity("bar", bar.class).list();
//        get.add("reply_id");
//        get.add("int");
//        get.add("reply_msg");
//        get.add("String");
//        get.add("bar_id");
//        get.add("int");
//        get.add("bar_name");
//        get.add("String");
//        get.add("reply_date");
//        get.add("date");
//        get.add("post_id");
//        get.add("String");
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取消息信息
    public static List<msg> getMsg(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();

        String sql = "select * from msg where reader_id = '" + user_id + "' order by msg_id DESC";
        List<msg> list = s.createSQLQuery(sql).addEntity(msg.class).list();
//        get.add("msg_id");
//        get.add("int");
//        get.add("msg");
//        get.add("String");
//        get.add("add_msg");
//        get.add("String");
//        get.add("type");
//        get.add("String");
//        get.add("sender_id");
//        get.add("int");
//        get.add("msg_date");
//        get.add("date");
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取对一个贴吧的签到数
    public static String getSignNum(String user_id, String bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        
        String sql = "select * from star_bar where user_id = '" + user_id + "' and bar_id = '" + bar_id + "'";
        List<star_bar> list = s.createSQLQuery(sql).addEntity(star_bar.class).list();
        
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return String.valueOf(list.size());
    }

    //查看某人是否已经关注某人
    //，user_id为你,star_id为他人
    public static String checkStarUser(String user_id, String star_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        
        String sql = "select * from star_user where user_id = '" + user_id + "' and star_id = '" + star_id + "'";
        List<star_user> list = s.createSQLQuery(sql).addEntity(star_user.class).list();
        
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return String.valueOf(list.get(0).getExist());
    }

    //获取某个贴吧名字
    public static String getBarName1(String bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        
        String sql = "select * from bar where bar_id = '" + bar_id + "'";
        List<bar> list = s.createSQLQuery(sql).addEntity(bar.class).list();
        
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list.get(0).getBar_name();
    }
}
