/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.MD5.MD5Util;
import com.Module.LoginModule;
import com.struts.actionForm.LoginForm;
import java.io.PrintWriter;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.SessionFactory;

/**
 *
 * @author zxq
 */
public class LoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //response.setContentType("text/html;charset=GB2312");
        LoginForm form1 = (LoginForm) form;
        String name = form1.getName();
        String pass = form1.getPass();
        
        pass = MD5Util.encode(pass);
        int back = LoginModule.login(name, pass);
        
        String alert = "";

        if (back == 0) {
            //SessionFactory sessionFactory = HibernateUtil.HibernateUtil.getSessionFactory();
            //out.println("用户不存在");
            alert = "<script>alert('用户名或密码错误')</script>";
            request.setAttribute("alert", alert);
            return mapping.findForward("self");
        } else {
            Cookie cookie = new Cookie("name", name);
            response.addCookie(cookie);
            alert = "<script>alert('登录成功')</script>";
            //response.sendRedirect(request.getHeader("Referer"));
            //response.("Search.jsp");
        }
        request.setAttribute("alert", alert);
        return mapping.findForward("search");
    }

}
