/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Module.AdminModule;
import com.struts.actionForm.OperatorForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.Cookie;

/**
 *
 * @author zxq
 */
public class OperatorAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String admin = null;
        Cookie[] cook = request.getCookies();//用一个Cookie数组来接收
        if (cook != null) {
            for (int j = 0; j < cook.length; j++) {	//通过循环来打印Cookie  
                if (cook[j].getName().equals("admin")) //取cookie的名 
                {
                    admin = cook[j].getValue();	//取cookie的值  
                }
            }
        }
        String alert = "";
        if(!AdminModule.checkAdmin(admin)){
            alert = "<script>alert('请重新登陆')</script>";
            return mapping.findForward("login");
        }
        
        OperatorForm operator = (OperatorForm)form;
        String target = operator.getTarget();
        String ID = operator.getID();
        String status = operator.getStatus();
        
        String table = "";
        switch(target){
            case "1": table = "user"; break;
            case "2": table = "bar"; break;
            case "3": table = "post"; break;
            case "4": table = "reply"; break;
        }
        
        AdminModule.changeStatus(table, ID, status);
        alert = "<script>alert('操作成功')</script>";
        request.setAttribute("alert", alert);
        return mapping.findForward("admin");
    }

}
