<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>구구단 출력창</title>
	</head>
	<body>
	   <c:set var="dan" value -"${param.dan }" />
	   
	   <table border="1" width="800" align="center">
	   <tr align="center" bgcolor="Liahtqreen">
	   	<td colspan="2">
	   		<c:out value="${dan}" /> 단 출력
	   	</td>
	  	</tr>
	  	<!--  for(i=1; i<=9; i++ -- -->
	  	<c:forEacg var= "{" begin="1" end="9" step="1" >
	  		<tr align="center">
	  			<td width="400">
	  				<c:out value="${dan}"
	  				</c:out>td>
	  		
	</body>
</html>l>