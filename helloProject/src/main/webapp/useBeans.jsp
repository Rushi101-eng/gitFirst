<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  
    import="com.wipro.servlet.Players" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<jsp:useBean id="p" class="com.wipro.servlet.Players" />
<jsp:setProperty property="name" name="p" value="Virat"/>
<jsp:setProperty property ="runs" name="p" value="110" />
<p>Players name: <jsp:getProperty property ="name" name="p" /> </p>
<p>Players runs: <jsp:getProperty property = "runs" name="p" /> </p>

</body>
</html>