<%@ page language="java" contentType="text/html; charset=UTF-8"
   import="java.util.*,sec01.ex01.*"
    pageEncoding="UTF-8"%>
<%
      request.setCharacterEncoding("utf-8");
%>

<jsp:useBean id="m" class=sec01.ex01.MemberBEAN" scope="page"/>

<jsp:setProperty name="m" property="*"  />

<%
   MemberDAO memberDAO = new MemberDAO();
   memberDAO.addMember(m);
   List memberList = memberDAO.listMembers();
%> 

<!DOCTYPE html>
<html>
   <head>
     <meta charset="UTF-8">
     <title>회원 목록창</title>
   </head>
   <body>
      <table align="center" width="100%">
         <td>
         	<jsp:getProperty name="m" property="id" />
         </td>
         <td>
         	<jsp:getProperty name="m" property="pwd" />
         </td>
         <td>
         	<jsp:getProperty name="m" property="name" />
         </td>
         <td>
         	<jsp:getProperty name="m" property="email" />
         </td>
         	
         
         <%
            if(memberList.size() == 0) {
         %>
            <tr>
               <td colspan="5">
                  <p align = "center">
                     <b>등록된 회원이 없습니다.</b>
                  </p>
               </td>
            </tr>
         <%
            } else {
               for(int i = 0; i < memberList.size(); i++ ) {
            	   MemberBEAN bean = (MemberBEAN) memberList.get(i);
         %>
                  <tr align = "center">
                     <td><%=bean.getId() %></td>
                     <td><%=bean.getPwd() %></td>
                     <td><%=bean.getName() %></td>
                     <td><%=bean.getEmail() %></td>
                     <td><%=bean.getJoinDate() %></td>
                  </tr>
         <%
               } // end for
            } // end if
         %>
            <tr height="1" bgcolor="99ccff">
               <td colspan="5"></td>
            </tr>
      </table>
   </body>
</html>

