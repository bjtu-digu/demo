/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Control.CtrlFacory;
import com.IControl.IBarCtrl;
import com.IControl.IBarTeacherCtrl;
import com.Module.BarTeacherModule;
import com.struts.actionForm.BarTeacherForm;
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
public class BarTeacherAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        BarTeacherForm barTeacher = (BarTeacherForm) form;
        
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
//        String bar_id = request.getParameter("bar_id");
//        String ask = request.getParameter("ask");
        
         IBarTeacherCtrl ibc = CtrlFacory.getBarTeacherCtrl();
        
        
        String bar_id = barTeacher.getBar_id();
        String ask = barTeacher.getAsk();
        //如果不是请求，则设置
        if (ask == null) {
            String yes = request.getParameter("yes");
            //如果
            if (yes != null) {
                //设置老师
                String user_id = request.getParameter("user_id");
                //BarTeacherModule.SetTeacher(bar_id, user_id);
                ibc.SetTeacher(bar_id, user_id);
                 
                String msg_id = request.getParameter("msg_id");
               // BarTeacherModule.DeleteAskTeacher(msg_id);
                ibc.DeleteAskTeacher(msg_id);
                response.sendRedirect(request.getHeader("Referer"));
            } else {
                String msg_id = request.getParameter("msg_id");
                //BarTeacherModule.DeleteAskTeacher(msg_id);
                ibc.DeleteAskTeacher(msg_id);
            }
        } //如果不是请求，则给吧主发送信号
        else {
            //给吧主加入消息
           // BarTeacherModule.AskTeacher(bar_id, BarTeacherModule.getUserID(UserName));
            ibc.AskTeacher(bar_id, ibc.getUserID(UserName));
        }
        
        ActionForward actionForward = new ActionForward(request.getHeader("Referer"));
        return actionForward; 
    }

}
