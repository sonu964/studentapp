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
public class StudentEducationInfoReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public StudentEducationInfoReader() {
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
			
			
			String  query = "select * from student_educationinfo";
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(query);
			
			sb.append("<html><head></head>");
			sb.append("<body>");
			sb.append("<table>");
			sb.append("<tr><td>RegNo:</td> ");
			sb.append("<td>Type</td>");
			sb.append("<td>College</td>");
			sb.append("<td>University</td></tr>");
			
			
			
			while(rs.next()){
				
				sb.append("<tr><td>"+rs.getInt("regno")+"</td> ");
				sb.append("<td>"+rs.getInt("type")+"</td> ");
				sb.append("<td>"+rs.getString("college")+"</td> ");
				sb.append("<td>"+rs.getString("university")+"</td></tr> ");	
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
