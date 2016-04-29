/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import com.Module.BarTeacherModule;

/**
 *
 * @author zqhPC
 */
public class BarTeacherCtrl extends Ctrl implements com.IControl.IBarTeacherCtrl{
    public void SetTeacher(String bar_id,String user_id){
         BarTeacherModule.SetTeacher(bar_id, user_id);
    }
    public  void AskTeacher(String bar_id,String user_id){
         BarTeacherModule.AskTeacher(bar_id, user_id);
    }
    public  String getUserID(String name){
              return   BarTeacherModule.getUserID(name);
	}
    public  void DeleteAskTeacher(String msg_id){
            BarTeacherModule.DeleteAskTeacher(msg_id);
	}
}
