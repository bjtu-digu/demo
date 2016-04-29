/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IControl;

/**
 *
 * @author haodong
 */
public interface IRegisterCtrl {
    int register(String name, String pass, String mail, String pic_id);
    int checkRegister(String name);
}
