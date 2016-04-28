/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.IControl.*;
import com.Module.PostingModule;

/**
 *
 * @author zqhPC
 */
public class PostingCtrl extends Ctrl implements com.IControl.IPostingCtrl{

    @Override
    public void posting(String bar_id, String UserName, String post_name, String post_msg) {
       PostingModule.posting(bar_id, PostingModule.getUserID(UserName), post_name, post_msg);
    }
    
}
