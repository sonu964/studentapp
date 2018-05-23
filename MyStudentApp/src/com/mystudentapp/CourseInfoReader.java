package com.mystudentapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class CourseInfoReader extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
		
		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer("");
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			
			String url = "jdbc:mysql://localhost:3307/studentsapp_db?user=j2ee&password=j2ee";
			con = DriverManager.getConnection(url);
			
			String query = "select * from course_info";
			
			stmt = con.createStatement();
			rs = stmt.executeQuery(query);
			
			
			sb.append("<html>");
			sb.append("<head>");
			sb.append("<body>");
			sb.append("<table>");
			sb.append("<tr>");
			sb.append("<td>course_id</td>");
			sb.append("<td>course_name</td>");
			sb.append("<td>fee</td>");
			sb.append("<td>duration</td>");
			sb.append("<td>faculty</td>");
			sb.append("</tr>");
			
			
			
			while(rs.next()){
				
				int course_idVal = rs.getInt("course_id");
				String course_nameVal = rs.getString("course_name");
				int feeVal = rs.getInt("fee");
				int durationVal = rs.getInt("duration");
				String facultyVal = rs.getString("faculty");
				
				sb.append("<tr>");
				sb.append("<td>"+course_idVal+"</td>");
				sb.append("<td>"+course_nameVal+"</td>");
				sb.append("<td>"+feeVal+"</td>");
				sb.append("<td>"+durationVal+"</td>");
				sb.append("<td>"+facultyVal+"</td>");
				sb.append("</tr>");
				
				
			}
			sb.append("</table>");
			sb.append("</body>");
			sb.append("</html>");
			
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			out.print(sb.toString());
			
			
			
		} catch (Exception e) {
			
			e.printStackTrace();
		}finally{
			try{
			if(con != null){
				con.close();
			}
			if(stmt != null){
				stmt.close();
			}
			if(rs != null){
				rs.close();
			}
			}catch(SQLException e){
			e.printStackTrace();
		}
		}
		
	}

}
 