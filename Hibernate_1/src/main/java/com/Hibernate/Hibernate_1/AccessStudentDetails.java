package com.Hibernate.Hibernate_1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class AccessStudentDetails {

	public static void main(String[] args) {

		// Create Session object
		Configuration cfg = new Configuration();
		cfg.configure("com/Hibernate/Hibernate_1/hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();

		// session.get(Entity name,id) is use to access the information from the
		// database
		StudentPersistent st = (StudentPersistent) session.get(StudentPersistent.class, 2);// If data is not found then
																							// it return null;
		// Print the data that store in StudentPersistent object
		// getter method is use to print the data
		System.out.println(st.getId() + " " + st.getFirstName() + " " + st.getLastName());

		// session.load(Entity name,id) is use to access the information from the
		// database

		st = (StudentPersistent) session.load(StudentPersistent.class, 3);// If data is not found then it throws
																			// exception i.e ObjectNotFoundException
		// Print the data that store in StudentPersistent object
		// getter method is use to print the data
		System.out.println(st.getId() + " " + st.getFirstName() + " " + st.getLastName());

		// closing object
		session.close();
		factory.close();
	}

}
