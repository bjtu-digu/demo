package com.Control;

import com.Module.MsgModule;;

public class MsgCtrl extends Ctrl implements com.IControl.IMsgCtrl{
	String user_id;
	public MsgCtrl(String user_id){
		this.user_id = user_id;
	}
	public MsgCtrl(){
		
	}
	//��������
	public String getUserName(){
		return MsgModule.getUserName(user_id);
	}
	
	//��
	public String getMsg(String Msg_id){
		return MsgModule.getMsg(Msg_id);
	}
	
	//�
	public  String getUserID(String name){
		return MsgModule.getUserID(name);
	}
}
