<%@page import="semi.project.model.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 목록 조회</title>
<%-- <%@include file="/WEB-INF/view/member/style.css" %> --%>
</head>
<style>
</style>
<body style="margin: 0px; padding: 0px;">
<%@ include file="header.jsp"%>

<%@ include file="section.jsp"%>
<section>
<h2 style="text-align: center; padding-top: 40px; margin: 0px; ">회원 목록 조회</h2>

	<table border="1">
		<tr>
			<th>회원번호</th>
			<th>회원성명</th>
			<th>전화번호</th>
			<th>주소</th>
			<th>고객등급</th>
			<th>도시코드</th>
		</tr>
		<%
	
		List<MemberDto> volist = (List<MemberDto>)request.getAttribute("list");
		if(volist !=null && volist.size()>0){
		for(int i=0; i<volist.size();i++){
			MemberDto vo = volist.get(i);
		
		%>
		<tr>
			<td><a  style="color: blue;" href="<%=request.getContextPath() %>/member/modify?custno=<%=volist.get(i).getCustno()%>"> <%=volist.get(i).getCustno()%> </a></td>
			<td><%=volist.get(i).getCustname()%></td>
			<td><%=volist.get(i).getPhone() %></td>
			<td><%=volist.get(i).getAddress() %></td>
			<td><%-- <%=volist.get(i).getGrade() %> --%>
			<% 
		        String grade = volist.get(i).getGrade();
		        if ("A".equals(grade)) {
		            out.print("VIP");
		        } else if ("B".equals(grade)) {
		            out.print("일반");
		        } else if ("C".equals(grade)) {
		            out.print("직원");
				} else if ("S".equals(grade)) {
		            out.print("admin");
		        }
       		 %>
			</td>
			<td><%=volist.get(i).getCity() %></td>
			<td><input type="button" value="삭제" onclick="deleteMember('<%=volist.get(i).getCustno()%>')"></td>
		</tr>
		<%
		}
		}
		%>
	</table>
	</section>
<%@ include file="footer.jsp"%>
<script>
function deleteMember(custno) {
    if (confirm('정말로 삭제하시겠습니까?')) {

    }
}
</script>
</body>
</html>