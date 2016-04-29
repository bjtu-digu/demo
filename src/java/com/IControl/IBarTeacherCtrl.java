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
public interface IBarTeacherCtrl {
    
    void SetTeacher(String bar_id,String user_id);
    void AskTeacher(String bar_id,String user_id);
    void DeleteAskTeacher(String msg_id);
    String getUserID(String name);
}
