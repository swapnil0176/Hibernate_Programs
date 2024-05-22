package com.OneTOMany.Utilities;

import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.cfg.Environment;

import com.OneTOMany.Entities.Admin;
import com.OneTOMany.Entities.Supplier;

public class HibernateConfiguration {

	public static SessionFactory sf;
	public static SessionFactory getSessionFactory() {
		
		//Create Properties class object for configuration
		Properties setting=new Properties();
		
		setting.put(Environment.DRIVER, "com.mysql.cj.jdbc.Driver"); // Setup the driver
		setting.put(Environment.URL, "jdbc:mysql://localhost:3306/hibernate"); // Setup the URL
		setting.put(Environment.USER, "root"); // Setup a username
		setting.put(Environment.PASS, "Swapnil@123"); // Setup a password of mysql
		setting.put(Environment.DIALECT, "org.hibernate.dialect.MySQL8Dialect");// It is bridge between sql types
																				// and jdbc types
		setting.put(Environment.FORMAT_SQL, "true");
		setting.put(Environment.SHOW_SQL, "true"); // It shows sql query on terminal
		setting.put(Environment.HBM2DDL_AUTO, "update");
		setting.put(Environment.CURRENT_SESSION_CONTEXT_CLASS, "thread");
		Configuration cfg = new Configuration();		
		cfg.setProperties(setting);
		
		//Mapp the classes
		cfg.addAnnotatedClass(Admin.class);
		cfg.addAnnotatedClass(Supplier.class);
		StandardServiceRegistry ssr= new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
		sf=cfg.buildSessionFactory();
		
		return sf;
	}
}
