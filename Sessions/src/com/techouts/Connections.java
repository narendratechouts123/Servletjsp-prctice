package com.techouts;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Connections {

	public Connection main() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 Class.forName("com.mysql.jdbc.Driver");  
		 Connection con=DriverManager.getConnection("jdbc:mysql://remotemysql.com:3306/hBReXCo0Ve","hBReXCo0Ve","B9eHkDCCYT");
		 System.out.println(con);
		 PreparedStatement ps=con.prepareStatement("select * from register limit 5");
		 ResultSet rs=ps.executeQuery();
 rs.next();
 System.out.println(rs.getString(2)+"  "+rs.getString(3));
return con;

	}

}
