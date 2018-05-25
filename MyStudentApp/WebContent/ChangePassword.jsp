<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<fieldset  >
	<legend>Change Password</legend>
<form action="./changepasswordreader" method="post">

	
	<table>
		<tr> RegNo<input type="number" name="regno" value="1" > </tr>
		<tr> Current Password<input type="password" name="password"  > </tr>
		<tr> New Password<input type="password" name="npassword"  > </tr>
		<tr> Confirm Password<input type="password" name="cnpassword"  > </tr>
	</table>
	
	<input type="reset" value="Reset" >
	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
	<input type="submit" value="Change Password" /> 
</form>
</fieldset>

</body>
</html>