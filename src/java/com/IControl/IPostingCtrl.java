/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IControl;

import HibernateUtil.HibernateUtil;
import org.hibernate.Session;

/**
 *
 * @author zqhPC
 */
public interface IPostingCtrl {
    	void posting(String bar_id,String user_id,String post_name,String post_msg);
}
