package com.edu;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbconnect {
	
	//Connection with database
			static String driver="com.mysql.cj.jdbc.Driver";
			static String url="jdbc:mysql://localhost:3306/webdb";
			static String un="root";
			static String pass="root";
			static Connection con;
			public static Connection getConnection() {
			
			try {
				Class.forName(driver);
				 con=DriverManager.getConnection(url,un,pass);
				if(con==null) {
					System.out.println("Connection is null");
				}
				
			}catch(Exception e) {
				e.printStackTrace();
			}
			return con;
			
}
}