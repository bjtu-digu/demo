/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Control.CtrlFacory;
import com.IControl.IReplyCtrl;
import com.Module.ReplyModule;
import com.struts.actionForm.ReplyForm;
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
public class ReplyAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        ReplyForm reply = (ReplyForm) form;
        
        String bar_id = reply.getBar_id();
        String post_id = reply.getPost_id();
        String reply_msg = reply.getReply_msg();
        //String user_id = request.getParameter("user_id");
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
         IReplyCtrl ibc = CtrlFacory.getReplyCtrl();
        String user_id=ibc.getUserID(UserName);
        //String user_id = ReplyModule.getUserID(UserName);
       // ReplyModule.Reply(bar_id, post_id, reply_msg, user_id);
        ibc.Reply(bar_id, post_id, reply_msg, user_id);
        ActionForward actionForward = new ActionForward();
        actionForward.setPath(request.getHeader("Referer"));
        actionForward.setRedirect(true);
        return actionForward; 
    }

}
