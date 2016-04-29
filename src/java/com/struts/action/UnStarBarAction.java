/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Control.CtrlFacory;
import com.IControl.IUnStarBarCtrl;
import com.Module.UnStarBarModule;
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
public class UnStarBarAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
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
        String bar_id = request.getParameter("bar_id");
        
        IUnStarBarCtrl ibc = CtrlFacory.getUnStarBarCtrl();
        
        //UnStarBarModule.UnStarBar(bar_id, UnStarBarModule.getUserID(UserName));
        ibc.UnStarBar(bar_id,ibc.getUserID(UserName));
        ActionForward actionForward = new ActionForward(request.getHeader("Referer"));
        actionForward.setRedirect(true);
        return actionForward; 
    }

}
