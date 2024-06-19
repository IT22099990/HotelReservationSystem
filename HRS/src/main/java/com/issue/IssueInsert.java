package com.issue;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/IssueInsert")
public class IssueInsert extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String customerId = request.getParameter("CusID");
		String customerName = request.getParameter("Cusname");
		String hotelName = request.getParameter("hotel");
		String IssueType = request.getParameter("Qtype");
		String Issue = request.getParameter("problem");
		
		
		boolean isTrue;
		
		isTrue = IssueDBUtil.Insertissue(customerId, customerName, hotelName, IssueType, Issue);
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("success.jsp");
			dis.forward(request, response);
		}
		else {
			RequestDispatcher dis2 = request.getRequestDispatcher("unsuccess.jsp");
			dis2.forward(request, response);
		}
	}

}
