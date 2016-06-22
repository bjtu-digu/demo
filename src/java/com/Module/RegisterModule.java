/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Module;

/**
 *
 * @author bai
 */
import Hibernate.user;
import HibernateUtil.HibernateUtil;
import java.io.IOException;
import java.util.List;
import org.apache.commons.net.smtp.SMTPClient;
import org.apache.commons.net.smtp.SMTPReply;
import org.hibernate.Session;
import org.xbill.DNS.Lookup;
import org.xbill.DNS.Record;
import org.xbill.DNS.Type;

public class RegisterModule {

    public static int register(String name, String pass, String mail, String pic_id) {
        Session s = HibernateUtil.currentSession();
        HibernateUtil.beginTransaction();
        //String hql = "insert into user(user_name,password,mail,register_date,pic_id) " + "values('?','?','?',SYSDATE(),?)";
        //List<user> list = s.createQuery(hql).setString(0, name).setString(1, pass).setString(2, mail).setString(3, pic_id).list();

        String sql = "insert into user(user_name,password,mail,register_date,pic_id) values(?,?,?,SYSDATE(),?)";
        int back = s.createSQLQuery(sql).setString(0, name).setString(1, pass).setString(2, mail).setString(3, pic_id).executeUpdate();
        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        return back;
    }

    public static int checkRegister(String name) {
        Session s = HibernateUtil.currentSession();
        //String hql = "FROM User WHERE username = ? ";
        //List<user>list = s.createQuery(hql).setString(0, name).list();  

        String sql = "select * from user where user_name = ?";
        List<user> list = s.createSQLQuery(sql).addEntity(user.class).setString(0, name).list();

        HibernateUtil.commitTransaction();//结束操作
        HibernateUtil.closeSession();

        if (list.size() > 0) {
            return 1;
        } else {
            return 0;
        }

    }

    public static boolean checkEmail(String email) {
        if (!email.matches("[\\w\\.\\-]+@([\\w\\-]+\\.)+[\\w\\-]+")) {
            return false;
        }

        String host = "";
        String hostName = email.split("@")[1];
        Record[] result = null;
        SMTPClient client = new SMTPClient();

        try {
            // 查找MX记录
            Lookup lookup = new Lookup(hostName, Type.MX);
            lookup.run();
            if (lookup.getResult() != Lookup.SUCCESSFUL) {
                return false;
            } else {
                result = lookup.getAnswers();
            }

            // 连接到邮箱服务器
            for (int i = 0; i < result.length; i++) {
                host = result[i].getAdditionalName().toString();
                client.connect(host);
                if (!SMTPReply.isPositiveCompletion(client.getReplyCode())) {
                    client.disconnect();
                    continue;
                } else {
                    break;
                }
            }

            //以下2项自己填写快速的，有效的邮箱
            client.login("qq.com");
            client.setSender("526199427@163.com");
            client.addRecipient(email);
            if (250 == client.getReplyCode()) {
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                client.disconnect();
            } catch (IOException e) {
            }
        }
        return false;
    }

}
