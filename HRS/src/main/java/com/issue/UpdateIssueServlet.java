package com.issue;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/UpdateIssueServlet")
public class UpdateIssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String id = request.getParameter("id");
		//String cusid = request.getParameter("cusid");
		//String cusname = request.getParameter("cusname");
		//String hotel = request.getParameter("hotel");
		//String itype = request.getParameter("itype");
		//String issue = request.getParameter("issue");
		String solution = request.getParameter("solution");
		
		boolean isTrue;
		
		isTrue = IssueDBUtil.updateIssue(id,solution);
		
		if(isTrue==true) {
			
			List<Issues> issueDetails = IssueDBUtil.getIssueDetails(id);
			request.setAttribute("issueDetails",issueDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("issues.jsp");
			dis.forward(request, response);
		}
		else {
			
			List<Issues> issueDetails = IssueDBUtil.getIssueDetails(id);
			request.setAttribute("issueDetails",issueDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("issues.jsp");
			dis.forward(request, response);
		}
	}
}
