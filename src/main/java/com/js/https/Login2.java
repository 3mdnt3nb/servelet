package com.js.https;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value= "/login2")
public class Login2 extends HttpServlet{
	
	
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String ema= req.getParameter("email");    				       //NAME IN LOGIN PAGE
		int pass=Integer.parseInt(req.getParameter("password"));		//String pass = req.getParameter("password");
		
		
	if(ema.equals("prajwal@gmail") &&  pass==12345){
		      RequestDispatcher rd = req.getRequestDispatcher("result.jsp");
		      rd.forward(req, resp);
	}
	else {
		PrintWriter pw = resp.getWriter();
		pw.write("<html><body> <h3> WRONG EMAIL/PASSWORD</h3></body></html>");  
		RequestDispatcher rd = req.getRequestDispatcher("login.html");
		rd.include(req, resp);
	}
	}
	//do post is used hide the detailss
}
