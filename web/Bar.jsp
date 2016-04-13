<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="com.Control.BarCtrl"%>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1">

	<title>首页</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/bootstrap.theme.min.css">
	<link rel="stylesheet" type="text/css" href="css/index.css">
	<style type="text/css">
		body{
			padding-top: 50px;
		}
	</style>

	<!-- 数据准备 -->
	<%
		String name =(String)request.getAttribute("name");
		String page_num =(String)request.getAttribute( "page");
		BarCtrl barCtrl = new BarCtrl(name,page_num);
		String UserName = "";
		Cookie[] cook =request.getCookies();//用一个Cookie数组来接收
		if(cook != null){
			for(int j=0;j<cook.length;j++){	//通过循环来打印Cookie  
				if(cook[j].getName().equals("name"))	//取cookie的名 
					UserName = cook[j].getValue();	//取cookie的值  
			}
		}
	%>

	<script language="javascript">
	//////ajax
	//1.创建对象
    var oAjax = null;
    if(window.XMLHttpRequest){
        oAjax = new XMLHttpRequest();
    }else{
        oAjax = new ActiveXObject("Microsoft.XMLHTTP");
    }
    <%
     	out.print("url='chat?bar_id=" + barCtrl.getBarId() + "'");
    %>
     function getInfo(){
	    //2.连接服务器  
	    oAjax.open('GET', url, true);   //open(方法, url, 是否异步)
	      
	    //3.发送请求  
	    oAjax.send();
	    
	  //4.接收返回
	    oAjax.onreadystatechange = function(){  //OnReadyStateChange事件
	        if(oAjax.readyState == 4){  //4为完成
	            if(oAjax.status == 200){    //200为成功
	                document.getElementById('change').innerHTML = oAjax.responseText;
	            }else{
	                if(fnFaild){
	                    fnFaild();
	                }
	            }
	        }
	    };
     }
    
    setInterval("getInfo()", 500);  
    
	</script>

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
					<a class="navbar-brand" href="#">嘀咕</a>

					<!--系统logo的图片-->
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">

					<!--表单和按钮-->
					<form class="navbar-form navbar-left" role="search" action="search.do" method="get">
						<div class="form-group">
							<span class="glyphicon glyphicon-search" style="color: rgb(157,157,157);"></span>
							<input type="text" class="form-control" placeholder="Search" name="name"></input>
					</div>
					<button type="submit" class="btn btn-primary">搜索私密圈</button>
				</form>
				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
					<ul class="nav navbar-nav navbar-right">
						<!-- <li class="dropdown">
						<a href="#" class="dropdown-toggle" data-toggle="dropdown">
							用户名
							<span class="caret"></span>
						</a>
						<ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
							<li>
								<a href="#">用户中心</a>
							</li>
							<li>
								<a href="#">注销</a>
							</li>
						</ul>
					</li>
					-->
					<%
						if(UserName.equals("")||UserName.length() == 0)
							out.print("<li>"
                                                            +"<form action = 'login.do' class='navbar-form'>"
                                                            +"<button onClick='login()' href='Login.jsp' type='button' class='btn ' data-toggle='modal' data-target='#myModal'>登录</button>"
                                                            +"</form>"
                                                            +"</li>"
                                                            +"<li><a href='Register.jsp'>注册</a></li>");
						else{
							out.print("<li class='dropdown'>"
                                                            +"<a href='#' class='dropdown-toggle' data-toggle='dropdown'>" 
                                                            + UserName 
                                                            + "<span class='caret'></span></a>"
                                                            +"<ul class='dropdown-menu' role='menu' aria-labelledby='dropdownMenu1'>"
                                                            +"<li><a href='user?user_id=" + barCtrl.getUserID1(UserName) + "'>用户中心</a></li>"
                                                            +"<li><a href='logout'>注销</a></li>"
                                                            +"<li role='separator' class='divider'></li>"
                                                            +"</ul>"
                                                            +"</li>");
						}
					%>
			</ul>
		</div>
		<!-- /.navbar-collapse -->
	</div>
	<!-- /.navbar-collapse -->
</div>
<!-- /.container -->
</nav>
<!--导航条结束-->
</div>

<div class="title" style="height: 160px;"></div>

<div class="container content clearfix">

<!--顶部导航-->
<div class="page-header">
<h1>
	<%
		out.print(barCtrl.getBarName() + "私密圈");
	%>
	<small>
		<%
			out.print(barCtrl.getBarType());
		%>
	</small>
</h1>
</div>

<!--左侧栏目-->
<div class="mainLeft">
<div class="articles">
<!-- 	<article class="mab-panel">
		<div class="mab-p-info">
			<a href="#">
				<img class="mab-p-i-avatar" src="#">
				<span class="mab-p-i-name">馄钝</span>
			</a>
			<div class="mab-p-i-time">6小时前</div>
			<div class="mab-p-gps">
				<span class="glyphicon glyphicon-map-marker"></span>
				浙江省 温州市
			</div>
		</div>
		<h1 class="mab-p-h1">
			<a class="mab-p-title" href="#">纠结</a>
		</h1>
		<div class="mab-p-content">
			<p display="block">"今天真的很纠结，为什么纠结呢，你看我敲下这篇文章的而每个字都很纠结纠结到不知道纠结怎么写了哈哈哈哈哈哈哈哈哈"</p>
		</div>
		<div class="mab-p-count">
			<a class="mab-pc-style" href="#">1000 阅读</a>
			<div class="mab-p-space"> <i class="mab-p-icon-point"></i>
			</div>
			<a class="mab-pc-style" href="#">10 评论</a>
		</div>

	</article>

	<article class="mab-panel">
		<div class="mab-p-info">
			<a href="#">
				<img class="mab-p-i-avatar" src="#">
				<span class="mab-p-i-name">馄钝</span>
			</a>
			<div class="mab-p-i-time">6小时前</div>
			<div class="mab-p-gps">
				<span class="glyphicon glyphicon-map-marker"></span>
				浙江省 温州市
			</div>
		</div>
		<h1 class="mab-p-h1">
			<a class="mab-p-title" href="#">纠结</a>
		</h1>
		<div class="mab-p-content">
			<p display="block">"今天真的很纠结，为什么纠结呢，你看我敲下这篇文章的而每个字都很纠结纠结到不知道纠结怎么写了哈哈哈哈哈哈哈哈哈"</p>
		</div>
		<div class="mab-p-count">
			<a class="mab-pc-style" href="#">1000 阅读</a>
			<div class="mab-p-space"> <i class="mab-p-icon-point"></i>
			</div>
			<a class="mab-pc-style" href="#">10 评论</a>
		</div>

	</article>

	<article class="mab-panel">
		<div class="mab-p-info">
			<a href="#">
				<img class="mab-p-i-avatar" src="#">
				<span class="mab-p-i-name">馄钝</span>
			</a>
			<div class="mab-p-i-time">6小时前</div>
			<div class="mab-p-gps">
				<span class="glyphicon glyphicon-map-marker"></span>
				浙江省 温州市
			</div>
		</div>
		<h1 class="mab-p-h1">
			<a class="mab-p-title" href="#">纠结</a>
		</h1>
		<div class="mab-p-content">
			<p display="block">"今天真的很纠结，为什么纠结呢，你看我敲下这篇文章的而每个字都很纠结纠结到不知道纠结怎么写了哈哈哈哈哈哈哈哈哈"</p>
		</div>
		<div class="mab-p-count">
			<a class="mab-pc-style" href="#">1000 阅读</a>
			<div class="mab-p-space">
				<i class="mab-p-icon-point"></i>
			</div>
			<a class="mab-pc-style" href="#">10 评论</a>
		</div>

	</article> -->
	<%
		int postNum = barCtrl.getPostNum();
		String replyId = "";
		for(int i = 0; i < postNum ; i ++){
			//判断是否不存在回帖
			if(barCtrl.getLastId(i).equals("0")){
				replyId = barCtrl.getPosterId(i);
			}
			else replyId = barCtrl.getLastId(i);  
			out.print("<article class='mab-panel'>"
                                        +"<div class='mab-p-info'>"
                                            +"<a href='user?user_id=" + barCtrl.getPosterId(i) + "'>"
                                                +"<img class='mab-p-i-avatar' src='#'>"
                                            +"<span class='mab-p-i-name'>" + barCtrl.getUserName((barCtrl.getPosterId(i))) + "</span>"
                                            +"</a>"
                                            +"<div class='mab-p-i-time'>6小时前</div>"
                                            +"<div class='mab-p-gps'>"
                                                +"<span class='glyphicon glyphicon-map-marker'></span>"
                                                +"浙江省 温州市"
                                            +"</div>"
                                        +"</div>"
                                        +"<h1 class='mab-p-h1'>"
                                            +"<a class='mab-p-title' href='post.do?post_id=" + barCtrl.getPostId(i) + "&page=1'>" + barCtrl.getPostName(i) + "</a>"
                                        +"</h1>"
                                        +"<div class='mab-p-content'>"
                                            +"<p display='block'>" + barCtrl.getPostMsg(i) + "</p>"
                                        +"</div>"
                                        +"<div class='mab-p-count'>"
                                            +"<a class='mab-pc-style' href='#'>1000 阅读</a>"
                                            +"<div class='mab-p-space'>"
                                                +"<i class='mab-p-icon-point'></i>"
                                            +"</div>"
                                            +"<a class='mab-pc-style' href='#'>10 评论</a>"
                                        +"</div>"
                                    +"</article>"
							/*+	"</div>"
							+	"<div class='col-md-2 col-sm-2 col-xs-2'>"
							+		"<span style='color:gray'>" + barCtrl.getLastDate(i) + "</span>"		//输出最后回复时间
							+	"</div>"
							+"</div>"
						+"</div>" -*/
						);
			}
			%>
</div>

<div>
	<nav class="col-md-12">
		<ul class="pagination">
			<li class="disabled">
				<a href="#" aria-label="Previous">
					<span aria-hidden="true">&laquo;</span>
				</a>
			</li>
			<li class="active">
				<a href="#">
					1
					<span class="sr-only">(current)</span>
				</a>
			</li>
			<li>
				<a href="#">
					2
					<span class="sr-only"></span>
				</a>
			</li>
			<li>
				<a href="#">
					3
					<span class="sr-only"></span>
				</a>
			</li>
			<li>
				<a href="#">
					4
					<span class="sr-only"></span>
				</a>
			</li>
			<li>
				<a href="#" aria-label="Next">
					<span aria-hidden="true">&laquo;</span>
				</a>
			</li>
		</ul>
	</nav>
</div>

<div style="padding-top: 100px;">
<%
				if(UserName.equals("")||UserName.length() == 0){
					out.print("<div class='col-md-9 col-sm-9 col-xs-9'>");
					out.print("<label><span class='glyphicon glyphicon-pencil'></span>发帖请先登录</label>");
					out.print("</div>");
				}
				else{
					out.print("<form role='posting' action = 'posting.do' method = 'post'>"
							+"<div class='well'>"
                                                            +"<label>"
                                                                +"<span class='glyphicon glyphicon-pencil'></span>"
                                                                +"发表新帖"
                                                            +"</label>"
                                                            +"<div>"
								+"<input type='text' name = 'bar_id' style='display:none' value ="+barCtrl.getBarId()+" >"
								+"<input type='text' class='form-control fc' id='inputTitle' placeholder='填写标题' name='post_name'>"
                                                            +"</div>"
                                                            +"<div style='margin-top: 10px;'>"
								+"<textarea class='form-control fc' rows='6' placeholder='说点什么……' name='post_msg'></textarea>"
                                                            +"</div>"
                                                            +"<button type='submit' class='btn btn-primary' style='margin-top: 10px'>发表</button>"
							+"</div>"
                                                    +"</form>");					
				}
			%>
<!-- <form>
	<div class="well">
		<label>
			<span class="glyphicon glyphicon-pencil"></span>
			发表新帖
		</label>
		<div>
			<input type="text" class="form-control fc" id="inputTitle" placeholder="填写标题" name=""></div>
		<div style="margin-top: 10px;">
			<textarea class="form-control fc" rows="6" placeholder="说点什么……"></textarea>
		</div>
		<button type="button" class="btn btn-primary" style="margin-top: 10px">发表</button>
	</div>
</form> -->
</div>
</div>
<!--mainLeft-->

<div class="asidePanel fl">
<div class="aside" hidden>
	<span class="glyphicon glyphicon-comment"></span>
	<label>聊天室</label>
	<div style="margin-top: 10px;height: 300px; border-top: 1px solid #777" class="pre-scrollable">
		<!--聊天内容框-->

		<div style="margin:10px 0;">
			<a href="#">XXX说：</a>
			&nbsp;&nbsp;
			<span>今天天气真好</span>
		</div>
		<div style="margin:10px 0;">
			<a href="#">XXX说：</a>
			&nbsp;&nbsp;
			<span>今天天气真好</span>
		</div>
		<div style="margin:10px 0;">
			<a href="#">XXX说：</a>
			&nbsp;&nbsp;
			<span>今天天气真好</span>
		</div>
		<div style="margin:10px 0;">
			<a href="#">XXX说：</a>
			&nbsp;&nbsp;
			<span>今天天气真好</span>
		</div>
		<div style="margin:10px 0;">
			<a href="#">XXX说：</a>
			&nbsp;&nbsp;
			<span>今天天气真好</span>
		</div>
		<div style="margin:10px 0;">
			<a href="#">XXX说：</a>
			&nbsp;&nbsp;
			<span>今天天气真好</span>
		</div>
	</div>
	<%-- 
		//如果没登陆就不输出
		if(!(UserName.equals("")||UserName.length() == 0)){
			out.print("<div style='margin-top: 10px;height: 300px; border-top: 1px solid #777' class='pre-scrollable'>"
					+"<div style='margin:10px 0;'>"
                                            +<div style="margin:10px 0;">"
							<a href='#''>XXX说：</a>
							&nbsp;&nbsp;
							<span>今天天气真好</span>
						</div>");
			out.print("<form role='chating' action = 'chating.do' method = 'post'>");
			out.print("<input type='text' name = 'bar_id' style='display:none' value ="+barCtrl.getBarId()+" >" );
			out.print("<input name='msg' type='text' class='form-control' placeholder='说点什么'>");
			out.print("<span class='input-group-btn'>");
			out.print("<button class='btn btn-info' type='submit'>发送</button>");
			out.print("</span>");
			out.print("</form>");
			out.print("</div><!-- /input-group ");
		}
	--%>
	<div style="margin-top: 10px;" class="input-group">
		<input type="text" class="form-control" placeholder="说点什么">
		<span class="input-group-btn">
			<button class="btn btn-primary" type="button">发送</button>
		</span>
	</div>
	<!-- /input-group -->
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