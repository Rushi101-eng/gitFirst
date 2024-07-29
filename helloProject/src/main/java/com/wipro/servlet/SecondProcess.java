package com.wipro.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SecondProcess
 */
@WebServlet("/SecondProcess")
public class SecondProcess extends HttpServlet {
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		  String fno = request.getParameter("t1");
		   String sno = request.getParameter("t2");
		   
		   int z = Integer.parseInt(fno) + Integer.parseInt(sno);
		   
		   PrintWriter pw = response.getWriter();
		   pw.println("<h1> The sum in second process is " + z + "</h1>");
		   
			pw.close();
	}

}
