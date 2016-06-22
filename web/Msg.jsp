<%@ page import="com.Control.MsgCtrl"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN"> 
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>私信</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/message.css">
	<style type="text/css">
		body{
			padding-top: 50px;
		}
	</style>

	<script language="javascript">
		function login(){
			window.location.href="Login.jsp";
		}
		function Register(){
			window.location.href="Register.jsp";
		}
	</script>
	<!-- 数据准备 -->
	<%
		String user_id =(String)request.getAttribute( "user_id");
		String msg_id =(String)request.getAttribute( "msg_id");
		String UserName = "";
		Cookie[] cook =request.getCookies();//用一个Cookie数组来接收
		if(cook != null){
			for(int j=0;j<cook.length;j++){	//通过循环来打印Cookie  
				if(cook[j].getName().equals("name"))	//取cookie的名 
					UserName = cook[j].getValue();	//取cookie的值  
			}
		}
		MsgCtrl msgCtrl = new MsgCtrl(user_id);
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
					<form class="navbar-form navbar-left" role="search">
						<div class="form-group">
							<span class="glyphicon glyphicon-search" style="color: rgb(157,157,157);"></span>
							<input type="text" class="form-control" placeholder="Search"></input>
						</div>
						<button type="submit" class="btn btn-primary">搜索私密圈</button>
					</form>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav navbar-right">
							<%
						if(UserName.equals("")||UserName.length() == 0)
							out.print("<li>"
							+"	<form action = 'login' class='navbar-form'>"
							+"		<button onClick='login()' href='Login.jsp' type='button' class='btn ' data-toggle='modal' data-target='#myModal'>登录</button>"
							+"	</form>"
							+"</li>"
							+"<li><a href='Register.jsp' onClick='Register()'>注册</a></li>");
						else{
							out.print("<li class='dropdown'>"
									+"	<a href='#' class='dropdown-toggle' data-toggle='dropdown'>" + UserName + "<span class='caret'></span></a>"
									+"	<ul class='dropdown-menu' role='menu' aria-labelledby='dropdownMenu1'>"
									+"		<li><a href='user?user_id=" + msgCtrl.getUserId(UserName) + "'>用户中心</a></li>"
									+"		<li><a href='logout'>注销</a></li>"
									+"		<li role='separator' class='divider'></li>"
									+"	</ul>"
									+"</li>");
						}
					%>
						</ul>
					</div><!-- /.navbar-collapse -->					
				</div><!-- /.navbar-collapse -->				
			</div><!-- /.container -->
		</nav><!--导航条结束-->
	</div>


	<div class="container">
		<div class="content col-md-4 col-md-push-4 col-xs-12 col-sm-12">
		<%
			out.print("<br><label>To " + "Secret" + ":</label> ");
			out.print("<form role='message' action = 'msg.do' method = 'post'>");
			out.print("<div style='margin-top: 10px;''>");
			out.print("<input type='text' name = 'user_id' style='display:none' value ="+user_id+" >");

			if(msg_id!=null){
				out.print("<input type='text' name = 'msg_id' style='display:none' value ="+msg_id+" >");
			}
			out.print("<textarea name='msg' class='form-control' rows='6' placeholder='想说点什么'></textarea>");
			out.print("</div>");
			out.print("<button type='submit' class='btn btn-primary' style='margin-top: 10px'>发送</button>");
			out.print("</form>");
			%>
			<!--<h2>想对<input type="text" class="form-control" style="display: inline;width: 200px;margin:0 10px;" placeholder="……">说</h2>
			<hr>

			
			<div style="margin-top: 10px;" class="input-group">
				<input type="text" class="form-control" placeholder="想说些什么">
				<span class="input-group-btn">
				<button type="submit" class="btn btn-primary">发送</button>
				</span>
			</div><!-- /input-group -->
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