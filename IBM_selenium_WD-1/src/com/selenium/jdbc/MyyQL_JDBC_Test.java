package com.selenium.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;


public class MyyQL_JDBC_Test {
		// TODO Auto-generated method stub
		public static void main(String[] args) throws Exception {
	        // step-1 - load the mysql jdbc driver like a browser driver
	        Class.forName("com.mysql.jdbc.Driver");
	        
	        // step-2 - create a databse connection
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/OrangeHRM", "root", "");
	        
	        // step-3 - create a statement object for sending queries
	        Statement stmt = con.createStatement();

	
	        // step-4 - execute a query
	        ResultSet rs = stmt.executeQuery("SELECT * FROM Login");
	        
	        // step-5 - process the result of query
	        while(rs.next()) {
	            String username = rs.getString("username");
	            System.out.println(username);
	            String password = rs.getString("password");
	            System.out.println(password);
	        }

	
	        // step-6 - closing the objects...
	        rs.close();
	        stmt.close();
	        con.close();
	    }

	
	}


