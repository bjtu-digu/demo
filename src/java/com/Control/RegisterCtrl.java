/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.IControl.IRegisterCtrl;
import com.Module.RegisterModule;

/**
 *
 * @author haodong
 */
public class RegisterCtrl extends Ctrl implements IRegisterCtrl{

    @Override
    public int register(String name, String pass, String mail, String pic_id) {
        return RegisterModule.register(name, pass, mail, pic_id);
    }

    @Override
    public int checkRegister(String name) {
        return RegisterModule.checkRegister(name);
    }
    
}
