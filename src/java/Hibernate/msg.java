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
public class msg {
    int msg_id;
    String msg;
    String add_msg;
    String type;
    int sender_id;
    int reader_id;
    int read;
    int exist;
    Date msg_date;

    public int getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(int msg_id) {
        this.msg_id = msg_id;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getAdd_msg() {
        return add_msg;
    }

    public void setAdd_msg(String add_msg) {
        this.add_msg = add_msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSender_id() {
        return sender_id;
    }

    public void setSender_id(int sender_id) {
        this.sender_id = sender_id;
    }

    public int getReader_id() {
        return reader_id;
    }

    public void setReader_id(int reader_id) {
        this.reader_id = reader_id;
    }

    public int getRead() {
        return read;
    }

    public void setRead(int read) {
        this.read = read;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }

    public msg() {
    }

    public msg(int msg_id, String msg, String add_msg, String type, int sender_id, int reader_id, int read, int exist, Date msg_date) {
        this.msg_id = msg_id;
        this.msg = msg;
        this.add_msg = add_msg;
        this.type = type;
        this.sender_id = sender_id;
        this.reader_id = reader_id;
        this.read = read;
        this.exist = exist;
        this.msg_date = msg_date;
    }

    public Date getMsg_date() {
        return msg_date;
    }

    public void setMsg_date(Date msg_date) {
        this.msg_date = msg_date;
    }
    
    
    
    
}
