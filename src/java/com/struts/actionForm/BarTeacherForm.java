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
public class BarTeacherForm extends ActionForm{
    private String bar_id;
    private String ask;

    public void setAsk(String ask) {
        this.ask = ask;
    }

    public String getAsk() {
        return ask;
    }

    public void setBar_id(String bar_id) {
        this.bar_id = bar_id;
    }

    public String getBar_id() {
        return bar_id;
    }
    
    
}
