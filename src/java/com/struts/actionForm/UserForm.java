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
public class UserForm extends ActionForm{
    String user_id;

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }

    public String getUser_id() {
        return user_id;
    }
    
}
