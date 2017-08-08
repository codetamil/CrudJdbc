package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.model.Employee;
import com.util.ConnectionUtil;

public class EmployeeDao {
	
	//ConnectionUtil connect=null;
	Connection con=ConnectionUtil.getConnectToMysql();
	
	PreparedStatement psmt;
	public void addEmployee(Employee employee) throws SQLException
	{
		String sql="insert into emp(id,firstName,lastName)values(?,?,?)";
		psmt= con.prepareStatement(sql);
		
		psmt.setInt(1, employee.getId());
		
		psmt.setString(2, employee.getFirstName());
		
		psmt.setString(3, employee.getLastName());
		
		psmt.execute();
		
		System.out.println("Succesfully inserted");
		
		
	}
	
	public ResultSet findAll() throws SQLException
	{
		String 	sql="select * from emp";
		
		 psmt= con.prepareStatement(sql);
		 
		 ResultSet rs=psmt.executeQuery();
		 
		 while(rs.next())
		 {
			// Employee ee=rs.next();
			 
			 int id =rs.getInt(1);
			 String firstName=rs.getString(2);
			 String lastName=rs.getString(3);
			 
			 System.out.println(id+" "+firstName+"  "+lastName);
		 }
		
		
		return rs;
		
	}
	public void update()throws SQLException
	{
	String sql="update emp set  lastName=? where id=?";
			psmt= con.prepareStatement(sql);
			
			psmt.setString(1,"BPO");
			psmt.setInt(2, 100);
		psmt.executeUpdate();
		System.out.println("update succesfull");
	}

	public void delete()throws SQLException
	{
	String sql="delete from emp where id=?";
			psmt= con.prepareStatement(sql);
			psmt.setInt(1,100);
		psmt.execute();
		System.out.println("delete succesfull");
	}
	
	

}
