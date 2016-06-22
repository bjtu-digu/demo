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
public class SpecialLoginForm extends ActionForm{
    String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }
}
