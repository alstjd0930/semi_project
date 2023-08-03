<%@page import="semi.project.DTO.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 조회</title>
</head>
<body>
<%
	List<MemberDto> volist = (List<MemberDto>)request.getAttribute("list");
%>
<h2>회원 목록 조회</h2>

	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>가입일자</th>
			<th>고객등급</th>
			<th>거주지역</th>
		</tr>
		<%
		for(int i=0; i<volist.size();i++){
			MemberDto vo = volist.get(i);
		
		%>
		<tr>
			<td><a href="<%=request.getContextPath() %>/member/modify"> <%=vo.getCustno() %></a></td>
			<td><%=vo.getCustname() %></td>
			<td><%=vo.getPhone() %></td>
			<td><%=vo.getAddress() %></td>
			<td><%=vo.getJoindate() %></td>
			<td><%=vo.getGrade() %></td>
			<td><%=vo.getCity() %></td>
		</tr>
		<%
		}
		%>
	</table>

</body>
</html>