/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Module.BarModule;
import com.struts.actionForm.BarForm;
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
public class BarAction extends Action{

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        BarForm bar = (BarForm)form;
        String id = bar.getBar_id();
        String name = BarModule.getBarName1(id);
        
        request.setAttribute("name", name);
        request.setAttribute("page", "1");
        return mapping.findForward("bar");
    }
    
}
