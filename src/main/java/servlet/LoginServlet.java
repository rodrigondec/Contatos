package servlet;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.Usuario;

/**
 * Servlet implementation class LoginServlet
 */
@SuppressWarnings("serial")
@WebServlet("/dologin")
public class LoginServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
			String login = request.getParameter("login");
			String senha = request.getParameter("password");
			
			if(login.equals("admin") && senha.equals("admin")){
				Usuario u = new Usuario(login, senha);
				
				request.getSession().setAttribute("usuario", u);
				
				response.sendRedirect("/app/auth/cadastro.html");
			}
			else{
				response.sendRedirect("/app/login.html");
			}
			
	}

}
