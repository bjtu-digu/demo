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
public class ChatingForm extends ActionForm{
    private String bar_id;
    private String msg;

    public void setBar_id(String bar_id) {
        this.bar_id = bar_id;
    }

    public String getBar_id() {
        return bar_id;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }
    
    
}
