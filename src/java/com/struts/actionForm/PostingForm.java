/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.actionForm;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author zxq
 */
public class PostingForm extends ActionForm{
    private String bar_id;
    private String post_name;
    private String post_msg;

    public void setBar_id(String bar_id) {
        this.bar_id = bar_id;
    }

    public String getBar_id() {
        return bar_id;
    }

    public void setPost_msg(String post_msg) {
        this.post_msg = post_msg;
    }

    public String getPost_msg() {
        return post_msg;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public String getPost_name() {
        return post_name;
    }
    
    
}
