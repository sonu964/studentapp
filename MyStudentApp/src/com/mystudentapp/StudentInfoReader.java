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

/**
 * Servlet implementation class EducationTypeReader
 */
public class StudentInfoReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentInfoReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		StringBuffer sb = new StringBuffer("");
		
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			
			String url = "jdbc:mysql://localhost:3307/studentsapp_db?user=j2ee&password=j2ee";
			con = DriverManager.getConnection(url);
			
			
			String  query = "select * from student_info";
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
			sb.append("<html><head></head>");
			sb.append("<body>");
			sb.append("<table>");
			sb.append("<tr><td>FirstName</td>");
			sb.append("<td>MiddleName</td>");
			sb.append("<td>LastName</td>");
			sb.append("<td>Eamil</td>");
			sb.append("<td>Mobile</td>");
			sb.append("<td>Birth_day</td>");
			sb.append("<td>Birth_month</td></tr>");
			
			while(rs.next()){
				
				sb.append("<td>"+rs.getString("firstname")+"</td> ");
				sb.append("<td>"+rs.getString("middlename")+"</td> ");
				sb.append("<td>"+rs.getString("lastname")+"</td> ");
				sb.append("<td>"+rs.getString("email")+"</td> ");
				sb.append("<td>"+rs.getLong("mobile")+"</td> ");
				sb.append("<td>"+rs.getInt("birth_day")+"</td> ");
				sb.append("<td>"+rs.getString("birth_month")+"</td></tr> ");
				
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
