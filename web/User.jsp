<%@page import="com.Control.UserCtrl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN"> 
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>个人中心</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/user_center.css">
	<style type="text/css">
		body{
			padding-top: 50px;
		}
		
	</style>

	<!-- 数据准备 -->
        <%
            String user_id = (String) request.getAttribute("user_id");

            String UserName = "";
            Cookie[] cook = request.getCookies();//用一个Cookie数组来接收
            if (cook != null) {
                for (int j = 0; j < cook.length; j++) {	//通过循环来打印Cookie  
                    if (cook[j].getName().equals("name")) //取cookie的名 
                    {
                        UserName = cook[j].getValue();	//取cookie的值  
                    }
                }
            }
            UserCtrl userCtrl = new UserCtrl(UserName, user_id);
        %>

</head>

<body>
	<div class="container">
		<!--导航条-->
		<nav class="navbar navbar-default navbar-fixed-top navbar-inverse">
			<div class="container">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
					<button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
						<span class="sr-only">Toggle navigation</span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
						<span class="icon-bar"></span>
					</button>

					<img class="navbar-brand" src="img/logo.png" style="height: 50px;width: 50px;">
					<a class="navbar-brand" href="#">
						嘀咕
					</a>

					<!--系统logo的图片-->
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

					<!--表单和按钮-->
					<form class="navbar-form navbar-left" role="search" action = 'search.do'>
						<div class="form-group">
							<span class="glyphicon glyphicon-search" style="color: rgb(157,157,157);"></span>
							<input type="text" name="name" class="form-control" placeholder="Search"></input>
						</div>
						<button type="submit" class="btn btn-primary">搜索私密圈</button>
					</form>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-right">
							<%
                            if (UserName.equals("") || UserName.length() == 0) {
                                out.print("<li>"
                                        + "	<form action = 'login' class='navbar-form'>"
                                        + "		<button onClick='login()' href='Login.jsp' type='button' class='btn ' data-toggle='modal' data-target='#myModal'>登录</button>"
                                        + "	</form>"
                                        + "</li>"
                                        + "<li><a href='Register.jsp' onClick='Register()'>注册</a></li>");
                            } else {
                                out.print("<li class='dropdown'>"
                                        + "	<a href='#' class='dropdown-toggle' data-toggle='dropdown'>" + UserName + "<span class='caret'></span></a>"
                                        + "	<ul class='dropdown-menu' role='menu' aria-labelledby='dropdownMenu1'>"
                                        + "		<li><a href='user.do?user_id=" + userCtrl.getUserId(UserName) + "'>用户中心</a></li>"
                                        + "		<li><a href='logout'>注销</a></li>"
                                        + "		<li role='separator' class='divider'></li>"
                                        + "	</ul>"
                                        + "</li>");
                            }
                        %>
						</ul>
					</div><!-- /.navbar-collapse -->					
				</div><!-- /.navbar-collapse -->				
			</div><!-- /.container -->
		</nav><!--导航条结束-->
	</div>
	
	<!--标题头图片-->
	<div class="title" style="height: 160px;"></div>

	<div class="container content clearfix">
		<!--顶部导航-->
		<div class="page-header">
			<h1><%
                    out.print(userCtrl.getUserName());
                %>
			</h1>
		</div>

		<!--吧内主体-->
		<!--左侧导航条-->
		<div class="mainLeft col-md-3 col-sm-3 col-xs-3">
			<ul class="nav nav-pills nav-stacked">
				<li role="presentation" class="active"><a href="#tab1"  data-toggle="tab">我的关注</a></li>
				<li role="presentation"><a href="#tab2"  data-toggle="tab">我的嘀咕</a></li>
				<li role="presentation"><a href="#tab3"  data-toggle="tab">我的回复</a></li>
				<li role='presentation'><a href='#tab4'  data-toggle='tab'>我的私信</a></li>
                <li role="presentation"><a href="#tab5"  data-toggle="tab">发送微信</a></li>
			</ul>
		</div>

		<div class="asidePanel fl col-md-9 col-sm-9 col-xs-9">
			<div class="tab-content">
				<div id="tab1" class="tab-pane fade in active">
					<div class="panel panel-default">
						<div class="panel-body">
							<p><strong>关注的私密圈</strong></p>
							<div class="row">
                                <%
                                    for (int i = 0; i < userCtrl.getBarNum(); i++) {
                                        out.print("<tr>");
                                        for (int j = 0; j < 4; j++, i++) {
                                            if (i >= userCtrl.getBarNum()) {
                                                break;
                                            }
                                            out.print("<div class='col-md-3 col-sm-3'>");
                                            out.print("<a href = search.do?name=" + userCtrl.getBarName(i) + "&page=1>" + userCtrl.getBarName(i) + "(" + userCtrl.getSignNum(userCtrl.getBarId(i)) + ")" + "</a>");
                                            out.print("</div>");
                                        }
                                    }
                                %>
							</div>
						</div>
					</div>
				</div>
				
				<div id="tab2" class="tab-pane fade">
					<div class="pane pane-default">
						<div class="pane-body">
							<div class="panel panel-default">
								<div class="panel-body">
									<p><strong>我的嘀咕</strong></p>
									<%
                                    for (int i = 0; i < userCtrl.getPostNum(); i++) {
                                        out.print("<div class='row'>");
                                        out.print("<div class='mab-p-content'>");
                                        out.print("在&nbsp;&nbsp;<a href='bar.do?bar_id=" + userCtrl.getBarId(i) + "'>"
                                                + userCtrl.getMyBarName(i) + "私密圈" + "</a>&nbsp;&nbsp;发布嘀咕&nbsp;&nbsp;<a href='post.do?post_id=" + userCtrl.getPostId(i) + "'>" + userCtrl.getPostName(i)
                                                + "</a>&nbsp;&nbsp;回复（<span>" + userCtrl.getReplyNum(userCtrl.getPostId(i)) + "</span>");
                                        out.print("</div>");
                                        out.print("<div class='mab-p-i-time'>");
                                        out.print("time: " + userCtrl.getPostDate(i) );
                                        out.print("</div>");
                                        out.print("</div>");
                                    }

                                %>
								</div>
							</div>	
						</div>
					</div>
				</div>
				<div id="tab3" class="tab-pane fade">
					<div class="pane pane-default">
						<div class="pane-body">
							<div class="panel panel-default">
								<div class="panel-body">
									<p><strong>我的回复</strong></p>
									<%                                                        
									for (int i = 0; i < userCtrl.getReplyNum(); i++) {
                                        out.print("<div class='row'>");
                                        out.print("<div class='mab-p-content'>");
                                        out.print("<p>在&nbsp;&nbsp;<a href='bar.do?bar_id=" + userCtrl.getReplyBarId(i) + "'>"
                                                + userCtrl.getReplyBarName(i) + "吧" + "</a>&nbsp;&nbsp;发布嘀咕&nbsp;&nbsp;<a href='post.do?post_id=" + userCtrl.getReplyPostId(i) + "'>" + userCtrl.getReplyMsg(i)
                                                + "</a>&nbsp;&nbsp;回复（<span>" + userCtrl.getReplyReplyNum(i) + "</span>）</p>");
                                        out.print("</div>");
                                        out.print("<div class='mab-p-i-time'>");
                                        out.print("time: " + userCtrl.getReplyDate(i));
                                        out.print("</div>");
                                        out.print("</div>");
                                    }
                                %>
								</div>
							</div>
						</div>
					</div>
				</div>
				<!-- 我的私信 -->
                <div id="tab4" class="tab-pane fade">
                    <div class="pane pane-default">
                    <div class="panel panel-default">
                        <div class="pane-body">
                        	<p><strong>我的私信</strong></p>
                                <%
                                    for (int i = 0; i < userCtrl.getMsgNum(); i++) {
                                        out.print("<div class='row'>");
                                        out.print("<div class='mab-p-content'>");
                                        if (!userCtrl.getUserName1(userCtrl.getMsgSenderId(i)).equals(UserName) ) {
                                            out.print("<p>&nbsp;&nbsp;<a href='msg.do?msg_id=" + userCtrl.getMsgId(i) + "&user_id=" + userCtrl.getMsgSenderId(i) + "'>"
                                                    + "Secret" + "</a>&nbsp;&nbsp;对你说&nbsp;&nbsp;<a href='msg.do?msg_id=" + userCtrl.getMsgId(i) + "&user_id=" + userCtrl.getMsgSenderId(i) + "'>" + userCtrl.getMsgMsg(i)
                                                    + "</a></p>");
                                        } else {
                                            out.print("<p>你对&nbsp;&nbsp;<a href='msg.do?msg_id=" + userCtrl.getMsgId(i) + "&user_id=" + userCtrl.getMsgReaderId(i) + "'>"
                                                    + "Secret" + "</a>&nbsp;&nbsp;说&nbsp;&nbsp;<a href='msg.do?msg_id=" + userCtrl.getMsgId(i) + "&user_id=" + userCtrl.getMsgSenderId(i) + "'>" + userCtrl.getMsgMsg(i)
                                                    + "</a></p>");
                                        }
                                        out.print("</div>");
                                        out.print("<div class='mab-p-i-time'>");
                                        out.print("time: " + userCtrl.getMsgDate(i));
                                        out.print("</div>");
                                        out.print("</div>");
                                    }
                                %>
                        </div>
                    </div>
                </div>
                </div>
                <div id="tab5" class="tab-pane fade">
                    <div class="panel pane-default">
                        <div class="pane-body">
                        <p><strong>发送私信</strong></p>
                            <form role='message' action = 'msg.do' method = 'post'>
                                <div style='margin-top: 10px;'>
                                    目标用户名:<input class="form-control" type='text' name = 'user_name' placeholder="请输入想要发送的用户名">
                                    <textarea name='msg' class='form-control' rows='6' style="width:90%"></textarea>
                                </div>
                                <button type='submit' class='btn btn-primary' style='margin-top: 10px'>发送</button>
                            </form>
                    </div>
                    </div>
                </div>
			</div>
		</div>
	</div>
</div>



	<!--页尾-->
	<footer class="col-md-12 footer-log">
		<div class="text-center">
			© 2016 天天组
			<a href="#">联系我们</a>
			<a href="#" target="_blank">QQ交流:1340212468</a>
			<a href="#" target="_blank">意见反馈</a>
			
		</div>
	</footer>

	<!--这里的顺序不能打乱，不然下拉菜单不显示-->
	<script src="js/bootstrap.js" type="text/javascript"></script>
	<script src="js/jquery-2.1.1.min.js"></script>
	<script src="js/jquery-2.1.1.js"></script>
	<script src="js/bootstrap.min.js" type="text/javascript"></script>
	<script src="js/npm.js" type="text/javascript"></script>
</body>
</html>