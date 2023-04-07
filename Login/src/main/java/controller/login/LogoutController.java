package controller.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login/logout")
public class LogoutController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login/ligout [GET]");
		
		HttpSession session = request.getSession();
		
		
		
		// 세션 객체 삭제
		// 세션 정보를 포함한 세션 모든 것이 삭제된다
		// 로그아웃에 사용된다
		session.invalidate();
		
		response.sendRedirect("./login");
		
	}


}
