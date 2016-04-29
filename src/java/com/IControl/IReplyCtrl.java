/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IControl;

/**
 *
 * @author zqhPC
 */
public interface IReplyCtrl {
    String getUserID(String name);
    void Reply(String bar_id,String post_id,String reply_msg,String user_id);
}
