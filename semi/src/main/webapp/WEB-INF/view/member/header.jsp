<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
	li{
		margin-right: 400px;
	}
	a{
		text-decoration: none;
		font-size: 17px;
		font-weight: bold;
	}
	a:link{
		color: white;
	}
	a:visited{
		color: white;
	}
	
</style>
<body>
<header style="
	height : 80px;
	background-color: blue;
	color: white;
	text-align: center;
	line-height: 80px;
	font-size: 30px;
	margin: 0px ;
	height: 80px;">쇼핑몰 회원관리 version 1.0 ver</header>
	<nav style="
		display: flex;
	    height: 70px;
	    background-color: rgb(115, 115, 247);
	    text-align: center;
	    padding-left: 17px;
	    line-height: 70px;
	    margin: -10px;
	">
		<ul style="list-style: none; display: flex; margin: 0; padding: 0;">		
			
			<li><a class="h_tag" href="<%=request.getContextPath()%>/member">홈으로</a></li>
			<li><a class="h_tag" href="<%=request.getContextPath()%>/member/insert">회원등록</a></li>
			<li><a class="h_tag" href="<%=request.getContextPath()%>/member/list">회원목록조회</a></li>
			<li><a class="h_tag" href="<%=request.getContextPath()%>/member/salary">회원매출조회</a></li>
			
		</ul> 
	 </nav>
</body>
</html>