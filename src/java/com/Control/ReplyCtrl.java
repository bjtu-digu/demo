/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.Module.ReplyModule;

/**
 *
 * @author zqhPC
 */
public class ReplyCtrl extends Ctrl implements com.IControl.IReplyCtrl{
    public  String getUserID(String name){
		return ReplyModule.getUserID(name);
	}
    public  void Reply(String bar_id,String post_id,String reply_msg,String user_id){
        
        ReplyModule.Reply(bar_id, post_id, reply_msg, user_id);
	}
}
