<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Profile</title>
</head>
<body>

	<form action="">
	
		<table>
			
			<tr>
			
				<td>
				
					<fieldset>
						<legend><b>Profile Related Info</b></legend>
						<table>
					
							<tr>
								<td>RegNo</td> 
								<td><input type="number" name="regno" placeholder="Enter registration number" required="required" ></td>
							</tr>
							<tr>
								<td>Password</td> 
								<td><input type="password" name="password" placeholder="Enter password" required="required" ></td>
							</tr>
							<tr>
								<td>Admin ?</td>
								<td>
									<select name="admin">
										<option value="" >--select--</option>
										<option value="Y" >Yes</option>
										<option value="N">No</option>
									</select>
								</td>
							</tr>
							<tr>
								<td>Email</td> 
								<td><input type="email" name="email" placeholder="Enter Email-id " required="required" ></td>
							</tr>
							<tr>
								<td>Date of Birth</td> 
								<td><input type="date" name="dob" required="required" ></td>
							</tr>
					
						</table>
					</fieldset>
					
				</td>
				<td>
					<fieldset>
						<legend><b>Course Related Info</b></legend>
						<table>
					
							<tr>
								<td>
									<table>
										<tr>
											<td>Core Java</td>
											<td><input type="checkbox" name="course" value="1" ></td>
										</tr>
										<tr>
											<td>J2EE</td>
											<td><input type="checkbox" name="course" value="2" ></td>
										</tr>
										<tr>
											<td>SQL</td>
											<td><input type="checkbox" name="course" value="3" ></td>
										</tr>
										<tr>
											<td>HTML</td>
											<td><input type="checkbox" name="course" value="4" ></td>
										</tr>
										<tr>
											<td>Hibernate</td>
											<td><input type="checkbox" name="course" value="5" ></td>
										</tr>
										
									</table>
								</td>
								<td>
									<table>
										<tr>
											<td>Springs</td>
											<td><input type="checkbox" name="course" value="6" ></td>
										</tr>
										<tr>
											<td>Angular JS</td>
											<td><input type="checkbox" name="course" value="7" ></td>
										</tr>
										<tr>
											<td>Web Services</td>
											<td><input type="checkbox" name="course" value="8" ></td>
										</tr>
										<tr>
											<td>General Aptitude</td>
											<td><input type="checkbox" name="course" value="9" ></td>
										</tr>
										<tr>
											<td>Android</td>
											<td><input type="checkbox" name="course" value="10" ></td>
										</tr>
										
									</table>
									
								</td>
							</tr>
					
						</table>
					</fieldset>
				</td>
			
			</tr>
			<tr>
				<td>
				
					<fieldset>
						<legend><b>Student Basic Info</b></legend>
						<table>
					
							<tr>
								<td>First Name</td>
								<td><input type="text" name="fnm" placeholder="Enter first name" required="required" /></td>
							</tr>
							<tr>
								<td>Middle Name</td>
								<td><input type="text" name="mnm" placeholder="Enter middle name"  /></td>
							</tr>
							<tr>
								<td>Last Name</td>
								<td><input type="text" name="lnm" placeholder="Enter last name" required="required" /></td>
							</tr>
							<tr>
								<td>Primary Mobile Number</td>
								<td><input type="text"  pattern="[7-9]{1}[0-9]{9}" name="phone" placeholder="Enter mobile number" required="required" /></td>
							</tr>
					
						</table>
					</fieldset>
					
				</td>
				<td>
					<fieldset>
						<legend><b>Guardian Info</b></legend>
						<table>
					
							<tr>
								<td>Guardian First Name</td>
								<td><input type="text" name="gfnm" placeholder="Enter first name" required="required" /></td>
							</tr>
							<tr>
								<td>Guardian Middle Name</td>
								<td><input type="text" name="gmnm" placeholder="Enter middle name"  /></td>
							</tr>
							<tr>
								<td>Guardian Last Name</td>
								<td><input type="text" name="glnm" placeholder="Enter last name" required="required" /></td>
							</tr>
							<tr>
								<td>Guardian Mobile Number</td>
								<td><input type="text"  pattern="[7-9]{1}[0-9]{9}" name="gphone" placeholder="Enter mobile number" required="required" /></td>
							</tr>
					
						</table>
					</fieldset>
				</td>
			
			</tr>
			<tr>
				<td>
				
					<fieldset>
						<legend><b>Student Present Address</b></legend>
						<table>
					
							<tr>
								<td>Address 1</td>
								<td><input type="text" name="pre.addr1" placeholder="Enter address 1" required="required"></td>
							</tr>
							<tr>
								<td>Address 2</td>
								<td><input type="text" name="pre.addr2" placeholder="Enter address 2" ></td>
							</tr>
							<tr>
								<td>Land Mark</td>
								<td><input type="text" name="pre.landmark" placeholder="Enter land mark" required=""></td>
							</tr>
							<tr>
								<td>City</td>
								<td><input type="text" name="pre.city" placeholder="Enter city" required="required"></td>
							</tr>
							<tr>
								<td>Pincode</td>
								<td><input type="number" name="pre.pincode" placeholder="Enter address 1" required="required"></td>
							</tr>
							
					
						</table>
					</fieldset>
					
				</td>
				<td>
					<fieldset>
						<legend><b>Student Permanent Address</b></legend>
						<table>
					
							<tr>
								<td>Address 1</td>
								<td><input type="text" name="per.addr1" placeholder="Enter address 1" required="required"></td>
							</tr>
							<tr>
								<td>Address 2</td>
								<td><input type="text" name="per.addr2" placeholder="Enter address 2" ></td>
							</tr>
							<tr>
								<td>Land Mark</td>
								<td><input type="text" name="per.landmark" placeholder="Enter land mark" required=""></td>
							</tr>
							<tr>
								<td>City</td>
								<td><input type="text" name="per.city" placeholder="Enter city" required="required"></td>
							</tr>
							<tr>
								<td>Pincode</td>
								<td><input type="number" name="per.pincode" placeholder="Enter pincode" required="required"></td>
							</tr>
							
					
					
						</table>
					</fieldset>
				</td>
			
			</tr>
			
		</table>
		
		<input type="reset" value="Reset" />
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
		<input type="submit" value="Create Profile" /> 
	</form>

</body>
</html>