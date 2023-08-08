<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<nav > 
	<a href="<%=request.getContextPath()%>/member">홈으로</a>
	<a href="<%=request.getContextPath()%>/member/insert">회원등록</a>
	<a href="<%=request.getContextPath()%>/member/list">회원목록조회</a>
	<a href="<%=request.getContextPath()%>/member/salary">회원매출조회</a>
 </nav>
</body>
</html>