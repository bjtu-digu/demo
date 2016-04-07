/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.actionForm;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.MultipartRequestHandler;

/**
 *
 * @author zxq
 */
public class LoginForm extends ActionForm{
    private String name;
    private String pass;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getPass() {
        return pass;
    }
}
