package sec02.ex01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/first6")
public class FirstServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
      
		request.setAttribute("address", "부산시 사상구 괘법동"); //웹브라우저에서 요청한 request객체에 address의 값으로 "부산시 사상구 괘법동" 바인딩
		RequestDispatcher dispatch = request.getRequestDispatcher("second6");
		dispatch.forward(request, response);
	}
}