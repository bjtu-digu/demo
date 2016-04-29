/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.Module.SignModule;

/**
 *
 * @author zqhPC
 */
public class SignCtrl extends Ctrl implements com.IControl.ISignCtrl{
    public  void Sign(String bar_id,String user_id){
              SignModule.Sign(bar_id, user_id);
	}
	//获得用户ID
	public  String getUserID(String name){
              return SignModule.getUserID(name);
	}
}
