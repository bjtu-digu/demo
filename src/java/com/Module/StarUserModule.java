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

/**
 *
 * @author bai
 */
public class StarUserModule {
    //关注贴吧
	public static void StarUser(String user_id,String star_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "insert into star_user(user_id,star_id) VALUES('" + user_id + "','" + star_id + "')";
		int back = s.createSQLQuery(sql).executeUpdate();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
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
}
