/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Hibernate;

import java.util.Date;

/**
 *
 * @author zqhPC
 */
public class pic {
    int pic_id;
    String pic_typr;
    String pic_name;

    public int getPic_id() {
        return pic_id;
    }

    public void setPic_id(int pic_id) {
        this.pic_id = pic_id;
    }

    public String getPic_typr() {
        return pic_typr;
    }

    public void setPic_typr(String pic_typr) {
        this.pic_typr = pic_typr;
    }

    public String getPic_name() {
        return pic_name;
    }

    public void setPic_name(String pic_name) {
        this.pic_name = pic_name;
    }

    public Date getPic_date() {
        return pic_date;
    }

    public void setPic_date(Date pic_date) {
        this.pic_date = pic_date;
    }

    public int getPic_size() {
        return pic_size;
    }

    public void setPic_size(int pic_size) {
        this.pic_size = pic_size;
    }

    public String getPic_path() {
        return pic_path;
    }

    public void setPic_path(String pic_path) {
        this.pic_path = pic_path;
    }

    public String getDcp() {
        return dcp;
    }

    public void setDcp(String dcp) {
        this.dcp = dcp;
    }

    public int getExist() {
        return exist;
    }

    public void setExist(int exist) {
        this.exist = exist;
    }
    Date pic_date;
    int pic_size;
    String pic_path;
    String dcp;
    int exist;
    
}
