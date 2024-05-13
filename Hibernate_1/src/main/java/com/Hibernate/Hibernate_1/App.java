package com.Hibernate.Hibernate_1;

import org.hibernate.cfg.Configuration;
import org.hibernate.*;
import org.hibernate.SessionFactory;

//This class is generally use to store the object
public class App {

	public static void main(String[] args) {

		// Session factory object is created and configuration is done
		SessionFactory factory = new Configuration().configure("com/Hibernate/Hibernate_1/hibernate.cfg.xml")
				.buildSessionFactory();
		Session session = factory.openSession();
		session.beginTransaction();
		// Entity class object is created
		StudentPersistent st = new StudentPersistent();

		// First name value is set by using setter
		st.setFirstName("Aditya");
		// Last name value is set by using setter
		st.setLastName("Ganjave");
		// Object of entity class is save
		session.save(st);

		// getting current transaction
		Transaction tx = session.getTransaction();

		// save information to the data base
		tx.commit();

		// print the values
		System.out.println(st);

		session.close();
		factory.close();
	}
}
