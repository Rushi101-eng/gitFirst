<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
int a = Integer.parseInt(request.getParameter("t1"));
int b = Integer.parseInt(request.getParameter("t2")); 

int c = a + b;

out.print("sum is : " + c);

%> <br/>

<%= "the sum is : " + c%>

<%! 
int empid = 10;
String empName = "Arjun";

public int square(int y){
	return y*y;
}

%>

<%="the employee id is: " + empid %> <br/>
<%="the employee name is : " + empName %> <br/>
<%="the square is: " + square(4) %> <br/>
<%


out.println("today's date is: " + new Date());
%>

</body>
</html>