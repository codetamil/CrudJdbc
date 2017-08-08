package com.test;

import java.sql.SQLException;

import com.util.ConnectionUtil;

public class TestConnectionUtil {

	/**
	 * @param args
	 * @throws SQLException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub

		
		ConnectionUtil co= new ConnectionUtil();
		
		co.getConnectToMysql();
	}

}
