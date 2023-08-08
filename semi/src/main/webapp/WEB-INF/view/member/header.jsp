<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
boby{
	margin: 0;
    padding: 0;
}
nav{
	width: 100%;
	background-color: red;
	
}
.h_tag{	
	font-weight:bolder;
	font-size:20px;
	text-align: center;
	text-decoration: none;
	color: white;
}
</style>
<body>

<nav > 
	<a class="h_tag" href="<%=request.getContextPath()%>/member">홈으로</a>
	<a class="h_tag" href="<%=request.getContextPath()%>/member/insert">회원등록</a>
	<a class="h_tag" href="<%=request.getContextPath()%>/member/list">회원목록조회</a>
	<a class="h_tag" href="<%=request.getContextPath()%>/member/salary">회원매출조회</a>
 </nav>
</body>
</html>