<%@page import="semi.project.model.dto.MemberDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<style>
</style>
<link rel="stylesheet" href="/resource/css/style.css">
<meta charset="UTF-8">
<title>회원 등록</title>
</head>
<body style="margin: 0px; padding: 0px;">
<%@ include file="header.jsp"%>
<%@ include file="section.jsp"%>
<section>
	<h2 style="text-align: center; padding-top:40px; margin: 0px; ">쇼핑몰 회원관리</h2>
	<p style = " padding-left: 10px">
	쇼핑몰 회원정보와 회원매출정보 데이터베이스를 구축하고 회원관리 프로그램을 작성하는 프로그램이다.<br>
	프로그램 작성 순서<br>
	1. 회원정보 테이블을 생성한다.<br>
	2. 매출정보 테이블을 생성한다.<br>
	3. 회원정보, 매출정보 테이블에 제시된 문제지의 참조데이터를 추가 생성한다.<br>
	4. 회원정보 입력 화면프로그램을 작성한다.<br>
	5. 회원정보 조회 프로그램을 작성한다.<br>
	6. 회원매출정보 조회 프로그램을 작성한다.<br>
</p>	
</section>
<%@ include file="footer.jsp"%>
</body>
</html>