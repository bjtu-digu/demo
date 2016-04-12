/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.bar;
import Hibernate.post;
import Hibernate.reply;
import Hibernate.star_bar;
import Hibernate.teacher;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import com.sun.org.apache.xml.internal.utils.StringVector;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.type.StandardBasicTypes;

/**
 *
 * @author bai
 */
public class BarModule {

    //检测贴吧名字是否存在
    public static int checkBar(String name) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select exist from bar where bar_name = '" + name + "'";
        List<bar> list = s.createSQLQuery(sql).addEntity(bar.class).list();

        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if (list.size() > 0) {
            return list.get(0).getExist();
        } else {
            return 0;
        }
    }
    //检查是否已经签到过了

    public static String CheckSign(String bar_id, String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "SELECT * from star_bar "
                + " where bar_id = '" + bar_id + "' and user_id = '" + user_id + "'"
                + " and date_format(sign_date,'%y-%m-%d') = date_format(SYSDATE(),'%y-%m-%d')";

        List<star_bar> list = s.createSQLQuery(sql).addEntity(star_bar.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if(list.isEmpty())
            return null;
        return String.valueOf(list.get(0).getExist());
    }
    //获得贴吧表表内相关信息

    public static List<bar> getBarInfo(String name) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from bar where bar_name = '" + name + "'";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("bar_id");
//		get.add("int");
//		get.add("user_id");
//		get.add("int");
//		get.add("topic");
//		get.add("String");
//		get.add("bar_name");
//		get.add("String");
//		get.add("create_time");
//		get.add("date");
//		get.add("bar_head");
//		get.add("int");
        List<bar> list = s.createSQLQuery(sql).addEntity(bar.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获得吧主信息
    public static List<user> getBarOwnerInfo(String id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from user where user_id = '" + id + "'";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
//		get.add("user_name");
//		get.add("String");
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取指导老师信息
    public static List<user> getTeacherInfo(String id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select user.* from"
                + " user left JOIN teacher on user.user_id = teacher.user_id where bar_id = '" + id + "'";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
//		get.add("user_name");
//		get.add("String");
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list;
    }

    //获取首页帖子列表信息
    public static List<post> getPostList(String bar_id, String begin, String end) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from post "
                + " where exist = 1 and bar_id = ? order by last_date DESC";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("post_id");
//		get.add("int");
//		get.add("user_id");
//		get.add("int");
//		get.add("post_name");
//		get.add("String");
//		get.add("post_msg");
//		get.add("String");
//		get.add("post_date");
//		get.add("date");
//		get.add("last_date");
//		get.add("date");
//		get.add("last_reply");
//		get.add("int");
        List<post> list = s.createSQLQuery(sql).addEntity(post.class).setString(0, bar_id).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        //return s.createSQLQuery(sql).setString(0, bar_id).setString(1, begin).setString(2, end).list();
        return list;
    }

    //获取回帖人名和id    有问题
    public static List getReplyOwnerInfo(String reply_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "Select user_name,reply.user_id,post_date from reply,user"
                + " where reply.user_id = user.user_id and reply_id = " + reply_id;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_name");
//		get.add("String");
//		get.add("user_id");
//		get.add("int");
//		get.add("post_date");
//		get.add("date");
        List list = s.createSQLQuery(sql)
                .addScalar("user_name", StandardBasicTypes.STRING)
                .addScalar("user_id", StandardBasicTypes.INTEGER)
                .addScalar("post_date", StandardBasicTypes.DATE).list();
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

    //获取某个帖子的回复数
    public static int getReplyNum(String post_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from reply where post_id =" + post_id;
        List<reply> list = s.createSQLQuery(sql).addEntity(reply.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list.size();
    }

    //获取某个帖子的一楼
    public static String getFirstFloor(String post_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from post where post_id =" + post_id;
        List<post> list = s.createSQLQuery(sql).addEntity(post.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return list.get(0).getPost_msg();
    }

    //检测某个用户是否关注本贴吧
    public static String checkStarBar(String user_id, String bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from star_bar where user_id = '" + user_id + "' and bar_id = '" + bar_id + "'";
        
        List<star_bar> list = s.createSQLQuery(sql).addEntity(star_bar.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if(list.isEmpty())
            return null;
        return String.valueOf(list.get(0).getExist());
    }

    //检测某人是否是老师
    public static String checkTeacher(String user_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from user where user_id = '" + user_id + "'";
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return String.valueOf(list.get(0).getIs_teacher());
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
    //查询某人是否是一个吧 的吧主

    public static String checkBarTeacher(String user_id, String bar_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from teacher where user_id='" + user_id + "' and  bar_id = '" + bar_id + "'";
        List<teacher> list = s.createSQLQuery(sql).addEntity(teacher.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        if(list.isEmpty())
            return null;
        return String.valueOf(list.get(0).getExist());
    }
    //通过回帖id获取回帖人id

    public static String getReplyer(String reply_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        String sql = "select * from reply where reply_id = '" + reply_id + "'";
        List<reply> list = s.createSQLQuery(sql).addEntity(reply.class).list();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();
        return String.valueOf(list.get(0).getUser_id());
    }
}
