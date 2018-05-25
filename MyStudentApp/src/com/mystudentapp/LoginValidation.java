package com.mystudentapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginValidation extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String regnoVal = request.getParameter("regno");
		String passwordVal = request.getParameter("password");
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null ;
		
		RequestDispatcher dispatcher = null;
		
		StringBuffer sb = new StringBuffer("");
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String dbUrl = "jdbc:mysql://localhost:3307/studentsapp_db?user=j2ee&password=j2ee";
			con = DriverManager.getConnection(dbUrl);
			
			String query = "select * from student_info si, "
					+ " guardian_info gi, "
					+ " student_otherinfo soi, "
					+ " student_courseinfo sci, "
					+ " student_addressinfo sai,"
					+ "student_educationinfo sei "
					
					+ " where si.regno = gi.regno and "
					+ " si.regno = soi.regno and "
					+ " si.regno = sci.regno and "
					+ " si.regno = sei.regno and "
					+ " si.regno = sai.regno  and "
					+ " soi.regno = ? and soi.password = ? ";
					
					
	
			System.out.println("Query : "+query);
	
			pstmt = con.prepareStatement(query);
			pstmt.setInt(1, Integer.parseInt(regnoVal));
			pstmt.setString(2, passwordVal);
			rs = pstmt.executeQuery();
			
			if(rs.next()){
				//Valid Credential
				String isAdmin = rs.getString("isadmin");
				
				/*dispatcher = request.getRequestDispatcher("header");
				dispatcher.include(request, response);
				*/
				if(isAdmin.equals("Y")){
					
					String url = "./studentinforeader";
					sb.append("<br>");
					sb.append("<br>");
					sb.append("<a href="+url+" >Click here</a>to view all student info");
					sb.append("<br>");
				}
				
				sb.append("<html>");
				sb.append("<head>");
				sb.append("</head>");
				sb.append("<body>");
				
				sb.append("<table >");
				
				sb.append("<tr>");
				sb.append("<td>RegNo</td>");
				sb.append("<td>FirstName</td>");
				sb.append("<td>MiddleName</td>");
				sb.append("<td>LastName</td>");
				sb.append("<td>Email</td>");
				sb.append("<td>Mobile</td>");
				sb.append("<td>Guardian FirstName</td>");
				sb.append("<td>Guardian MiddleName</td>");
				sb.append("<td>Guardian LastName</td>");
				sb.append("</tr>");
				
				sb.append("<tr>");
				sb.append("<td>"+rs.getInt("si.regno")+"</td>");
				sb.append("<td>"+rs.getString("si.firstname")+"</td>");
				sb.append("<td>"+rs.getString("si.middlename")+"</td>");
				sb.append("<td>"+rs.getString("si.lastname")+"</td>");
				sb.append("<td>"+rs.getString("si.email")+"</td>");
				sb.append("<td>"+rs.getBigDecimal("si.mobile")+"</td>");
				sb.append("<td>"+rs.getString("gi.glastname")+"</td>");
				sb.append("<td>"+rs.getString("gi.gmiddlename")+"</td>");
				sb.append("<td>"+rs.getString("gi.glastname")+"</td>");
				sb.append("</tr>");
				
				sb.append("</table>");
				sb.append("</body>");
				sb.append("</html>");
				
			}else{
				
				sb.append("Invalid Credintial.. Please check your regno and password");
			}
			
			out.print(sb.toString());
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			//5. Close All JDBC Objects
			try 
			{
				if(con!=null){
					con.close();
				}
				if(pstmt!=null){
					pstmt.close();
				}
				if(rs!=null){
					rs.close();
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}//End of outer try-catch block
		
		
	}

}
