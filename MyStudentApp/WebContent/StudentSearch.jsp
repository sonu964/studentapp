<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Student Search</title>
</head>
<body>
<fieldset  >
	<legend>Student Search</legend>
<form action="./studentsearchreader" method="get">

	
	<table>
		<tr> RegNo<input type="number" name="regno" value="1" > </tr>
	</table>
	
	<input type="reset" value="Reset" >
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit" value="Search" /> 
</form>
</fieldset>
</body>
</html>