package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/input")
public class InputServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("third doGet 메소드 호출");
	      request.setCharacterEncoding("utf-8"); // utf-8로 인코딩
	      String user_id = request.getParameter("user_id"); // 아이디 요청
	      String user_pw = request.getParameter("user_pw");// 비번요청
	      
	      System.out.println(("아이디 : " + user_id)); // 아이디 출력
	      System.out.println(("비밀번호 : " + user_pw)); // 비번 출력
	      
	      String[] subject = request.getParameterValues("subject");
	      System.out.print("선택한 과목 : ");
	      
	      for(String str : subject) {
	         System.out.print(str + ", ");
	      }
	}

}
