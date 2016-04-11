/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.bar;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author bai
 */
public class PostingModule {
    //登记帖子
	public static void posting(String bar_id,String user_id,String post_name,String post_msg){
		Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "insert into post(last_date,bar_id,user_id,post_name,post_msg,post_date) "
				+ "values(now()," + bar_id + ","+user_id+",'"+post_name+"','"+post_msg+"',now())";
		int back = s.createSQLQuery(sql).executeUpdate();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();		
		return;
	}
	
	//检测用户id是否合法
	public static int checkID(String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select exist from user where user_id = '" + user_id + "'";
		List<user> list = s.createSQLQuery(sql).list();
		HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                if (list.size() > 0) {
                     return list.get(0).getExist();
                } else {
                     return 0;
                }
	}
	
	//检测贴吧id是否合法
	public static int checkBar(String bar_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select exist from bar where bar_id = '" + bar_id + "'";
                List<bar> list = s.createSQLQuery(sql).list();
		HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                if (list.size() > 0) {
                     return list.get(0).getExist();
                } else {
                     return 0;
                }
	}
	
	//获得用户ID
	public static String getUserID(String name){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select user_id from user where user_name = '" + name + "'";
		List<user> list = s.createSQLQuery(sql).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                return String.valueOf(list.get(0).getUser_id());
	}
}
