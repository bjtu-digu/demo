/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.IControl.IStarBarCtrl;
import com.Module.StarBarModule;

/**
 *
 * @author haodong
 */
public class StarBarCtrl extends Ctrl implements IStarBarCtrl{

    public void StarBar(String UserName, String bar_id) {
        String user_id = StarBarModule.getUserID(UserName);
        StarBarModule.StarBar(user_id, UserName);
    }
}
