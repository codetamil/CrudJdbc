package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtil {
	
	
	public static Connection getConnectToMysql() 
	{
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connect;
			
				connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee",
						
						"root","root");
				System.out.println("Connection Established");
				return connect;
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("Inside Catch block");
			}
		
			
			
		
		
		return null;
	}
	

}
