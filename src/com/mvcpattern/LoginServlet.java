package com.mvcpattern;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mvcpattern.service.LoginService;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String username,password;
		
		username = request.getParameter("username");
		password = request.getParameter("password");
		
		LoginService loginService = new LoginService();
		boolean result = loginService.Authenticate(username, password);
		if(result == true){
			response.sendRedirect("success.jsp");
			return;
		}
		else{
			
			response.sendRedirect("login.jsp");
			return;
		}
		Collections<Integer> cl = new ArrayList();
	}

}
