<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%
// session�� application ���� ��ü�� ���ε�
String name=(String)session.getAttribute("name");
session.setAttribute("address","�λ�� ���"); 
%>
    
   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>���� ��ü ������ �׽�Ʈ1</title>
</head>
<body>
		<h1>�̸��� �ּҸ� �����մϴ�.</h1>
		<a href = appTest2.jsp>�ι�° ���������� �̵�</a>

</body>
</html>