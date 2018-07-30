package com.deloitte.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;


import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class HTTPCounterservlet
 */
//@WebServlet("/hitcount")
public class HTTPCounterservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private int counter;
	private String name;

    /**
     * Default constructor. 
     */
    public HTTPCounterservlet() {
    	super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out= response.getWriter();
		String name=request.getParameter("name");
		
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		
		out.println("hi :"+name);
		
		out.println("you are user#"+(++counter)+"<br/");
		out.println("your ip address:"+request.getRemoteAddr()+"<br/");
		
		Enumeration<String> headerNames=request.getHeaderNames();
		String headerName=null;
		while(headerNames.hasMoreElements()) {
			headerName=headerNames.nextElement();
			out.println(headerName+":"+request.getHeader(headerName)+ "<br/>");
		}
		
		//initialization of context parameter
		ServletContext context= getServletContext();
		
		out.println(getServletConfig().getInitParameter("email")+"<br/>");
		out.println(context.getInitParameter("WebAdmin"));
		
		
		out.println("</body>");	
		out.println("</html>");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
