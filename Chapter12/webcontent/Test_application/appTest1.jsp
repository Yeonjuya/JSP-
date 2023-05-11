<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
// session과 application 내장 객체에 바인딩
String name=(String)session.getAttribute("name");
session.setAttribute("address","부산시 사상구"); 
%>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>내장 객체 스코프 테스트1</title>
</head>
<body>
		<h1>이름과 주소를 저장합니다.</h1>
		<a href = appTest2.jsp>두번째 웹페이지로 이동</a>

</body>
</html>