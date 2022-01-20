package com.pms.dbcon;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConn {
	
	public static Connection getConnection() throws ClassNotFoundException,SQLException
	{
        Class.forName("com.mysql.cj.jdbc.Driver");//"com.mysql.jdbc.Driver"
		
		//2 creating connection
		
		Connection con=
		DriverManager.getConnection("jdbc:mysql://localhost:3307/cbs1", "root", "root");
		
		return con;
	}

}
