/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HibernateUtil;

import com.Hibernate.user;
import org.hibernate.Session;

/**
 *
 * @author zqhPC
 */
public class test {
     public static void main(String[] args) {

         createAndStorePerson();

        HibernateUtil.getSessionFactory().close();

}

 

    private static void createAndStorePerson() {

        Session session =                   // 通过Session工厂获取Session对象

HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();         //开始事务

        

        user u = new user();
        u.setUser_id(99);
      

        session.save(u);

        

        session.getTransaction().commit(); // 提交事务

    }

}
