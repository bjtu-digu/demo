/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.struts.actionForm.SpecialLoginForm;
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
public class SpecialLoginAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        SpecialLoginForm login = (SpecialLoginForm) form;
        Cookie cookie = new Cookie("name", login.getUsername());
        response.addCookie(cookie);
        String alert = "<script>alert('登录成功')</script>";
        request.setAttribute("alert", alert);
        return mapping.findForward("search");
    }

}
