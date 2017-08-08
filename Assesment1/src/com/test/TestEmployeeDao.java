package com.test;

import java.sql.SQLException;

import com.dao.EmployeeDao;
import com.model.Employee;

public class TestEmployeeDao {

	/**
	 * @param args
	 * @throws SQLException 
	 */
	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Employee employee = new Employee();
		
		employee.setId(100);
		
		employee.setFirstName("XXX");
		
		employee.setLastName("YYY");
		
		EmployeeDao emp = new EmployeeDao();
		
		//emp.addEmployee(employee);
		
		emp.findAll();
		emp.update();
		emp.delete();

	}

}
