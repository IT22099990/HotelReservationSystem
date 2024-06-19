package com.issue;

public class Issues {
	//attributes
	private int IssueID;
	private String CustomerID;
	private String CustomerName;
	private String HotelName;
	private String IssueType;
	private String Issue;
	private String Solution;
	
	//methods
	public Issues(int issueID, String customerID, String customerName,String hotelName, String issueType, String issue,
			String solution) {
		IssueID = issueID;
		CustomerID = customerID;
		CustomerName = customerName;
		HotelName = hotelName;
		IssueType = issueType;
		Issue = issue;
		Solution = solution;
	}

	public int getIssueID() {
		return IssueID;
	}

	public String getCustomerID() {
		return CustomerID;
	}

	public String getCustomerName() {
		return CustomerName;
	}

	public String getHotelName() {
		return HotelName;
	}

	public String getIssueType() {
		return IssueType;
	}

	public String getIssue() {
		return Issue;
	}

	public String getSolution() {
		return Solution;
	}
	
}
