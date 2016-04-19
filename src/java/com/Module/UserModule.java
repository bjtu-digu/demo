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
import org.hibernate.type.StandardBasicTypes;

/**
 *
 * @author bai
 */
public class UserModule {
    //获取个人资料
	public static String getUserInfo(String user_id){
		Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
                String sql = "select * from user where user_id = " + user_id ;	
		List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                if(list.isEmpty())
                    return null;
                return String.valueOf(list.get(0).getUser_id());
	}
	//获得用户ID
	public static String getUserID(String name){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select user_id from user where user_name = '" + name + "'";
		List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return String.valueOf(list.get(0).getUser_id());
	}
	//获取所有关注人
	public static List getStarUser(String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select star_id from star_user where user_id = " + user_id;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("star_id");
//		get.add("int");
                List list = s.createSQLQuery(sql).addScalar("star_id", StandardBasicTypes.INTEGER).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                return list;
	}
	
	//获取粉丝ID
	public static List getFansUser(String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select user_id from star_user where star_id = " + user_id;
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("user_id");
//		get.add("int");
		List list = s.createSQLQuery(sql).addScalar("user_id",StandardBasicTypes.INTEGER).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                return list;
	}

	//获取所有关注贴吧
	public static List getStarBar(String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select star_bar.bar_id,bar_name from star_bar "
				+ "left join bar on star_bar.bar_id = bar.bar_id where star_bar.user_id = " + user_id+"";
//		ArrayList<String> get = new ArrayList<String>();
//		get.add("bar_id");
//		get.add("int");
//		get.add("bar_name");
//		get.add("String");
                List list = s.createSQLQuery(sql).
                        addScalar("bar_id", StandardBasicTypes.INTEGER).
		        addScalar("bar_name", StandardBasicTypes.STRING).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                return list;
		
        }
}
