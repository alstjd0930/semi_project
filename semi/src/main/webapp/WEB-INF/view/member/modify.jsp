<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body>
<h2>회원 정보 수정</h2>
	<form action="<%=request.getContextPath() %>/member/list">
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
			<td colspan="2"><center><input type="button" value="수정" ><input type="submit" value="조회"></center></td>
		</tr>
	
	</table>
	</form>
</body>
</html>