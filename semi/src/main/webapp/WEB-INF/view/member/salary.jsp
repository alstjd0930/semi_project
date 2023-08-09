<%@page import="semi.project.model.dto.MemberDto"%>
<%@page import="java.util.List"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원매출조회</title>
</head>
<body>
<%@ include file="header.jsp"%>
<%@ include file="section.jsp"%>
<section>
	<h2>회원매출조회</h2>
	
	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>회원등급</th>
			<th>총합</th>
		</tr>
		<%
	
		List<MemberDto> volist = (List<MemberDto>)request.getAttribute("list");
		if(volist !=null && volist.size()>0){
		for(int i=0; i<volist.size();i++){
			MemberDto vo = volist.get(i);
		
		%>
		<tr>
			<td> <%=volist.get(i).getCustno()%></a></td>
			<td><%=volist.get(i).getCustname()%></td>
			<td><%=volist.get(i).getGrade() %></td>
			<td><%=volist.get(i).getPrice() %></td>
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