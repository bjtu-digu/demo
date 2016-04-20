/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.bar;
import Hibernate.post;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author bai
 */
public class BarTeacherModule {
    //设置老师
	public static void SetTeacher(String bar_id,String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "insert into teacher(bar_id,user_id) VALUES('" + bar_id + "','" + user_id + "')";
		int back = s.createSQLQuery(sql).executeUpdate();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
	}
	
	//申请老师
	public static void AskTeacher(String bar_id,String user_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		//获取吧主id
		String sql = "select * from bar where bar_id = '" + bar_id + "'";
		List<bar> barer = s.createSQLQuery(sql).addEntity(bar.class).list();
		
		sql = "insert into msg(msg,type,sender_id,reader_id,msg_date)"
			+ "VALUES('" + bar_id + "','2','" + user_id + "','" + barer.get(0).getUser_id() + "',SYSDATE())";
		int back = s.createSQLQuery(sql).executeUpdate();
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
	
	//删除申请老师的消息
	public static void DeleteAskTeacher(String msg_id){
                Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
		String sql = "delete from msg where msg_id = '" + msg_id + "'";
		int back = s.createSQLQuery(sql).executeUpdate();
                HibernateUtil.commitTransaction();//结束操作
                HibernateUtil.closeSession();
	}
}
