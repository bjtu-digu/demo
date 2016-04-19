/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

import Hibernate.reply;
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author bai
 */
public class ReplyModule {
    //插入回复消息
	public static void Reply(String bar_id,String post_id,String reply_msg,String user_id){
		Session s = HibernateUtil.currentSession();
                HibernateUtil.beginTransaction();
                String sql = "insert into reply(bar_id,post_id,reply_date,reply_msg,user_id)" 
				+ "VALUES('" + bar_id + "','" + post_id + "',now(),'" + reply_msg + "','" + user_id + "')";
		int back = s.createSQLQuery(sql).executeUpdate();
		
		//获得回帖id
		sql = "select * from reply where "
				+ "bar_id = '" + bar_id + "' and post_id = '" + post_id + "' and reply_msg = '" + reply_msg + "' and user_id = '" + user_id + "'";
                List<user> list = s.createSQLQuery(sql).addEntity(reply.class).list();
		
		//修改最后回复
		sql = "update post set last_reply = '" + list + "' where post_id = '" + post_id + "'";
		int back1 = s.createSQLQuery(sql).executeUpdate();
		//修改最后回复时间
		sql = "update post set last_date = now() where post_id = '" + post_id + "'";
		int back2 = s.createSQLQuery(sql).executeUpdate();
                
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
