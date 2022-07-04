<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>logout</title>

<style>
#error{
  color:#FF0000;
  text-align:center;
  
}
</style>
</head>
<body>
<h2 id="error">${invalidate }

<html>

        <%

            session.invalidate();

        %>

        <h1><font color="Red">You are Sucessfully logged out...</font></h1>

       <br>
 <a href="../login.jsp">click here</a> to login
  <a href="login.jsp">click here</a> to login
</h2>



</body>
</html>