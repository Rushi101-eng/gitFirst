<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int a = 100;
String s = "Rahul";
out.print("Number : " + a);
out.print("<br/>");
out.print("Name : " + s);
%>
<hr/>
<%= "The number is: " + a %>
<br/>
<%= "The name is " + s %>
<hr/>

<jsp:forward page="display.jsp">
        <jsp:param name="a" value=100/>
        <jsp:param name="s" value ="Rahul" />
    </jsp:forward>

</body>
</html>