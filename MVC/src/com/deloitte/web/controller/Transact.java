package com.deloitte.web.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Transact
 */
@WebServlet(name = "TransactionServlet", urlPatterns = { "/Transact" })
public class Transact extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Transact() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action=request.getParameter("action");
		
		if(action!=null) {
			if(action.equals("inbox"){
				request.getRequestDispatcher("inbox1323ff.jsp").forward(request, response);
				
			}else if(action.equals("compose"){
				request.getRequestDispatcher("compose.123fdfs.jsp").forward(request, response);
				
			}else if(action.equals("sent"){
				request.getRequestDispatcher("sentghoj345.jsp").forward(request,response);
				
			}else if(action.equals("logout"){
				request.getRequestDispatcher("index.html").forward(request, response);
				
			}else
				request.getRequestDispatcher("index.html").forward(request, response);
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
