/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.Module.UnStarBarModule;

/**
 *
 * @author zqhPC
 */
public class UnStarBarCtrl extends Ctrl implements com.IControl.IUnStarBarCtrl{
      public void UnStarBar(String bar_id, String user_id) {
          UnStarBarModule.UnStarBar(bar_id, user_id);
    }
    //获得用户ID

    public String getUserID(String name) {
      return UnStarBarModule.getUserID(name);
    }
}
