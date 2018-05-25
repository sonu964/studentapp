package com.mystudentapp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ChangePassword
 */
public class ChangePasswordReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChangePasswordReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String regnoVal = request.getParameter("regno");
		String passwordVal	= request.getParameter("password");
		String npasswordVal	= request.getParameter("npassword");
		String cnpasswordVal	= request.getParameter("cnpassword");
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		Connection con = null;
		PreparedStatement pstmt = null;
		
		StringBuffer sb = new StringBuffer("");
		
		if(npasswordVal.equals(cnpasswordVal)){
			
			//Just git experiment try
			try {
				Class.forName("com.mysql.jdbc.Driver").newInstance();
				
				
				String url = "jdbc:mysql://localhost:3307/studentsapp_db?user=j2ee&password=j2ee";
				con = DriverManager.getConnection(url);
				
				//String  query = "select * from student_otherinfo where regno = "+regnoVal+" and password =  "+passwordVal+" ";
					
					String query = "update student_otherinfo "
							+ "set password = ? "
							+ "where regno = ? "
							+ "and password = ? ";
					pstmt = con.prepareStatement(query);
					
					pstmt.setString(1, npasswordVal);
					pstmt.setInt(2, Integer.parseInt(regnoVal));
					pstmt.setString(3, passwordVal);
					
					int count = pstmt.executeUpdate();
					
					if(count>0){
						
						sb.append("Password changed succesfully");
						
					}else{
					sb.append("New password and Confirm password are matched! Please try again! ");
				}	
				
					
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}finally{
				try{
				if(con != null){
					con.close();
				}
				if(pstmt != null){
					pstmt.close();
				}
				
				}catch(SQLException e){
				e.printStackTrace();
			}
			}

			
		}else{
			
			sb.append("New password and confirm password doesn't match!! Try again!");
		}
		out.print(sb.toString());
	}

}
