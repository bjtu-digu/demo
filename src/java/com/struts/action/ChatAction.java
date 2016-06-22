/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import Hibernate.chat;
import com.Module.BarModule;
import com.Module.ChatModule;
import com.Module.UserModule;
import java.io.PrintWriter;
import java.util.List;
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
public class ChatAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //获取消息列表
        
        String bar_id = request.getParameter("bar_id");
        List<chat> list = ChatModule.getChat(bar_id);
        
        String result = "";
        
        for (int i = 0; i < list.size(); i++) {
            result += "<div style='margin:10px 0;'>";
            result += "嘀咕说：&nbsp;&nbsp;<span>" + list.get(i).getMsg() + "</span>";
            result += "</div>";
        }
        
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = response.getWriter();
        out.print(result);
        
        return null;
    }

}
