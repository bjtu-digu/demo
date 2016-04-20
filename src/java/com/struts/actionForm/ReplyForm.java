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
public class ReplyForm extends ActionForm{
    private String bar_id;
    private String post_id;
    private String reply_msg;

    public void setBar_id(String bar_id) {
        this.bar_id = bar_id;
    }

    public String getBar_id() {
        return bar_id;
    }

    public void setPost_id(String post_id) {
        this.post_id = post_id;
    }

    public String getPost_id() {
        return post_id;
    }

    public void setReply_msg(String reply_msg) {
        this.reply_msg = reply_msg;
    }

    public String getReply_msg() {
        return reply_msg;
    }
    
    
}
