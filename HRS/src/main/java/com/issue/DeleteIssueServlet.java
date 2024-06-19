package com.issue;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/DeleteIssueServlet")
public class DeleteIssueServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		boolean isTrue;
		
		isTrue = IssueDBUtil.deleteIssue(id);
		
		if(isTrue==true) {
			RequestDispatcher dis = request.getRequestDispatcher("validitychk.jsp");
			dis.forward(request, response);
		}
		else {
			List<Issues> issueDetails = IssueDBUtil.getIssueDetails(id);
			request.setAttribute("issueDetails", issueDetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("issues.jsp");
			dis.forward(request, response);
		}
	}

}
