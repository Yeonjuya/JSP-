package sec02.ex01;

import java.io.IOException;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SetCookieValue
 */
@WebServlet("/set")
public class SetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrinWriter out=response.getWriter();
		Date d=new Date();
		Cookie c=new Cookie("cookieTest",URLEncoder.encode("JSP프로그래밍입니다.","utf-8"));
		c.setMaxAge(24*60*60);
		response.addCookie(c);
		out.println("현재시간 : "+d);
		out.println("현재시간을 Cookie로 저장합니다.");
	}

}
