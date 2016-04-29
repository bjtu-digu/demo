/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.IControl.ICreateCtrl;
import com.Module.CreateBarModule;
import com.Module.PostModule;
/**
 *
 * @author haodong
 */
public class CreatCtrl extends Ctrl implements ICreateCtrl {

    @Override
    public String getUserID(String username) {
        return PostModule.getUserID(username);
    }

    @Override
    public int createBar(String id, String topic, String name) {
        return CreateBarModule.createBar(id, topic, name);
    }
    
}
