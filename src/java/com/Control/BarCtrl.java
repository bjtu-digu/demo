package com.Control;

import Hibernate.bar;
import Hibernate.post;
import Hibernate.user;
import com.Module.BarModule;
import com.Module.SearchModule;
import java.util.List;

public class BarCtrl extends Ctrl implements com.IControl.IBarCtrl{
	String page;
	String name;
	List<bar> BarInfo;	
	List<user> TeacherInfo;	
	List<post> PostList;	

	public String getUserID1(String name){
		return SearchModule.getUserID(name);
	}
	public BarCtrl(){
            
        }
	public BarCtrl(String name,String page){
		this.page = page;
		this.name = name;
                int i = 0;
		BarInfo = BarModule.getBarInfo(name);
		TeacherInfo = BarModule.getTeacherInfo(String.valueOf(BarInfo.get(0).getBar_id()));
		
		int pageNum = Integer.parseInt(page);
		PostList = BarModule.getPostList(String.valueOf(BarInfo.get(0).getBar_id()), 
				((pageNum-1)*10+1) + "", ((pageNum-1)*10+10) + "");
	}
	//������
	public boolean CheckBarName(){
		return BarModule.checkBar(name) != 1;
	}

	
/////////////////////////
//���������
/////////////////////////
	//��ȡ����id
	public String getBarOwnerId(){
		return String.valueOf(BarInfo.get(0).getUser_id());
                
	}
	//��ȡ��������
	public String getBarOwnerName(){
		return getUserName(String.valueOf(BarInfo.get(0).getUser_id()));
	}
	//������id
	public String getBarId(){
		return String.valueOf(BarInfo.get(0).getBar_id());
	}
	//��������
	public String getBarName(){
		return BarInfo.get(0).getBar_name();
	}
	
	//����������
	public String getBarType(){
		return BarInfo.get(0).getTopic();
	}
	
	//�����������
	public int getPostNum(){
		return PostList.size();
	}
	
	//�������id
	public String getPostId(int index){
		return String.valueOf(PostList.get(index).getPost_id());
	}
	
	//���¥��id
	public String getPosterId(int index){
		return String.valueOf(PostList.get(index).getUser_id());
	}
	
	//���������
	public String getPostName(int index){
		return String.valueOf(PostList.get(index).getPost_name());
	}
	
	//�����������
	public String getPostMsg(int index){
		return String.valueOf(PostList.get(index).getPost_msg());
	}
	
	//��ȡ����ʱ��
	public String getPostDate(int index){
		return String.valueOf(PostList.get(index).getPost_date());
	}
	
	//��ȡ���ظ�ʱ��
	public String getLastDate(int index){
		return String.valueOf(PostList.get(index).getLast_date());
	}
	
	//��ȡ��󷢲���id
	public String getLastId(int index){
		return String.valueOf(PostList.get(index).getPost_id());
	}
	
	//���ĳ������
	public String getUserName(String user_Id){
		return BarModule.getUserName(user_Id);
	}
	
	//��ȡ�û�ID
	public String getUserID(String name){
		return SearchModule.getUserID(name);
	}
	
	//���ĳ���û��Ƿ��ע�����
	public boolean checkStarBar(String user_id){
		try{
			if(BarModule.checkStarBar(user_id, getBarId()).equals("1"))
				return true;
			else return false;
		}catch(Exception e) {return false;}
	}
	//����Ƿ��Ѿ�ǩ��
	public boolean checkSign(String user_id){
		try{
			if(BarModule.CheckSign(getBarId(),user_id).equals("1"))
				return true;
			else return false;
		}catch(Exception e) {return false;}
	}
	
	//���ĳ���Ƿ�����ʦ
	public boolean checkTeacher(String userName){
		try{
			String get = BarModule.checkTeacher(this.getUserID(userName));
			if(get.equals("1")){
				return true;
			}
			else return false;
		}catch(Exception e){
			return false;
		}
	}
	//��ȡ��ʦ����
	public int getTeacherNum(){
		return TeacherInfo.size();
	}
	//��ȡ��ʦid
	public String getTeacherId(int index){
		return String.valueOf(TeacherInfo.get(index).getUser_id());
	}
	//��ȡ��ʦ����
	public String getTeacherName(int index){
		return String.valueOf(TeacherInfo.get(index).getUser_name());
	}
	//��ȡĳһ���������
	public String getBarName1(String bar_id){
		return BarModule.getBarName1(bar_id);
	}
	//���ĳ�����Ƿ���һ���ɵİ���
	public boolean checkBarTeacher(String bar_id,String user_id){
		try{
			if(BarModule.checkBarTeacher(user_id, bar_id).equals("1")){
				return true;
			}
			else return false;
		}catch(Exception e) {
			return false;
		}
	}
	//��ȡĳ��������id
	public String getReplyer(String reply_id){
		return BarModule.getReplyer(reply_id);
	}
}










