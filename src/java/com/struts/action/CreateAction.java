/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Module.CreateBarModule;
import com.Module.PostModule;
import com.struts.actionForm.CreateForm;
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
public class CreateAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //response.setContentType("text/html;charset=GB2312");
        //PrintWriter out = response.getWriter();
        CreateForm create = (CreateForm) form;

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
        if (UserName == null || UserName.length() == 0) {
            //response.sendRedirect("Login.jsp");
            return mapping.findForward("login");
        }

        String id = PostModule.getUserID(UserName);
        //String id = request.getParameter("id") ;
        //String name = request.getParameter("name");
        //String topic = request.getParameter("type");
        
        String name = create.getName();
        String topic = create.getType();

        //创建贴吧
        CreateBarModule.createBar(id, topic, name);
        //out.println("创建成功");
        //response.sendRedirect("bar?page=1&name=" + name);
        ActionForward newForward = new ActionForward("search.do"+ "?name=" + name + "&page=1");
        newForward.setRedirect(true);
        return newForward;
    }

}
