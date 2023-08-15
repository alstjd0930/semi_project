<%@page import="semi.project.model.dto.MemberDto"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<style>
	select {
		width: 250px;
		height: 30px;
}

</style>
<meta charset="UTF-8">
<title>회원 정보 수정</title>
</head>
<body style="margin: 0px; padding: 0px;">
<%@ include file="header.jsp"%>

<%@ include file="section.jsp"%>

<section>

<h2 style="text-align: center; padding-top: 40px; margin: 0px; ">회원 정보 수정</h2>
	<form action="<%=request.getContextPath() %>/member/modify.do" method="post">
	<table border="1">
		<tr>
			<td style="font-weight: bold; width:400px;">회원번호</td>
			<td><input type="text" readonly="readonly" name="custno" value="${mvo.custno}" style="width:500px;font-size:20px;"></td>
		</tr>
		<tr>
			<td style="font-weight: bold; width:400px;">회원성명</td>
			<td><input type="text" name="custname" value="${mvo.custname}" style="width:500px;font-size:20px;"> </td>
		</tr>
		<tr>
			<td style="font-weight: bold; width:400px;">회원전화</td>
			<td><input type="text" name="phone" value="${mvo.phone}" style="width:500px;font-size:20px;"> </td>
		</tr>
		<tr>
			<td style="font-weight: bold; width:400px;">회원주소</td>
			<td><input type="text" name="address" value="${mvo.address}" style="width:500px;font-size:20px;"> </td>
		</tr>
		<tr>
			<td style="font-weight: bold; width:400px;">고객등급</td>
			<td><%-- <input type="text" name="grade" value="${mvo.grade}"> --%> 
				<select name="grade">
					<option>S</option>
					<option>A</option>
					<option>B</option>
					<option>C</option>
				</select>		
			</td>
		</tr>
		<tr>
			<td style="font-weight: bold; width:400px;">도서코드</td>
			<td><%-- <input type="text" name="city" value="${mvo.city}"> --%>
				<select name="city">
					<option>01</option>
					<option>30</option>
					<option>40</option>
					<option>60</option>
				</select>	
			</td>
		</tr>
		<!-- <tr>
			<td>고객등급</td>
			<td><input type="text" name="grade">
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
			<td><input type="text" name="city">
				<select name="city">
					<option>01</option>
					<option>30</option>
					<option>40</option>
					<option>60</option>
				</select>	
			</td>
		</tr> -->
		<tr>
			<tr>
			<td colspan="2"><center><input type="button" value="수정" onclick="alert('수정완료')" style=width:80px; height="20px"><input type="submit" value="조회" style=width:80px; height="20px"></center></td>
		</tr>
		</tr>
	
	</table>
	</form>
</section>
	<%@ include file="footer.jsp"%>
</body>
<script>

</script>
</html>