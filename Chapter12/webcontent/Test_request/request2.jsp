<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	// 포워딩 된 request 객체에서 getAttribute() 이용하여 정보 가져 옴
   	String name=(String)request.getAttribute("name");
   	String address=(String )request.getAttribute("address");
%> 

<!DOCTYPE html>      
<html>
	<head>
		<meta charset="UTF-8">
		<title>두 번째 JSP</title>
	</head>
	<body>
	   <h1>이름은 <%= name %>입니다.</h1>
	   <h1>주소는 <%= address %>입니다.</h1>
	</body>
</html>