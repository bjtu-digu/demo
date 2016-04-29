package com.Control;

import com.IControl.ISearchCtrl;
import com.Module.SearchModule;

import javax.servlet.http.HttpServletRequest;

public class SearchCtrl extends Ctrl implements ISearchCtrl{
	//��ȡ�û�ID
	public String getUserID(String name){
		return SearchModule.getUserID(name);
	}

    @Override
    public int checkBar(String name) {
        return SearchModule.checkBar(name);
    }
}
