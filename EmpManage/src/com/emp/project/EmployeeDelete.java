package com.emp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeDelete {

	public static void delete() {
		
try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orac12");
		
			 
			 PreparedStatement ps = con.prepareStatement("delete from employee where id = ?");
			 
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter employee id to delete : ");
				int empId = sc.nextInt();
				
				ps.setInt(1, empId);
				
				int a = ps.executeUpdate();
				
				System.out.println(a + "rows inserted");
				
				con.close();
			 
			 
		}
		catch(Exception e)
		{
			System.out.println(e);
		}


	}

}
