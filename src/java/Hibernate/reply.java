/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hibernate;

import java.util.Date;

/**
 *
 * @author zqhPC
 */
public class reply {
    int reply_id;
    int bar_id;
    int post_id;
    Date reply_date;
    String reply_msg;
    int user_id;
    int exist;

    public reply(int reply_id, int bar_id, int post_id, Date reply_date, String reply_msg, int user_id, int exist) {
        this.reply_id = reply_id;
        this.bar_id = bar_id;
        this.post_id = post_id;
        this.reply_date = reply_date;
        this.reply_msg = reply_msg;
        this.user_id = user_id;
        this.exist = exist;
    }

    public reply() {
    }

    public int getReply_id() {
        return reply_id;
    }

    public void setReply_id(int reply_id) {
        this.reply_id = reply_id;
    }

    public int getBar_id() {
        return bar_id;
    }

    public void setBar_id(int bar_id) {
        this.bar_id = bar_id;
    }

    public int getPost_id() {
        return post_id;
    }

    public void setPost_id(int post_id) {
        this.post_id = post_id;
    }

    public Date getReply_date() {
        return reply_date;
    }

    public void setReply_date(Date reply_date) {
        this.reply_date = reply_date;
    }

    public String getReply_msg() {
        return reply_msg;
    }

    public void setReply_msg(String reply_msg) {
        this.reply_msg = reply_msg;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }
    
}
