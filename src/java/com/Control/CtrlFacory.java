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

public class CtrlFacory {
    
    //获取postCtrl
    public static IPostCtrl getPostCtrl(String post_id, String page, String poster, String teacher){
        IPostCtrl pc = new PostCtrl(post_id,page,poster,teacher);
        return pc;
    } 
    
    //获取PostingCtrl
    public static IPostingCtrl getPostingCtrl(){
        IPostingCtrl pct = new PostingCtrl();
        return pct;
    }
    public static IBarCtrl getBarCtrl()
    {
        IBarCtrl ibc = new BarCtrl();
        return ibc;
    }
      public static IBarTeacherCtrl getBarTeacherCtrl(){
        IBarTeacherCtrl btc = new BarTeacherCtrl();
        return btc;
    }
       public static IMsgCtrl getMsgCtrl(){
        IMsgCtrl btc = new MsgCtrl();
        return btc;
    }
     public static ILoginCtrl getLoginCtrl(){
        ILoginCtrl btc = new LoginCtrl();
        return btc;
    }
      public static IReplyCtrl getReplyCtrl(){
        IReplyCtrl btc = new ReplyCtrl();
        return btc;
    }
        public static ISignCtrl getSignCtrl(){
        ISignCtrl btc = new SignCtrl();
        return btc;
    }
       public static IUnStarBarCtrl getUnStarBarCtrl(){
        IUnStarBarCtrl btc = new UnStarBarCtrl();
        return btc;
    }
}
