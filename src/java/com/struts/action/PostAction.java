/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.struts.actionForm.PostForm;
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
public class PostAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //response.setContentType("text/html;charset=GB2312");
        //PrintWriter out = response.getWriter();
        PostForm post = (PostForm) form;
        
        //wait――所在帖子id――帖子页面数
        String post_id = post.getPost_id();
        String page = post.getPage();
        String poster = post.getPoster();
        String teacher = post.getTeacher();
        if (page == null) {
            page = "1";
        }
        request.setAttribute("post_id", post_id);
        request.setAttribute("page", page);
        request.setAttribute("poster", poster);
        request.setAttribute("teacher", teacher);
        //request.getRequestDispatcher("Post.jsp").forward(request, response);
        return mapping.findForward("self");
    }

}
