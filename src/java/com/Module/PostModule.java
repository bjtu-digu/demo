/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.bar;
import Hibernate.post;
import Hibernate.reply;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author bai
 */
public class PostModule {

    //获得帖子所属贴吧id
    public static String getBarID(String post_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select bar_id from post where post_id = " + post_id;
        List<post> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return String.valueOf(list.get(0).getBar_id());
    }

    //获得贴吧表表内相关信息
    public static List<bar> getBarInfo(String bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select user_id,topic,bar_name,create_time,bar_head from bar where bar_id = '" + bar_id + "'";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
//		get.add("bar_name");
//		get.add("String");
//		get.add("create_time");
//		get.add("date");
//		get.add("bar_head");
//		get.add("int");
        List<bar> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取10层楼信息
    public static List<reply> getFloorInfo(String post_id, String begin, String end) {
        //假装
        begin = "0";
        end = "100000";
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select reply_id,reply_date,reply_msg,user_id from reply where post_id = '" + post_id + "' LIMIT " + begin + "," + end;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("reply_id");
//		get.add("int");
//		get.add("reply_date");
//		get.add("date");
//		get.add("reply_msg");
//		get.add("String");
//		get.add("user_id");
//		get.add("int");
        List<reply> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取用户名
    public static String getUserName(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "Select user_name from user"
                + " where user_id = " + user_id;
        List<user> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list.get(0).getUser_name();
    }

    //获取帖子一楼信息
    public static List<post> getFirstInfo(String post_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select user_id,post_name,post_msg,post_date from post where post_id = '" + post_id + "'";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
//		get.add("post_name");
//		get.add("String");
//		get.add("post_msg");
//		get.add("String");
//		get.add("post_date");
//		get.add("String");
        List<post> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }
    //获得用户ID

    public static String getUserID(String name) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select user_id from user where user_name = '" + name + "'";
        List<user> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return String.valueOf(list.get(0).getUser_id());
    }
    //检测是否是老师

    public static String checkTeacher(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select exist from user where user_id = '" + user_id + "' and is_teacher = 1";
        List<user> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if(list.isEmpty())
            return null;
        return String.valueOf(list.get(0).getExist());
    }

    //获取只有楼主的信息
    public static List<reply> getPoster(String post_id, String begin, String end, String poster_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select reply_id,reply_date,reply_msg,user_id from reply where post_id = '" + post_id + "' and user_id = '" + poster_id + "' LIMIT " + begin + "," + end;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("reply_id");
//		get.add("int");
//		get.add("reply_date");
//		get.add("date");
//		get.add("reply_msg");
//		get.add("String");
//		get.add("user_id");
//		get.add("int");
        List<reply> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;

    }
    //获取老师的回帖信息

    public static List<reply> getTeacher(String post_id, String begin, String end) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select reply_id,reply_date,reply_msg,reply.user_id from "
                + "reply LEFT JOIN `user` on `user`.user_id = reply.user_id where is_teacher = 1 and post_id = '" + post_id + "' LIMIT " + begin + "," + end;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("reply_id");
//		get.add("int");
//		get.add("reply_date");
//		get.add("date");
//		get.add("reply_msg");
//		get.add("String");
//		get.add("user_id");
//		get.add("int");
        List<reply> list = s.createSQLQuery(sql).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }
}
