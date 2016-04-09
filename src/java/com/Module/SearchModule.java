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
public class SearchModule {
	//检测贴吧是否存在
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
	
	//获得用户ID
	public static String getUserID(String name){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select user_id from user where user_name = '" + name + "'";
		List<user> list = s.createSQLQuery(sql).setString(0, name).list();
		HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
		return list.toString();
	}
}
