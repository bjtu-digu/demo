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
public class bar {
    int bar_id;
    int user_id;
    String topic;
    int exist;
    String bar_name;
    Date create_time;
    int bar_head;

    public int getBar_id() {
        return bar_id;
    }

    public void setBar_id(int bar_id) {
        this.bar_id = bar_id;
    }

    public int getUser_id() {
        return user_id;
    }

    public bar() {
    }

    public bar(int bar_id, int user_id, String topic, int exist, String bar_name, Date create_time, int bar_head) {
        this.bar_id = bar_id;
        this.user_id = user_id;
        this.topic = topic;
        this.exist = exist;
        this.bar_name = bar_name;
        this.create_time = create_time;
        this.bar_head = bar_head;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }

    public String getBar_name() {
        return bar_name;
    }

    public void setBar_name(String bar_name) {
        this.bar_name = bar_name;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public int getBar_head() {
        return bar_head;
    }

    public void setBar_head(int bar_head) {
        this.bar_head = bar_head;
    }
    
}
