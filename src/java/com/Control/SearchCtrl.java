package com.Control;

import com.Module.SearchModule;

import javax.servlet.http.HttpServletRequest;

public class SearchCtrl extends Ctrl{
	//��ȡ�û�ID
	public String getUserID(String name){
		return SearchModule.getUserID(name);
	}
}
