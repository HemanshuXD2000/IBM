package org.example.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.example.entity.CourseEntity;
import org.example.entity.Student;
import org.example.factory.MySessionFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

public class RegisterController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}
	
	protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		int studentId = Integer.parseInt(request.getParameter("student_id"));
//		String studentName = request.getParameter("s_Name");
//		String courseName = request.getParameter("c_Name");
//		
//		try {
////			Session session = MySessionFactory.getSession();
////			session.getTransaction().begin();
//			Transaction transaction = null;
//			SessionFactory sessionFactory = (SessionFactory) MySessionFactory.getSession();
//			Session session = sessionFactory.openSession();
//			
//			transaction = session.beginTransaction();
//			
//			Student student = session.get(Student.class, studentId);
//			
//			String sql = "FROM course_table where name = : courseName";
//			Query<CourseEntity> query = session.createQuery(sql, CourseEntity.class);
//			query.setParameter("courseName", courseName);
//			CourseEntity course = query.uniqueResult();
//			
//			if(course != null)
//			{
//				student.getCourses().add(course);
//				session.save(student);
//				transaction.commit();
//				System.out.println("Student Created.........");
//			}
//			else {
//				System.out.println("ERROR..........course-not-found");
//			}
//					
//		}catch (Exception e) {
//			e.printStackTrace();
//            }
//			 response.sendRedirect("enrollment-error.html");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("s_Name");
		String course = request.getParameter("c_name");
		String[] courseNames = request.getParameterValues("courses");
		try
		{
			Session session = MySessionFactory.getSession();
			session.getTransaction().begin();
			
			Student student = new Student();
			student.setStudent_name(name);
			
			if(courseNames != null && courseNames.length > 0)
			{
				for(String courseName : courseNames)
				{
					CourseEntity courses = getCourseByName(session, courseName);
					if(course != null)
					{
						student.getCourses().add(courses);
						courses.getStudents().add(student);
					}
				}
			}
			session.save(student);
			session.getTransaction().commit();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		}

	private CourseEntity getCourseByName(Session session, String courseName) {
		String sql = "FROM course_table where name = :courseName";
		Query<CourseEntity> query = session.createQuery(sql,CourseEntity.class);
		query.setParameter("courseName", courseName);
		return query.uniqueResult();
	} 
	}

