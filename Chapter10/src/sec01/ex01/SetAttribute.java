package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class SetAttribute
 */
@WebServlet("/set")
public class SetAttribute extends HttpServlet {
   private static final long serialVersionUID = 1L;

    public SetAttribute() {
        // TODO Auto-generated constructor stub
    }

   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      request.setCharacterEncoding("UTF-8");
      response.setContentType("text/html;charset=utf-8");
      
      PrintWriter out = response.getWriter();
      
      String ctxMesg = "context에 바인딩됩니다.";
      String sesMesg = "session에 바인딩 됩니다.";
      String reqMesg = "request에 바인딩 됩니다.";
      
      //getServeltContext 객체, getSession 객체,
      //HttpServletRequest 객체의 setAttribute(0 메서드를 이용해 속성 바인딩
      ServletContext ctx = getServletContext();
      HttpSession session = request.getSession();
      
      ctx.setAttribute("context", ctxMesg);
      session.setAttribute("session", sesMesg);
      request.setAttribute("request", reqMesg);
      
      out.print("바인딩을 수행합니다.");
   }

}