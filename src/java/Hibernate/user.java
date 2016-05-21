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
public class user {
    Integer pic_id;
    Integer user_id;
    String user_name;
    Integer exist;
    String password;
    Integer available;

    public user() {
    }
    Date register_date;
    Integer is_teacher;
    Integer is_manager;
    String mail;

 

    public user(Integer pic_id, Integer user_id, String user_name, Integer exist, String password, Date register_date, Integer is_teacher, Integer is_manager, String mail) {
        this.pic_id = pic_id;
        this.user_id = user_id;
        this.user_name = user_name;
        this.exist = exist;
        this.password = password;
        this.register_date = register_date;
        this.is_teacher = is_teacher;
        this.is_manager = is_manager;
        this.mail = mail;
    }

    public Integer getPic_id() {
        return pic_id;
    }

    public void setPic_id(Integer pic_id) {
        this.pic_id = pic_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Integer getExist() {
        return exist;
    }

    public void setExist(Integer exist) {
        this.exist = exist;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegister_date() {
        return register_date;
    }

    public void setRegister_date(Date register_date) {
        this.register_date = register_date;
    }

    public Integer getIs_teacher() {
        return is_teacher;
    }

    public void setIs_teacher(Integer is_teacher) {
        this.is_teacher = is_teacher;
    }

    public Integer getIs_manager() {
        return is_manager;
    }

    public void setIs_manager(Integer is_manager) {
        this.is_manager = is_manager;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setAvailable(Integer available) {
        this.available = available;
    }

    public Integer getAvailable() {
        return available;
    }

   
 
}
