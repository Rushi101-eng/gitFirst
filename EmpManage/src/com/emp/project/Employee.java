package com.emp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Employee {

	public void display() {
	 
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			
			Connection con = DriverManager.
					getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orac12");

			
			Statement st = con.createStatement();
				
			ResultSet rs = st.executeQuery("select * from employee");
			
			while(rs.next())
			{
				System.out.println(rs.getInt(1) + " " + rs.getString(2) +" "+ rs.getInt(3));
			}
			
			con.close();
		}
         catch(Exception e)
		{
        	 System.out.println(e);
		}
	}

}
