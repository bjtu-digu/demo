<%@page import="com.Control.AdminCtrl"%>
<%@page import="com.Control.UserCtrl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN"> 
<head>
	${alert}
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>后台管理</title>
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
            //获取用户数据
            AdminCtrl admin = new AdminCtrl();

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
				</div><!-- /.navbar-collapse -->				
			</div><!-- /.container -->
		</nav><!--导航条结束-->
	</div>
	
	<!--标题头图片-->
	<div class="title" style="height: 160px;"></div>

	<div class="container content clearfix">
		<!--顶部导航-->
		<div class="page-header">
			<h1>
			</h1>
		</div>

		<!--吧内主体-->
		<!--左侧导航条-->
		<div class="mainLeft col-md-3 col-sm-3 col-xs-3">
			<ul class="nav nav-pills nav-stacked">
				<li role="presentation" class="active"><a href="#tab1"  data-toggle="tab">我的用户管理关注</a></li>
				<li role="presentation"><a href="#tab2"  data-toggle="tab">私密圈管理</a></li>
				<li role="presentation"><a href="#tab3"  data-toggle="tab">帖子管理</a></li>
				<li role='presentation'><a href='#tab4'  data-toggle='tab'>回复管理</a></li>
			</ul>
		</div>

		<div class="asidePanel fl col-md-9 col-sm-9 col-xs-9">
			<div class="tab-content">
				<div id="tab1" class="tab-pane fade in active">
					<div class="panel panel-default">
						<div class="panel-body">
							<p><strong>用户管理</strong></p>
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
                                        
                                        out.print("<div class='row'>");
                                        out.print("<div class='mab-p-content'>");
                                        out.println(ID);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(name);
                                        out.println("&nbsp;&nbsp;");
                                        out.println("<a href='operator.do?target=1&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("&nbsp;&nbsp;");
                                        out.println("<a href='specialLogin.do?username=" + name + "'>以此账号登陆</a>");
                                        out.println("</div>");
                                        out.println("</div>");
                                    }
                                %>
						</div>
					</div>
				</div>
				
				<div id="tab2" class="tab-pane fade">
					<div class="pane pane-default">
						<div class="pane-body">
							<div class="panel panel-default">
								<div class="panel-body">
									<p><strong>私密圈管理</strong></p>
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

                                        out.print("<div class='row'>");
                                        out.print("<div class='mab-p-content'>");
                                        out.println(ID);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(name);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(topic);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(time);
                                        out.println("&nbsp;&nbsp;");
                                        out.println("<a href='operator.do?target=2&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("</div>");
                                        out.println("</div>");
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
									<p><strong>帖子管理</strong></p>
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

                                        out.print("<div class='row'>");
                                        out.print("<div class='mab-p-content'>");
                                        out.println(ID);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(name);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(msg);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(userName);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(time);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(bar);
                                        out.println("&nbsp;&nbsp;");
                                        out.println("<a href='operator.do?target=3&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("</div>");
                                        out.println("</div>");
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
                        	<p><strong>回复管理</strong></p>
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

                                        out.print("<div class='row'>");
                                        out.print("<div class='mab-p-content'>");
                                        out.println(ID);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(msg);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(userName);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(time);
                                        out.println("&nbsp;&nbsp;");
                                        out.println(post);
                                        out.println("&nbsp;&nbsp;");
                                        out.println("<a href='operator.do?target=4&ID=" + ID + "&status=" + status + "'>" + operator + "</a>");
                                        out.println("</div>");
                                        out.println("</div>");
                                    }
                                %>
                        </div>
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