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
    
    public static IStarBarCtrl getStarBarCtrl()
    {
        IStarBarCtrl isbc = new StarBarCtrl();
        return isbc;
    }
    public static ISearchCtrl getSearchCtrl()
    {
        ISearchCtrl isc = new SearchCtrl();
        return isc;
    }
    public static ICreateCtrl getCreateCtrl()
    {
        ICreateCtrl icc = new CreatCtrl();
        return icc;
    }
    
    public static IRegisterCtrl getrRegisterCtrl()
    {
        IRegisterCtrl irc = new RegisterCtrl();
        return irc;
    }
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
    /*
    public static IBarCtrl getBarCtrl(String str, String str2)
    {
        return null;
    }
    */
}
