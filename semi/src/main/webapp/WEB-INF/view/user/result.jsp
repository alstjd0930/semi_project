<%@page import="java.util.List"%>
<%@page import="semi.project.model.UserDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 조회/수정</title>
</head>
<body>
	<h2>회원 목록 조회/수정</h2>
	<% 
	
	List<UserDto> vo =(List<UserDto>)request.getAttribute("list");
	for(int i=0; i<=vo.size();i++){
		UserDto dto= vo.get(i);
		
	}
	%>


</body>
</html>