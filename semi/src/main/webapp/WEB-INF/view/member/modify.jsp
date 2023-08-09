<%@page import="semi.project.model.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
<%@ include file="header.jsp"%>
<%@ include file="section.jsp"%>

<section>

<h2>회원 정보 수정</h2>
	<form action="<%=request.getContextPath() %>/member/modify.do" method="post">
	<table border="1">
		<tr>
			<td>회원번호</td>
			<td><input type="text" readonly="readonly" value="${mvo.custno}"></td>
		</tr>
		<tr>
			<td>회원성명</td>
			<td><input type="text" name="custname" value="${mvo.custname}"> </td>
		</tr>
		<tr>
			<td>회원전화</td>
			<td><input type="text" name="phone" value="${mvo.phone}"> </td>
		</tr>
		<tr>
			<td>회원주소</td>
			<td><input type="text" name="address" value="${mvo.address}"> </td>
		</tr>
		<tr>
			<td>고객등급</td>
			<td><input type="text" name="grade" value="${mvo.grade}"> </td>
		</tr>
		<tr>
			<td>도서코드</td>
			<td><input type="text" name="city" value="${mvo.city}"> </td>
		</tr>
		<tr>
			<td colspan="2">
			<button type="submit">수정</button>
			<button type="button">조회</button>
			</td>
		</form>
		</tr>
	
	</table>
	</form>
</section>
	<%@ include file="footer.jsp"%>
</body>
<script>
</script>
</html>