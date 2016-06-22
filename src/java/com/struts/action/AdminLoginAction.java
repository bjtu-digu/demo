/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.MD5.MD5Util;
import com.Module.AdminModule;
import com.Module.LoginModule;
import com.struts.actionForm.LoginForm;
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
public class AdminLoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        LoginForm form1 = (LoginForm) form;
        String name = form1.getName();
        String pass = form1.getPass();

        //pass = MD5Util.encode(pass);
        boolean back = AdminModule.login(name, pass);

        String alert = "";

        if (!back) {
            alert = "<script>alert('用户名或密码错误')</script>";
            request.setAttribute("alert", alert);
            return mapping.findForward("self");
        }

        Cookie cookie = new Cookie("admin", name);
        response.addCookie(cookie);
        alert = "<script>alert('登录成功')</script>";
        request.setAttribute("alert", alert);
        return mapping.findForward("admin");
    }

}
