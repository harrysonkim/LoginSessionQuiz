package controller.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login/login")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	HttpSession session = null;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login/login [GET]");	
		
		request.getRequestDispatcher("/WEB-INF/views/login/loginForm.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/login/login [POST]");	
		
		session = request.getSession(); // => true 상태와 같다

		System.out.println(request.getParameter("id"));
		System.out.println(request.getParameter("pass"));
		
		if( (request.getParameter("id").equals("abc")) && (request.getParameter("pass").equals("123")) ) {

			session.setAttribute("login", true );
			session.setAttribute("loginid", request.getParameter("id") );

			request.getRequestDispatcher("/WEB-INF/views/login/loginSuccess.jsp").forward(request, response);
			return;
		} 
		session.setAttribute("login", false );

		System.out.println("로그인 실패!");
		request.getRequestDispatcher("/WEB-INF/views/login/loginFail.jsp").forward(request, response);
		
		
		
	}

}
