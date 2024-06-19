package com.issue;

import java.sql.Connection;


import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;
import java.util.ArrayList;

public class IssueDBUtil {
	
	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static List<Issues> validate(String HotelName,String Section){
		
		ArrayList<Issues> issue = new ArrayList<>();
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
	
			String sql = "SELECT * FROM issues WHERE HotelName ='"+HotelName+"' and  IssueType ='"+Section+"'";
			
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				int id = rs.getInt(1);
				String Cusid = rs.getString(2);
				String Cusname = rs.getString(3);
				String hotelname = rs.getString(4);
				String type = rs.getString(5);
				String description = rs.getString(6);
				String solution = rs.getString(7);
				
				Issues i = new Issues(id,Cusid,Cusname,hotelname,type,description,solution);
				
				issue.add(i);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		return issue;
		
	}
	
	public static boolean Insertissue(String customerId,String customerName,String hotelName,String IssueType,String Issue) {
		boolean isSuccess = false;
		
		try{
            con = DBconnect.getConnection();
            stmt = con.createStatement();
			String sql = "INSERT INTO issues VALUES (0,'"+customerId+"','"+customerName+"','"+hotelName+"','"+IssueType+"','"+Issue+"',0)";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
			
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		
		return isSuccess;
	}
	
	public static boolean updateIssue(String id,String solution) {
		
		try {
			con = DBconnect.getConnection();
			stmt= con.createStatement();
			String sql = "update issues set Solution='"+solution+"'"+" where IssueID='"+id+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		
		}
	    catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
	}
	
	public static List<Issues> getIssueDetails(String IssueID){
		
		int convertedID = Integer.parseInt(IssueID);
		
		ArrayList<Issues> prob = new ArrayList<>();
		
		try {
			con = DBconnect.getConnection();
			stmt=con.createStatement();
			String sql="SELECT * FROM issues WHERE IssueID='"+convertedID+"'";
			rs=stmt.executeQuery(sql);
			
			while(rs.next()) {
				int issueID = rs.getInt(1);
				String customerID = rs.getString(2);
				String customerName = rs.getString(3);
				String hotelName = rs.getString(4);
				String issueType = rs.getString(5);
				String issue = rs.getString(6);
				String solution = rs.getString(7);
				
				Issues i = new Issues(issueID,customerID,customerName,hotelName,issueType,issue,solution);
				prob.add(i);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return prob;
	}
	
	public static boolean deleteIssue(String id) {
		
		int convertedID = Integer.parseInt(id);
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "DELETE FROM issues WHERE IssueID='"+convertedID+"'";
			int rs = stmt.executeUpdate(sql);
			
			if(rs>0) {
				isSuccess=true;
			}
			else {
				isSuccess=false;
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
		
		return isSuccess;
	}

}
