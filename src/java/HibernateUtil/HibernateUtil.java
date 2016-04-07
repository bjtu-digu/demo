/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author zqhPC
 */
public class HibernateUtil {
    private static final SessionFactory sessionFactory;
    
static {
	try{
             Configuration cfg = new Configuration();
            sessionFactory = cfg.configure().buildSessionFactory(null);

		
		
	}catch(Throwable ex){
		ex.printStackTrace();
		System.out.println("Initial SessionFactory creation failed.");
		throw new ExceptionInInitializerError(ex);
	}
}
public static final ThreadLocal tLocalsess=new ThreadLocal();
public static final ThreadLocal tLocaltx=new ThreadLocal();

public static Session currentSession(){
	Session session= (Session) tLocalsess.get();
	try{
		if(session==null||!session.isOpen()){
			session=openSession();
			tLocalsess.set(session);
			
		}
	}catch(HibernateException e){
		e.printStackTrace();
	}
	return session;
}
public static void closeSession(){
	Session session =(Session) tLocalsess.get();
	tLocalsess.set(null);
	try{
		if(session!=null&&session.isOpen()){
		session.close();
		}
	}catch(HibernateException e){
		
	}
}
public static void beginTransaction(){
	Transaction tx=(Transaction) tLocaltx.get();
	try{
		if(tx==null){
			tx=currentSession().beginTransaction();
			tLocaltx.set(tx);
		}
	}catch(HibernateException e){
		
	}
}
public static void commitTransaction(){
	Transaction tx=(Transaction) tLocaltx.get();
	try{
		if(tx!=null&&!tx.wasCommitted()&&!tx.wasRolledBack()){
			tx.commit();
			tLocaltx.set(null);
			System.out.println("commit tx");
		}
	}catch(HibernateException e){
		
	}
}
public static void rollbackTransaction(){
	Transaction tx=(Transaction) tLocaltx.get();
	try{
		tLocaltx.set(null);
		if(tx!=null&&!tx.wasCommitted()&&!tx.wasRolledBack()){
		tx.rollback();
		
		}
	}catch(HibernateException e){
		
	}
}

private static Session openSession() throws HibernateException{
	return getSessionFactory().openSession();
}
private static SessionFactory getSessionFactory() throws HibernateException{
	return sessionFactory;
        
}

}
