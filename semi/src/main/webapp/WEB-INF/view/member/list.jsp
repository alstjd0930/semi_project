<%@page import="semi.project.model.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 조회</title>
</head>
<style>
</style>
<body>
<%@ include file="header.jsp"%>
<%@ include file="nav.jsp"%>
<%@ include file="section.jsp"%>
<section>
<h2>회원 목록 조회</h2>

	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>고객등급</th>
			<th>거주지역</th>
		</tr>
		<%
	
		List<MemberDto> volist = (List<MemberDto>)request.getAttribute("list");
		if(volist !=null && volist.size()>0){
		for(int i=0; i<volist.size();i++){
			MemberDto vo = volist.get(i);
		
		%>
		<tr>
			<td><a href="<%=request.getContextPath() %>/member/modify?custno=<%=volist.get(i).getCustno()%>"> <%=volist.get(i).getCustno()%> </a></td>
			<td><%=volist.get(i).getCustname()%></td>
			<td><%=volist.get(i).getPhone() %></td>
			<td><%=volist.get(i).getAddress() %></td>
			<td><%=volist.get(i).getGrade() %></td>
			<td><%=volist.get(i).getCity() %></td>
		</tr>
		<%
		}
		}
		%>
	</table>
	</section>
<%@ include file="footer.jsp"%>
</body>
</html>