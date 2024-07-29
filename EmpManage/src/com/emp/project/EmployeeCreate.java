package com.emp.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class EmployeeCreate {

	public void create(){
		
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","orac12");
			
			PreparedStatement ps = con.prepareStatement("insert into employee values(?,?,?)");
			
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter Employee id: ");
			int empId = sc.nextInt();
			
			System.out.println("Enter Employee Name : ");
			String empName = sc.next();
			
			System.out.println("Enter Employee Salary: ");
			int empSalary = sc.nextInt();
			
			ps.setInt(1, empId);
			ps.setString(2, empName);
			ps.setInt(3, empSalary);
			
			
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
