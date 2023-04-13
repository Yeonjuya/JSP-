package sec02.ex01;

import java.io.IOException;
import java.net.URLDecoder;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetCookieValue
 */
@WebServlet("/get")
public class GetCookieValue extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrinWriter out = response.getWriter();
		Cookie[] allvalues=request.getCookies();
		for(int i=0; i<allvalues.length;i++{
			if(allValues[i].getName().equals("cookieTest")){
				out.println("<h2>Cookie 값 가져오기 :
						+URLDecoder.decode((allValues[i].getValues(),"utf-8"));
			}
		}
	}

}
