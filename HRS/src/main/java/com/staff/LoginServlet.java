package com.staff;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		String Username = request.getParameter("username");
		String Password = request.getParameter("password");
		boolean isTrue;
		
		isTrue = StaffDBUtil.validate(Username,Password);
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("homenew.jsp");
			dis.forward(request, response);
		}else {
			out.println("<script type ='text/javascript'>");
			out.println("alert('Your username or password is incorrect');");
			out.println("location='Slogin.jsp'");
			out.println("</script>");
		}
	}

}
