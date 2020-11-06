package com.mmit.course.controller;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mmit.course.models.Counter;



/**
 * Servlet implementation class CountController
 */
@WebServlet("/countUp")
public class CountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String COUNTER="counter";
    public CountController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//session scope
				HttpSession session=request.getSession(true);
				Counter countersession=(Counter)session.getAttribute(COUNTER);
				if(countersession==null)
					countersession=new Counter();
				countersession.increaseCount();
				session.setAttribute(COUNTER,countersession);
				
				//request scope
				Counter counterrequest=(Counter) request.getAttribute(COUNTER);
				if(counterrequest==null)
					counterrequest=new Counter();
				counterrequest.increaseCount();
				request.setAttribute(COUNTER,counterrequest);
				
				//application scope
				ServletContext application=request.getServletContext();
				Counter counterapp=(Counter) application.getAttribute(COUNTER);
				if(counterapp==null)
					counterapp=new Counter();
				counterapp.increaseCount();
				application.setAttribute(COUNTER,counterapp);
				
				getServletContext().getRequestDispatcher("/el-scope.jsp").forward(request, response);

	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
