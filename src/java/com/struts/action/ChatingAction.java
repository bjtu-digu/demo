/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Module.ChatModule;
import com.Module.MsgModule;
import com.Module.UserModule;
import com.struts.actionForm.ChatingForm;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author zxq
 */
public class ChatingAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ChatingForm chating = (ChatingForm) form;
        
        String UserName = "";
        Cookie[] cook = request.getCookies();//用一个Cookie数组来接收
        if (cook != null) {
            for (int j = 0; j < cook.length; j++) {	//通过循环来打印Cookie  
                if (cook[j].getName().equals("name")) //取cookie的名 
                {
                    UserName = cook[j].getValue();	//取cookie的值  
                }
            }
        }
        
        String bar_id = chating.getBar_id();
        String msg = chating.getMsg();
        String user_id = UserModule.getUserID(UserName);
        ChatModule.addChat(user_id, bar_id, msg);
        
        ActionForward actionForward = new ActionForward(request.getHeader("Referer"));
        actionForward.setRedirect(true);
        return actionForward; 
    }

}
