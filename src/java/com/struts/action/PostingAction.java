/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Control.CtrlFacory;
import com.IControl.IPostingCtrl;
import com.struts.actionForm.PostingForm;
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
public class PostingAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        response.setContentType("text/html;charset=UTF-8");
        PostingForm posting = (PostingForm) form;
        
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
//        String post_name = request.getParameter("post_name");
//        String post_msg = request.getParameter("post_msg");
        String bar_id = posting.getBar_id();
        String post_name = posting.getPost_name();
        String post_msg = posting.getPost_msg();
        System.out.println(bar_id + "," + post_name + "," + post_msg);
        
        //工厂
        IPostingCtrl pct = CtrlFacory.getPostingCtrl();
        pct.posting(bar_id, bar_id, post_name, post_msg);
        
        ActionForward actionForward = new ActionForward();
        actionForward.setPath(request.getHeader("Referer"));
        actionForward.setRedirect(true);
        return actionForward; 
    }

}
