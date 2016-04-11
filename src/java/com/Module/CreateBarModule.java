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
public class CreateBarModule {
    //检测贴吧名字是否已经存在
	public static int checkBar(String name){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select exist from bar where bar_name = '" + name + "'";
		List<bar> list = s.createSQLQuery(sql).setString(0, name).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                
                return list.size();
	}
	
	//检测id是否存在
	public static int checkID(String id) {
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "select exist from user where user_id = '" + id + "'";
		List<bar> list = s.createSQLQuery(sql).setString(0, id).list();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                
                return list.size();
	}
	
	public static int createBar(String id,String topic,String name){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "insert into bar(user_id,topic,bar_name,create_time) "
				+ "values('" + id + "','" + topic + "','" + name + "',SYSDATE())";
                int back = s.createSQLQuery(sql).executeUpdate();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
                
                return back;
	}
}
