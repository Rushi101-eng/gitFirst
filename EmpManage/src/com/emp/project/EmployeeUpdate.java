package com.emp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeUpdate {

	public static void update() {
		
try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			 Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orac12");
		
			 
			 PreparedStatement ps = con.prepareStatement("update employee set name = ? where id = ?");
			 
			 Scanner sc = new Scanner(System.in);
				
				System.out.println("Ent employee name : ");
				String empName = sc.nextLine();
				
				System.out.println("Enter employee id to change Name : ");
				int empId = sc.nextInt();
				
				ps.setString(1, empName);
				ps.setInt(2, empId);
				
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
