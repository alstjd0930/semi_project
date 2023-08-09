<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="/resource/css/style.css">
<title>홈쇼핑 회원 등록</title>
</head>
<body>
<%@ include file="header.jsp"%>
<%@ include file="section.jsp"%>
<section>
<h2>홈쇼핑 회원 등록</h2>

	<form action="<%=request.getContextPath() %>/member/insert" method="post">
	<table border="1">
		<tr>
			<td>회원번호</td>
			<td><input type="custno" readonly="readonly"> </td>
		</tr>
		<tr>
			<td>회원성명</td>
			<td><input type="text" name="custname" > </td>
		</tr>
		<tr>
			<td>회원전화</td>
			<td><input type="text" name="phone"> </td>
		</tr>
		<tr>
			<td>회원주소</td>
			<td><input type="text" name="address"> </td>
		</tr>
		<tr>
			<td>고객등급</td>
			<td><input type="text" name="grade"> </td>
		</tr>
		<tr>
			<td>도서코드</td>
			<td><input type="text" name="city"> </td>
		</tr>
		<tr>
			<td colspan="2"><center><input type="button" value="등록" ><input type="submit" value="조회"></center></td>
		</tr>
	
	</table>
	</form>
</section>
<%@ include file="footer.jsp"%>
</body>
</html>