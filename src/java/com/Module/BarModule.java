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
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
/**
 *
 * @author bai
 */
public class BarModule {
    //检测贴吧名字是否存在
	public static int checkBar(String name){
             Session s = HibernateUtil.currentSession();
             HibernateUtil.beginTransaction();
	     String sql = "select exist from bar where bar_name = '" + name + "'";
	      List<user> list = s.createSQLQuery(sql).setString(0, name).list();
	
              HibernateUtil.commitTransaction();//结束操作
              HibernateUtil.closeSession();
              if (list.size() > 0) {
                 return 1;
              } else {
                 return 0;
              }
	}
	//检查是否已经签到过了
	public static String CheckSign(String bar_id,String user_id){
             Session s = HibernateUtil.currentSession();
             HibernateUtil.beginTransaction();
		String sql = "SELECT exist from star_bar "
				+ " where bar_id = '" + bar_id + "' and user_id = '" + user_id + "'"
				+ " and date_format(sign_date,'%y-%m-%d') = date_format(SYSDATE(),'%y-%m-%d')";
                
                  HibernateUtil.commitTransaction();//结束操作
              HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, bar_id).setString(1, user_id).toString();
	}
	//获得贴吧表表内相关信息
	public static List<bar> getBarInfo(String name){
             Session s = HibernateUtil.currentSession();
             HibernateUtil.beginTransaction();
		String sql = "select bar_id,user_id,topic,bar_name,create_time,bar_head from bar where bar_name = '" + name + "'";
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
                
                  HibernateUtil.commitTransaction();//结束操作
              HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, name).list();
	}
	
	//获得吧主信息
	public static List<user> getBarOwnerInfo(String id){
            Session s = HibernateUtil.currentSession();
             HibernateUtil.beginTransaction();
		String sql = "select user_id , user_name from user where user_id = '" + id + "'";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
//		get.add("user_name");
//		get.add("String");
                  HibernateUtil.commitTransaction();//结束操作
              HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, id).list();
	}
	
	//获取指导老师信息
	public static List<user> getTeacherInfo(String id){
            Session s = HibernateUtil.currentSession();
             HibernateUtil.beginTransaction();
		String sql = "select user_name,user.user_id from"
				+ " user left JOIN teacher on user.user_id = teacher.user_id where bar_id = '" + id + "'";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
//		get.add("user_name");
//		get.add("String");
                 HibernateUtil.commitTransaction();//结束操作
              HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, id).list();
	}
	
	//获取首页帖子列表信息
	public static List<post> getPostList(String bar_id,String begin,String end){
		Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select post_id,user_id,post_name,post_msg,post_date,last_date,last_reply "
				+ " from post "
				+ " where exist = 1 and bar_id = " + bar_id + " order by last_date DESC";
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
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, bar_id).setString(1, begin).setString(2, end).list();
	}
	
	//获取回帖人名和id
	public static List<reply> getReplyOwnerInfo(String reply_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "Select user_name,reply.user_id,post_date from reply,user"
				+ " where reply.user_id = user.user_id and reply_id = " + reply_id ;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_name");
//		get.add("String");
//		get.add("user_id");
//		get.add("int");
//		get.add("post_date");
//		get.add("date");
                 HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, reply_id).list();
	}
	//获取用户名
	public static String getUserName(String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();   
		String sql = "Select user_name from user"
				+ " where user_id = "+user_id ;
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, user_id).toString();
	}
	
	//获取某个帖子的回复数
	public static int getReplyNum(String post_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction(); 
		String sql = "select count(reply_id) from reply where post_id =" + post_id;
		List<user> list = s.createSQLQuery(sql).setString(0, post_id).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		if (list.size() > 0) {
                    return 1;
                } else {
                    return 0;
                }
	}
	
	//获取某个帖子的一楼
	public static String getFirstFloor(String post_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction(); 
		String sql = "select post_msg from post where post_id =" + post_id;
		List<user> list = s.createSQLQuery(sql).setString(0, post_id).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return list.toString();
	}
	
	//检测某个用户是否关注本贴吧
	public static String checkStarBar(String user_id,String bar_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select exist from star_bar where user_id = '" + user_id + "' and bar_id = '" + bar_id + "'";
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, user_id).setString(1, bar_id).toString();
	}
	
	//检测某人是否是老师
	public static String checkTeacher(String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select is_teacher from user where user_id = '" + user_id + "'";
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, user_id).toString();
	}
	//获取某个贴吧名字
	public static String getBarName1(String bar_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select bar_name from bar where bar_id = '" + bar_id + "'";
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, bar_id).toString();
	}
	//查询某人是否是一个吧 的吧主
	public static String checkBarTeacher(String user_id,String bar_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select exist from teacher where user_id='" + user_id + "' and  bar_id = '" + bar_id + "'"; 
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, user_id).setString(1, bar_id).toString();
	}
	//通过回帖id获取回帖人id
	public static String getReplyer(String reply_id){
            Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select user_id from reply where reply_id = '" + reply_id + "'";
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return s.createSQLQuery(sql).setString(0, reply_id).toString();
	}
}
