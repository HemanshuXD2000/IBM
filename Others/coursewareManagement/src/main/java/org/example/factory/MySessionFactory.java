package org.example.factory;

import org.example.entity.CourseEntity;
import org.example.entity.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MySessionFactory {

	private static SessionFactory sessionFactory = null;
	
	private static Session session;
	
	public static Session getSession() throws Exception 
	{
		sessionFactory = new Configuration().configure().addAnnotatedClass(CourseEntity.class).addAnnotatedClass(Student.class).buildSessionFactory();
		session = sessionFactory.openSession();
		return session;
	}
}
