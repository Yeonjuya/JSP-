<%@ page language="java" contentType="text/html; charset=UTF-8"
	import="sec01.ex01.*"
    pageEncoding="UTF-8" 
    isELIgnored="false"  %>
<%
	//session에 address 속성이름으로 바인딩
	session.setAttribute("address", "부산시 사상구");
	%>   
<html>

	<head>
		<meta charset=”UTF-8">
		<title>회원 정보 출력창</title>
	</head>
	<body>
		<table border="1"  align="center" >
		    <tr align="center" bgcolor="#99ccff">
		      <td width="20%"><b>아이디</b></td>
		      <td width="20%"><b>비밀번호</b></td>
		      <td width="20%"><b>이름</b></td>
		      <td width="20%"><b>이메일</b></td>
		      <td width="20%"><b>주소</b></td>
		   </tr>
		   <tr align=center>
		   <!--  바인딩 시 속성 이름 member로 각각의 MemberBeam 속성에 접속하여 회원정보 출력-->
		      <td>${member.id} </td>
		      <td>${member.pwd}</td>
		      <td>${member.name} </td>
		      <td>${member.email} </td>
		      <!--  바인딩 된 주소 정보  -->
		   </tr>   
		   <tr align=center>
		  	 <td>${param.id} </td> 
		     <td>${param.pwd} </td>
		     <td>${param.name} </td> 
		     <td>${param.email} </td> 	      
		   </tr>
		   
		</table>
	</body>
