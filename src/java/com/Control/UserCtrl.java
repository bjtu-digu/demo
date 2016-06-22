package com.Control;

import Hibernate.bar;
import Hibernate.msg;
import Hibernate.post;
import Hibernate.reply;
import Hibernate.star_bar;
import Hibernate.star_user;
import java.util.ArrayList;

import com.Module.BarModule;
import com.Module.UserModule;
import java.util.List;

public class UserCtrl extends Ctrl {

    String id;
    String user_id;
    String UserInfo;
    List<star_user> StarUser;
    List<star_user> FansUser;
    List<bar> StarBar;
    List Post;
    List Reply;
    List<msg> Msg;

    public UserCtrl(String user_name, String user_id) {
        this.id = UserModule.getUserID(user_name);
        this.user_id = user_id;
        UserInfo = UserModule.getUserInfo(user_id);
        StarUser = UserModule.getStarUser(user_id);
        FansUser = UserModule.getFansUser(user_id);
        StarBar = UserModule.getStarBar(user_id);
        Post = UserModule.getPost(user_id);
        Reply = UserModule.getReply(user_id);
        Msg = UserModule.getMsg(user_id);
    }
    //获取对某个贴吧的签到数

    public String getSignNum(String bar_id) {
        return UserModule.getSignNum(user_id, bar_id);
    }
    //获取某人id

    public String getUserId(String user_name) {
        return UserModule.getUserID(user_name);
    }
    //获取关注人

    public String OutStartUser() {
        String backString = "";
        for (int i = 0; i < StarUser.size(); i++) {
            backString += MakeATips("starbar.do?&page=1id=1&name=" + StarUser.get(i).getStar_id(), UserModule.getUserName(String.valueOf(StarUser.get(i).getStar_id())));
            backString += NewLine();
            //被关注人链接
        }
        return backString;
    }

    //获取粉丝
    public String OutFansUser() {
        String backString = "";
        for (int i = 0; i < FansUser.size(); i++) {
            backString += MakeATips("user.do?id=1&page=1&name=" + FansUser.get(i).getUser_id(), UserModule.getUserName(String.valueOf(FansUser.get(i).getUser_id())));
            backString += NewLine();
            //粉丝链接
        }
        return backString;
    }

    //获取关注贴吧
    public String OutStarBar() {
        String backString = "";
        for (int i = 0; i < StarBar.size(); i++) {
            //out.print(StarBar.get(i));贴吧id
            backString += MakeATips("bar.do?id=1&page=1&name=" + StarBar.get(i).getBar_id(), StarBar.get(i).getBar_name());
            backString += NewLine();
            //贴吧链接
        }
        return backString;
    }

    //输出发帖
    public String OutPost() {
        String backString = "";
        post onePost;
        bar oneBar;
        for (int i = 0; i < Post.size(); i += 5) {
            onePost = ((post)((Object[])Post.get(i))[1]);
            oneBar =((bar)((Object[])Post.get(i))[0]);
            
            //发帖链接（显示帖子名）
            backString += MakeATips("post.do?post_id=" + onePost.getPost_name()+ "&page=1", String.valueOf(onePost.getPost_id()));
            backString += NewLine();
            //发帖内容（显示帖子内容）
            backString += oneBar.getBar_id();
            backString += NewLine();
            //贴吧链接
            String bar_name = oneBar.getBar_name();
            backString += MakeATips("bar.do?name=" + bar_name + "&page=1", bar_name);
            backString += NewLine();
            //发帖时间
            backString += onePost.getPost_date();
            backString += NewLine();
            backString += NewLine();
        }
        return backString;
    }

    public String NewLine() {
        return "<br/>";
    }

    /**
     * *****************************
     * 最终输出区
     */
    //获取用户名
    public String getUserName() {
        return UserModule.getUserName(user_id);
    }

    //获取某一用户名
    public String getUserName1(String user_id) {
        return UserModule.getUserName(user_id);
    }

    //获取贴吧数目
    public int getBarNum() {
        return this.StarBar.size();
    }

    //获取贴吧名字
    public String getBarName(int index) {
        return this.StarBar.get(index).getBar_name();
    }

    //获取关注人数目
    public int getStarNum() {
        return this.StarUser.size();
    }

    //获取关注人名字
    public String getStarName(int index) {
        return UserModule.getUserName(String.valueOf(StarUser.get(index).getStar_id()));
    }

    //获取关注人id
    public String getStarId(int index) {
        return String.valueOf(StarUser.get(index).getStar_id());
    }

    //获取粉丝数目
    public int getFansNum() {
        return this.FansUser.size();
    }

    //获取粉丝名字
    public String getFansName(int index) {
        return UserModule.getUserName(String.valueOf(FansUser.get(index).getUser_id()));
    }

    //获取粉丝id
    public String getFansId(int index) {
        return String.valueOf(FansUser.get(index).getUser_id());
    }

    //获取贴子数
    public int getPostNum() {
        return this.Post.size();
    }

    //获取贴吧id
    public String getBarId(int index) {
        bar oneBar =((bar)((Object[])Post.get(index))[1]);
        return String.valueOf(oneBar.getBar_id());
    }

    //获取贴吧名字
    public String getMyBarName(int index) {
        bar oneBar =((bar)((Object[])Post.get(index))[1]);
        return oneBar.getBar_name();
    }

    //获取帖子id
    public String getPostId(int index) {
        post onePost =((post)((Object[])Post.get(index))[0]);
        return String.valueOf(onePost.getPost_id());
    }

    //获取帖子名
    public String getPostName(int index) {
        post onePost =((post)((Object[])Post.get(index))[0]);
        return onePost.getPost_name();
    }

    //获取回复数
    public String getReplyNum(String post_id) {
        return UserModule.getReplyNum(post_id);
    }

    //获取发帖日期
    public String getPostDate(int index) {
        post onePost =((post)((Object[])Post.get(index))[0]);
        return String.valueOf(onePost.getPost_date());
    }

    //获取回帖数量
    public int getReplyNum() {
        return Reply.size();
    }

    //获取回帖吧id
    public String getReplyBarId(int index) {
        bar oneBar =((bar)((Object[])Reply.get(index))[1]);
        return String.valueOf(oneBar.getBar_id());
    }
    //获取回帖吧名

    public String getReplyBarName(int index) {
        bar oneBar =((bar)((Object[])Reply.get(index))[1]);
        return oneBar.getBar_name();
    }
    //获取回帖id

    public String getReplyPostId(int index) {
        reply oneReply =((reply)((Object[])Reply.get(index))[0]);
        return String.valueOf(oneReply.getPost_id());
    }
    //获取回帖消息

    public String getReplyMsg(int index) {
        reply oneReply =((reply)((Object[])Reply.get(index))[0]);
        return oneReply.getReply_msg();
    }
    //获取回帖回帖数量

    public String getReplyReplyNum(int index) {
        reply oneReply =((reply)((Object[])Reply.get(index))[0]);
        return UserModule.getReplyNum(String.valueOf(oneReply.getPost_id()));
    }
    //获取回帖日期

    public String getReplyDate(int index) {
        reply oneReply =((reply)((Object[])Reply.get(index))[0]);
        return String.valueOf(oneReply.getReply_date());
    }

    //获取消息数量
    public int getMsgNum() {
        return this.Msg.size();
    }
    //获取消息id

    public String getMsgId(int index) {
        return String.valueOf(Msg.get(index).getMsg_id());
    }
    //获取消息内容

    public String getMsgMsg(int index) {
        return Msg.get(index).getMsg();
    }
    //获取附加消息

    public String getMsgAdd(int index) {
        return Msg.get(index).getAdd_msg();
    }
    //获取消息类型

    public String getMsgType(int index) {
        return Msg.get(index).getType();
    }
    //获取发信人id

    public String getMsgSenderId(int index) {
        return String.valueOf(Msg.get(index).getSender_id());
    }
    //获取发信人名

    public String getSenderName(int index) {
        return UserModule.getUserInfo(getMsgSenderId(index));
    }
    public String getMsgReaderId(int index){
        return String.valueOf(Msg.get(index).getReader_id());
    }
    //获取消息时间

    public String getMsgDate(int index) {
        return String.valueOf(Msg.get(index).getMsg_date());
    }
    //检查是否已经关注某人

    public boolean checkStarUser(String my_id) {
        try {
            if (UserModule.checkStarUser(my_id, this.user_id).equals("1")) {
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            return false;
        }
    }
    //获取某一个贴吧名字

    public String getBarName1(String bar_id) {
        return BarModule.getBarName1(bar_id);
    }
}
