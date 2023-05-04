package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login2")
public class LoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   /**
    * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
    */
   public void init(ServletConfig config) throws ServletException {
            System.out.println("init 메서드 호출");
         }
   public void destroy() {
            System.out.println("destroy 메서드 호출");
         }
   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      // 한글 전송 시 인코딩 작업 생략 - Filter로 처리.
      // request.setCharacterEncoding("utf-8");
      response.setContentType("text/html;charset=utf-8");
      PrintWriter out = response.getWriter();
      HttpSession session = request.getSession();
      
      // getParameter() 메서드를 이용하여 전송된 회원 정보를 가져온다.
      String user_id = request.getParameter("user_id");
      String user_pw = request.getParameter("user_pw");
      
      LoginImpl loginUser= new LoginImpl(user_id,user_pw);
      if(session.isNew()) {
    	  session.setAttribute("loginUser", loginUser);
      }
     out.println("<html><head>");
     out.println("<script type='text/javascript'>");
     //자바스크립스트의 setTimeout 함수로 3초마다 서블릿에 재요청하여 접속자수 표시
     out.println("setTimeout('history.go(0);', 5000)");
     out.println("</script>");
     out.println("</head>");
     out.println("<body>");
     out.println("아이디는 " + loginUser.user_id +"<br>");
     out.println("총 접속자수는"+LoginImpl.total_user+"<br>");
     out.println("</body></html>");

   }

}
