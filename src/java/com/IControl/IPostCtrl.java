/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.IControl;

import com.Module.PostModule;

/**
 *
 * @author zqhPC
 */
public interface IPostCtrl {
    public String getUserID1(String name);
    //获得帖子id

    public String getPostId();
    //获得贴吧表表内相关信息

    public String OutBarInfo() ;

    //获取10层楼信息
    public String OutFloorInfo() ;

/////////////////////////
//最终输出区
/////////////////////////
    //获取帖子所在贴吧名字
    public String getBarname() ;

    //获取帖子所在贴吧id
    public String getBarId();

    //获取帖子一楼内容
    public String getFirstFloorMsg() ;

    //获取获取帖子名字
    public String getFirstName() ;

    //获取贴吧日期
    public String getFirstDate();

    //获取楼主id
    public String getFirstUserId() ;

    //获取楼主名
    public String getFirstUserName();
    //获取层主数

    public int getFloorNum() ;
    //获取层主id

    public String getFloorUserId(int index) ;
    //获取层主名

    public String getFloorUserName(int index) ;
    //获取层内容

    public String getFloorMsg(int index) ;
    //获取层日期

    public String getFloorDate(int index) ;
    //查询某人是不是老师

    public boolean checkTeacher(String user_id);
}
