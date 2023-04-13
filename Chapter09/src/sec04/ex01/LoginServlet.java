package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


@WebServlet("/login4")
public class LoginServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doHandle(request, response);
   }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doHandle(request, response);
   }

   protected void doHandle(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html;charset=utf-8");
      
      PrintWriter out = response.getWriter();
      
      //로그인창에서 전송된 ID와 비밀번호를 가져옵니다.
      String user_id = request.getParameter("user_id");
      String user_pw = request.getParameter("user_pw");
      
      //MemberVo 객체를 생성하고 속성에 ID와 비밀번호를 설정합니다.
      MemberVO memberVO = new MemberVO();
      memberVO.setId(user_id);
      memberVO.setPwd(user_pw);
      
      MemberDAO dao = new MemberDAO();
      
      //MemberDAO의 isExisted() 메서드를 호출하면서 memberVO를 전달한다.
      boolean result = dao.isExisted(memberVO);
      
      if(result) {
         HttpSession session = request.getSession();
         
         //조회한 결과가 true이면 isLogOn 속성을 true로 세션에 저장한다.
         session.setAttribute("isLogOn", true);
         
         //조회한 결과가 true이면 ID와 비밀번호를 세션에 저장한다.
         session.setAttribute("login.id", user_id);
         session.setAttribute("login.pwd", user_pw);
         
         out.print("<html><body>");
         out.print("안녕하세요 " + user_id + "님!!!<br>");
         out.print("<a href='show'>회원정보 보기</a>");
         out.print("</body></html>");
      } else {
         out.print("<html><body><center>회원 아이디가 틀립니다.");
         out.print("<a href='login4.html'> 다시 로그인하기</a>");
         out.print("</body></html>");
      }
   }
}