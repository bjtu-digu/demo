package com.Control;

import java.util.ArrayList;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;

public class Ctrl {
	
	//�������İ�װ����
	public String MakeUserTips(String id,String name){
		return MakeATips("user?id="+id, name);
	}
	//�����Ӱ�װ����
	public String MakeATips(String address,String value){
		return MakeSimpleTips("a", "href", address, value);
	}
	
	//�����԰�װ����
	public String MakeSimpleTips(String name,String attibute,String params,String value){
		ArrayList<String> get = new ArrayList<String>();
		get.add(attibute);
		get.add(params);
		return MakeTips(name, get, value);
	}
	
	//Ԫ��װ����
	public String MakeTips(String name,ArrayList<String> attribute,String value){
		String back = "";
		back += "<" + name;
		for(int i = 0; i < attribute.size(); i += 2){
			back += " ";
			back += attribute.get(i);
			back += "=";
			back += attribute.get(i+1);
		}
		back += ">";
		back += value;
		back += "</" + name + ">";
		return back;
	}
	
	//����
	public String NewLine(){
		return "<br/>";
	}

}
