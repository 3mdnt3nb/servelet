package com.js.generic_servelet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Login extends GenericServlet {
//	1.login.html
//	2.login servelet page 
//	3.if email and password are correct it goes to Home.html
//	4.else it stays at login.html itself

	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		
		if(email.equals("prajwal@gmail")&& password.equals("12345")) {
			RequestDispatcher rd = req.getRequestDispatcher("Home.html");
			rd.forward(req, res);
		}
		else {
			PrintWriter pw = res.getWriter();
			pw.write("<html><body> <h3> WRONG EMAIL/PASSWORD</h3></body></html>");
			RequestDispatcher rd = req.getRequestDispatcher("login.html");
		    rd.include(req, res);
		}
	}
	
//	ServletContext  s=getServletContext();
//	System.out.println(s.getInitParameter("thank you"));

}


