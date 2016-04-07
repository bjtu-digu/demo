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
public class chat implements java.io.Serializable {
    int msg_id;
    int user_id;
    int bar_id;
    String msg;
    Date date;
    int exist;

    public chat() {
    }

    public chat(int msg_id, int user_id, int bar_id, String msg, Date date, int exist) {
        this.msg_id = msg_id;
        this.user_id = user_id;
        this.bar_id = bar_id;
        this.msg = msg;
        this.date = date;
        this.exist = exist;
    }

    public int getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getBar_id() {
        return bar_id;
    }

    public void setBar_id(int bar_id) {
        this.bar_id = bar_id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + this.msg_id;
        hash = 67 * hash + this.user_id;
        hash = 67 * hash + this.bar_id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final chat other = (chat) obj;
        if (this.msg_id != other.msg_id) {
            return false;
        }
        if (this.user_id != other.user_id) {
            return false;
        }
        if (this.bar_id != other.bar_id) {
            return false;
        }
        return true;
    }
    
}
