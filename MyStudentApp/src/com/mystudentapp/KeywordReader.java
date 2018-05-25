package com.mystudentapp;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class KeywordReader
 */
public class KeywordReader extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public KeywordReader() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String keywordVal = request.getParameter("keyword");
		String googleVal = request.getParameter("google");
		String yahooVal = request.getParameter("yahoo");
		String bingVal = request.getParameter("bing");
		String baiduVal = request.getParameter("baidu");
		
		String googleSearch = "https://www.google.co.in/search?q="+keywordVal+"";
		String bingSearch = "https://www.bing.com/search?q="+keywordVal+"";
		String yahooSearch = "https://in.search.yahoo.com/search?p="+keywordVal+"";
		String baiduSearch	= "https://www.baidu.com/s?wd="+keywordVal+"";
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		if( googleVal !=null ){
			
			response.sendRedirect(googleSearch);
			
		}else if(yahooVal !=null ){
		
			response.sendRedirect(yahooSearch);
		}else if( bingVal !=null ){
		
			response.sendRedirect(bingSearch);
		}else if(baiduVal !=null ){
		
			response.sendRedirect(baiduSearch);
		}else{
			
			out.print("Select one of the search engine");
		}
		
		
	}

}
