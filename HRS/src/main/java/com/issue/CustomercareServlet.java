package com.issue;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CustomercareServlet")
public class CustomercareServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String HotelName = request.getParameter("hotel");
		String Section = request.getParameter("section");

		
		try {
		List <Issues> issueDetails = IssueDBUtil.validate(HotelName,Section);
		request.setAttribute("issueDetails", issueDetails);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("issues.jsp");
		dis.forward(request, response);
		
		
		
				
		
	}

}
