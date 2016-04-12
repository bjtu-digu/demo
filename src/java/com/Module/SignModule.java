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
public class SignModule {
    //签到
	public static void Sign(String bar_id,String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "update star_bar set sign_num = sign_num+1"
				+ " where bar_id = '" + bar_id + "' and user_id = '" + user_id + "'";
		int back = s.createSQLQuery(sql).executeUpdate();
		sql = "update star_bar set sign_date = SYSDATE() "
				+ " where bar_id = '" + bar_id + "' and user_id = '" + user_id + "'";
		int back1 = s.createSQLQuery(sql).executeUpdate();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
	}
	//获得用户ID
	public static String getUserID(String name){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select * from user where user_name = '" + name + "'";
		List<user> list = s.createSQLQuery(sql).addEntity(user.class).list();
		HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return String.valueOf(list.get(0).getUser_id());
	}
}
