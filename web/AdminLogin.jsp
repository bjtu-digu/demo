<%-- 
    Document   : AdminLogin
    Created on : 2016-5-16, 9:08:45
    Author     : zxq
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zh-CN"> 
<head>
	${alert}
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>管理员登录</title>
	
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/register.css">
	<style type="text/css">
		body{
			padding-top: 50px;
		}
	</style>

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
			</div><!-- /.container -->
		</nav><!--导航条结束-->

		<div class="row">
			<div class="col-md-6 col-md-push-3 col-xs-12 col-sm-12">
				<div class="panel panel-group" style="margin-top: 120px;">		

					<h3 class="panel-title" style="font-size: 2.4em;padding: 25px 50px 10px;text-shadow: 0 1px 2px rgba(0, 0, 0, 0.1);">
						
						登录
					</h3>

					<div class="panel-body">
						<form class="form-horizontal" action = "adminLogin.do" method = "post">
							<div class="form-group fg">
								<div class="col-xs-12">
									<div class="input-group">
										<span class="input-group-addon">
											<span class="glyphicon glyphicon-phone"></span>
										</span> 
										<input type="text" id="login-mobile" name="name" class="form-control" placeholder="请输入用户名">
									</div>
									<small id="hint1"></small>
								</div>
							</div>
							
							<div class="form-group fg" >
								<div class="col-xs-12">
									<div class="input-group">
										<span class="input-group-addon">
											<span class="glyphicon glyphicon-inbox"></span>
										</span> 
										<input type="password" id="login-password" name="pass" class="form-control" placeholder="请输入密码">
									</div>
									<small id="hint2"></small>
								</div>
							</div>
							
							<div class="">
								<button type="submit" class="btn btn-primary btn-lg col-md-10 col-md-push-1 col-sm-12 col-xs-12">登录</button>
							</div>
						</form>
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
			<a href="#" target="_blank">QQ交流群:77590762</a>
			<a href="#" target="_blank">意见反馈</a>
			<script type="text/javascript">
				var cnzz_protocol = (("https:" == document.location.protocol) ? " https://"
						: " http://");
				document
						.write(unescape("%3Cspan id='cnzz_stat_icon_1253509620'%3E%3C/span%3E%3Cscript src='"
								+ cnzz_protocol
								+ "s23.cnzz.com/z_stat.php%3Fid%3D1253509620%26show%3Dpic' type='text/javascript'%3E%3C/script%3E"));
			</script>
			<!--站长统计代码-->
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

