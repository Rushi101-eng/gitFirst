package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Dbregister
 */
@WebServlet("/Dbregister")
public class Dbregister extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String x = request.getParameter("t1");
		String stname =request.getParameter("t2");
		
		//converting stid from string type to integer type
		int stid = Integer.parseInt(x);
		try {
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
	    Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "system", "orac12");
	    PreparedStatement ps = con.prepareStatement("insert into student values(?,?)");
	    ps.setInt(1, stid);
	    ps.setString(2, stname);
	    
	    int result = ps.executeUpdate();
		
		
		
		PrintWriter pw = response.getWriter();
		
		if(result>0)
		{
		pw.println("<h1> Registration successfully done</h1>");
//		pw.println("<a href='index.html'>click </a>");
		}
		pw.close();
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}


}
