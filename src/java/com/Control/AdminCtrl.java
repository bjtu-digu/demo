/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Control;

import Hibernate.bar;
import Hibernate.post;
import Hibernate.reply;
import Hibernate.user;
import com.Module.AdminModule;
import java.util.List;

/**
 *
 * @author zxq
 */
public class AdminCtrl {
    List<user> users;
    List<bar> bars;
    List<post> posts;
    List<reply> replys;
    
    public AdminCtrl(){
        users = AdminModule.getUsers();
        bars = AdminModule.getBars();
        posts = AdminModule.getPosts();
        replys = AdminModule.getReplys();
    }

    public List<user> getUsers() {
        return users;
    }
    
    public int getUsersNum(){
        return users.size();
    }
    
    public String getUserName(int i){
        return users.get(i).getUser_name();
    }
    
    public int getUserId(int i){
        return users.get(i).getUser_id();
    }
    
    public int getUserStatus(int i){
        return users.get(i).getAvailable();
    }
    
    public int getBarNum(){
        return bars.size();
    }
    
    public int getBarId(int i){
        return bars.get(i).getBar_id();
    }
    
    public String getBarName(int i){
        return bars.get(i).getBar_name();
    }
    
    public String getBarTopic(int i){
        return bars.get(i).getTopic();
    }
    
    public String getBarCreateTime(int i){
        return String.valueOf(bars.get(i).getCreate_time());
    }
    
    public int getBarStatus(int i){
        return bars.get(i).getAvailable();
    }
    
    public int getPostNum(){
        return posts.size();
    }
    
    public int getPostId(int i){
        return posts.get(i).getPost_id();
    }
    
    public String getPostName(int i){
        return posts.get(i).getPost_name();
    }
    
    public String getPostMsg(int i){
        return posts.get(i).getPost_msg();
    }
    
    public String getPostUserName(int i){
        return AdminModule.getUserNamebyId(posts.get(i).getUser_id());
    }
    
    public String getPostCreateTime(int i){
        return String.valueOf(posts.get(i).getPost_date());
    }
    
    public String getOwnBarName(int i){
        return AdminModule.getBarNamebyId(posts.get(i).getBar_id());
    }
    
    public int getPostStatus(int i){
        return posts.get(i).getAvailable();
    }
    
    public int getReplyNum(){
        return replys.size();
    }
    
    public int getReplyId(int i){
        return replys.get(i).getReply_id();
    }
    
    public String getReplyMsg(int i){
        return replys.get(i).getReply_msg();
    }
    
    public String getReplyUserName(int i){
        return AdminModule.getUserNamebyId(replys.get(i).getUser_id());
    }
    
    public String getReplyCreateTime(int i){
        return String.valueOf(replys.get(i).getReply_date());
    }
    
    public String getOwnPost(int i){
        return AdminModule.getPostNamebyId(replys.get(i).getPost_id());
    }
    
    public int getReplyStatus(int i){
        return replys.get(i).getAvailable();
    }
}
