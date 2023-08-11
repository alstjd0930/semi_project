<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!-- <link rel="stylesheet" href="/resource/css/style"> -->
<title>홈쇼핑 회원 등록</title>
<script>
/* 	function btnal() {
		alert("등록완료");
	} */
</script>
</head>
<body>
<%
	int custno=0;
	custno=(Integer)request.getAttribute("custno");
%> 
<%@ include file="header.jsp"%>
<%@ include file="nav.jsp"%>
<%@ include file="section.jsp"%>
<section>
<h2>홈쇼핑 회원 등록</h2>

	<form action="<%=request.getContextPath() %>/member/insert" method="post" >
	<table border="1">
		<tr>
			<td>회원번호</td>
			<td><input type="custno" readonly="readonly" value="custno" > </td>
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
			<td><!-- <input type="text" name="grade"> -->
				<select name="grade">
					<option>S</option>
					<option>A</option>
					<option>B</option>
					<option>C</option>
				</select>			
			 </td>
		</tr>
		<tr>
			<td>도서코드</td>
			<td><!-- <input type="text" name="city"> -->
				<select name="city">
					<option>01</option>
					<option>30</option>
					<option>40</option>
					<option>60</option>
				</select>	
			</td>
		</tr>
		<tr>
			<td colspan="2"><center><input type="button" value="등록" onclick="alert('등록완료')" ><input type="submit" value="조회"></center></td>
		</tr>
	
	</table>
	</form>
</section>
<%@ include file="footer.jsp"%>

</body>
</html>