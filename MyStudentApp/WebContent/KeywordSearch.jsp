<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Keyword Search</title>
</head>
<body>
<fieldset>
<legend>Keyword Search</legend>
<form action="./keywordreader" method="get">
<table>
<tr><td>Keyword </td><td><input type = "text" name="keyword" placeholder = "Enter your keyword "></td></tr>
<tr>
	<td>Google</td><td><input type = "radio" name="google" value="google"></td>
	<td>Bing</td><td><input type = "radio" name="bing" value="bing"></td>
</tr>
<tr><td>Yahoo</td><td><input type = "radio" name="yahoo" value="yahoo"></td>
	<td>Baidu</td><td><input type = "radio" name="baidu" value="baidu"></td></tr>
</table>
<input type="reset" value="Reset">
&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
<input type="submit" value="Login">
</form>
</fieldset>
</body>
</html>