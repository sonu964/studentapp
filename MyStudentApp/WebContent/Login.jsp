<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login page</title>
</head>
<body>
<fieldset>
<legend>Login Page</legend>
<form action="./loginvalidation" method="post">
<table>
<tr><td>RegNo </td><td><input type = "number" name="regno" placeholder = "Enter registration number "></td></tr>
<tr><td>Password</td><td><input type = "password" name="password" placeholder = "Enter valid password"></td></tr>
</table>
<input type="reset" value="Reset">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Login">
</form>
</fieldset>
</body>
</html>