/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.Module.LoginModule;

/**
 *
 * @author zqhPC
 */
public class LoginCtrl extends Ctrl implements com.IControl.ILoginCtrl{
     public  int login(String name, String password){
         return LoginModule.login(name, password);
     }
}
