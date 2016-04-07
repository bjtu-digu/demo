/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.struts.actionForm.RegisterForm;
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
		
		/*if(RegisterModule.checkRegister(name) != 0){
			out.println("用户已存在");
			response.sendRedirect("Search.jsp");
		}*/
		
		String mail = register.getMail() ;
		String pass = register.getPass() ;
		//String pic = request.getParameter("pic") ;
		//RegisterModule.register(name, pass, mail, pic);	
		//out.println("注册成功");
		//out.print("<script language='javascript'>alert('注册成功');<script>");
		return mapping.findForward("search");
    }
    
}
