<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 등록</title>
</head>
<body>
	<h2>홈쇼핑 회원 등록</h2>
	<form action="<%=request.getContextPath() %>/user/result">
	<table border="1">
		<tr>
			<td>회원번호</td>
			<td><input type=""> </td>
		</tr>
		<tr>
			<td>회원성명</td>
			<td><input type="text" name=""> </td>
		</tr>
		<tr>
			<td>회원전화</td>
			<td><input type="text" name=""> </td>
		</tr>
		<tr>
			<td>회원주소</td>
			<td><input type="text" name=""> </td>
		</tr>
		<tr>
			<td>가입일자</td>
			<td><input type="text" name=""> </td>
		</tr>
		<tr>
			<td>고객등급</td>
			<td><input type="text" name=""> </td>
		</tr>
		<tr>
			<td>도서코드</td>
			<td><input type="text" name=""> </td>
		</tr>
		<tr>
			<td><input type="submit" name=""><input type="submit" name=""></td>
		</tr>
	
	</table>
	</form>
</body>
</html>