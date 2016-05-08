/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Module.MsgModule;
import com.struts.actionForm.MsgForm;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionRedirect;

/**
 *
 * @author zxq
 */
public class MsgAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        MsgForm msgForm = (MsgForm) form;
        
        String user_id = msgForm.getUser_id();
        String msg_id = msgForm.getMsg_id();
        String msg = msgForm.getMsg();
        //如果有消息穿过来
        if (msg != null && msg.length() != 0) {
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
            //插入一条普通消息
            MsgModule.Msg(msg, "1", MsgModule.getUserID(UserName), user_id);
            //如果是回复，转到那个人的页面，如果不是回复，则转到自己的页面
            if (msg_id == null) {
                //response.sendRedirect("user?user_id=" + user_id);
                ActionForward newForward = new ActionRedirect("user.do?user_id=" + user_id);
                return newForward;
            } else {
                //System.out.println("?");
                //response.sendRedirect("user?user_id=" + MsgModule.getUserID(UserName));
                ActionForward newForward = new ActionRedirect("user.do?user_id=" + MsgModule.getUserID(UserName));
                return newForward;
            }
        }
        request.setAttribute("user_id", user_id);
        request.setAttribute("msg_id", msg_id);
        return mapping.findForward("msg");
    }

}
