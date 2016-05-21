<%-- 
    Document   : Admin
    Created on : 2016-5-16, 8:38:01
    Author     : zxq
--%>

<%@page import="com.Control.AdminCtrl"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        ${alert}
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <style type="text/css">
            body{
                padding-top: 50px;
            }
        </style>
        <title>后台管理</title>
        <%
            //获取用户数据
            AdminCtrl admin = new AdminCtrl();

        %>
    </head>
    <body>
        <div class="container">
            <ul class="nav nav-tabs">
                <li role="presentation" class="active"><a href="#tab1"  data-toggle="tab">用户管理</a></li>
                <li role="presentation"><a href="#tab2"  data-toggle="tab">私密圈管理</a></li>
                <li role="presentation"><a href="#tab3"  data-toggle="tab">帖子管理</a></li>
                <li role="presentation"><a href="#tab4"  data-toggle="tab">回复管理</a></li>
            </ul>
            <div class="tab-content">
                <div id="tab1" class="tab-pane fade in active">
                    <div class="pane pane-default">
                        <div class="pane-body">
                            <table>
                                <tr>
                                    <th>用户Id</th>
                                    <th>用户名</th>
                                    <th>操作</th>
                                    <th>特殊登录</th>
                                </tr>
                                <%                                    
                                    int userNum = admin.getUsersNum();
                                    for (int i = 0; i < userNum; i++) {
                                        int ID = admin.getUserId(i);
                                        String name = admin.getUserName(i);
                                        int status = admin.getUserStatus(i);
                                        String operator;
                                        if (status == 1) {
                                            operator = "封停";
                                            status = 0;
                                        } else {
                                            operator = "解封";
                                            status = 1;
                                        }

                                        out.println("<tr>");
                                        out.println("<td>");
                                        out.println(ID);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(name);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println("<a href='operator.do?target=1&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println("<a href='specialLogin.do?username=" + name + "'>以此账号登陆</a>");
                                        out.println("</td>");
                                    }
                                %>
                            </table>
                        </div>
                    </div>
                </div>
                <div id="tab2" class="tab-pane fade">
                    <div class="pane pane-default">
                        <div class="pane-body">
                            <table>
                                <tr>
                                    <th>私密圈id</th>
                                    <th>私密圈名字</th>
                                    <th>私密圈主题</th>
                                    <th>创建时间</th>
                                    <th>操作</th>
                                </tr>
                                <%                                    
                                    int barNum = admin.getBarNum();
                                    for (int i = 0; i < barNum; i++) {
                                        int ID = admin.getBarId(i);
                                        String name = admin.getBarName(i);
                                        String topic = admin.getBarTopic(i);
                                        String time = admin.getBarCreateTime(i);
                                        int status = admin.getBarStatus(i);
                                        String operator;
                                        if (status == 1) {
                                            operator = "封停";
                                            status = 0;
                                        } else {
                                            operator = "解封";
                                            status = 1;
                                        }

                                        out.println("<tr>");
                                        out.println("<td>");
                                        out.println(ID);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(name);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(topic);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(time);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println("<a href='operator.do?target=2&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("</td>");
                                    }
                                %>
                            </table>
                        </div>
                    </div>
                </div>
                <div id="tab3" class="tab-pane fade">
                    <div class="pane pane-default">
                        <div class="pane-body">
                            <table>
                                <tr>
                                    <th>嘀咕id</th>
                                    <th>嘀咕标题</th>
                                    <th>嘀咕内容</th>
                                    <th>发表人</th>
                                    <th>发表时间</th>
                                    <th>所属私密圈</th>
                                    <th>操作</th>
                                </tr>
                                <%                                    
                                    int postNum = admin.getPostNum();
                                    for (int i = 0; i < postNum; i++) {
                                        int ID = admin.getPostId(i);
                                        String name = admin.getPostName(i);
                                        String msg = admin.getPostMsg(i);
                                        String userName = admin.getPostUserName(i);
                                        String time = admin.getPostCreateTime(i);
                                        String bar = admin.getOwnBarName(i);
                                        int status = admin.getPostStatus(i);
                                        String operator;
                                        if (status == 1) {
                                            operator = "封停";
                                            status = 0;
                                        } else {
                                            operator = "解封";
                                            status = 1;
                                        }

                                        out.println("<tr>");
                                        out.println("<td>");
                                        out.println(ID);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(name);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(msg);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(userName);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(time);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(bar);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println("<a href='operator.do?target=3&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("</td>");
                                    }
                                %>
                            </table>
                        </div>
                    </div>
                </div>
                <div id="tab4" class="tab-pane fade">
                    <div class="pane pane-default">
                        <div class="pane-body">
                            <table>
                                <tr>
                                    <th>回复id</th>
                                    <th>回复内容</th>
                                    <th>回复人</th>
                                    <th>回复时间</th>
                                    <th>回复的嘀咕</th>
                                    <th>操作</th>
                                </tr>
                                <%                                    
                                    int replyNum = admin.getReplyNum();
                                    for (int i = 0; i < replyNum; i++) {
                                        int ID = admin.getReplyId(i);
                                        String msg = admin.getReplyMsg(i);
                                        String userName = admin.getReplyUserName(i);
                                        String time = admin.getReplyCreateTime(i);
                                        String post = admin.getOwnPost(i);
                                        int status = admin.getReplyStatus(i);
                                        String operator;
                                        if (status == 1) {
                                            operator = "封停";
                                            status = 0;
                                        } else {
                                            operator = "解封";
                                            status = 1;
                                        }

                                        out.println("<tr>");
                                        out.println("<td>");
                                        out.println(ID);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(msg);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(userName);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(time);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println(post);
                                        out.println("</td>");
                                        out.println("<td>");
                                        out.println("<a href='operator.do?target=4&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("</td>");
                                    }
                                %>
                            </table>
                        </div>
                    </div>
                </div>
            </div>

    </body>

    <script src="js/bootstrap.js" type="text/javascript"></script>
    <script src="js/jquery-2.1.1.min.js"></script>
    <script src="js/jquery-2.1.1.js"></script>
    <script src="js/bootstrap.min.js" type="text/javascript"></script>
    <script src="js/npm.js" type="text/javascript"></script>
</html>
