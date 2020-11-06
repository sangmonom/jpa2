package com.mmit.course.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mmit.course.models.Course;

/**
 * Servlet implementation class CourseController
 */
@WebServlet("/save-course")
public class CourseController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CourseController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name=request.getParameter("name");
		String level=request.getParameter("level");
		String fees=request.getParameter("fees");
		
		//create obj
		Course course=new Course();
		course.setName(name);
		course.setLevel(level);
		course.setFees(Integer.parseInt(fees));
		
		//get session obj
		//get session object
		HttpSession session = request.getSession(true);
		List<Course>list=(ArrayList<Course>)session.getAttribute("courses");
			if(list==null)
			{
				list=new ArrayList<Course>();
			}
			list.add(course);
			//add obj course to session
			session.setAttribute("courses", list);
			response.sendRedirect(request.getContextPath().concat("/course-list.jsp"));
	}

}
