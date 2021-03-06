/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.MD5.MD5Util;
import com.Module.RegisterModule;
import com.struts.actionForm.RegisterForm;
import java.io.PrintWriter;
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
public class RegisterAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        RegisterForm register = (RegisterForm) form;
        String name = register.getName();
        String mail = register.getMail();
        String pass = register.getPass();
        String pic = request.getParameter("pic");
        //MD5加密
        pass = MD5Util.encode(pass);
        
        String alert = "";

        if (RegisterModule.checkRegister(name) != 0) {
            //out.println("用户已存在");
            alert = "<script>alert('用户已存在')</script>";
            request.setAttribute("alert", alert);
            return mapping.findForward("self");
        }
        
        if(!RegisterModule.checkEmail(mail)){
            alert = "<script>alert('请填写真实有效的邮箱')</script>";
            request.setAttribute("alert", alert);
            return mapping.findForward("self");
        }

        if (RegisterModule.register(name, pass, mail, pic) == 0) {
            alert = "<script>alert('未知错误')</script>";
            request.setAttribute("alert", alert);
            return mapping.findForward("self");
        }
        //out.println("注册成功");
        //out.print("<script language='javascript'>alert('注册成功');<script>");
        alert = "<script>alert('注册成功')</script>";
        request.setAttribute("alert", alert);
        return mapping.findForward("search");
    }

}
