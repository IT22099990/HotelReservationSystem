package com.staff;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import com.issue.DBconnect;

public class StaffDBUtil {

	private static boolean isSuccess;
	private static Connection con = null;
	private static Statement stmt = null;
	private static ResultSet rs = null;
	
	public static boolean validate(String username,String password) {
		
		try {
			con = DBconnect.getConnection();
			stmt = con.createStatement();
			String sql = "SELECT * from staff where Username='"+username+"' AND Password = '"+password+"'";
			rs = stmt.executeQuery(sql);
			
			if(rs.next()) {
				isSuccess = true;
			}
			else {
				isSuccess = false;
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return isSuccess;
		
	}
}
