/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.struts.action;

import com.Module.SearchModule;
import com.struts.actionForm.SearchForm;
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
public class SearchAction extends Action {

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        SearchForm search = (SearchForm) form;
        String name = search.getName();

        if (SearchModule.checkBar(name) != 1) {
            return mapping.findForward("createbar");
        } else {
            ActionForward newForward = new ActionForward(mapping.findForward( "bar").getPath()+ "?name=" + name + "&page=1");
            return newForward;
        }
    }

}
