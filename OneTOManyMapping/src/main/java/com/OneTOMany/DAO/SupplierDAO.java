package com.OneTOMany.DAO;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.OneTOMany.Entities.Admin;
import com.OneTOMany.Entities.Supplier;
import com.OneTOMany.Utilities.HibernateConfiguration;

public class SupplierDAO {

	public void saveToDB(Admin ad) {
		Transaction tx = null;
		try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
			// Begin Transaction
			tx = session.beginTransaction();
			session.save(ad);
			System.out.println("Data save to DB");
			tx.commit();
		} catch (Exception e) {
			if (tx != null) {
				System.out.println("Error occur transaction rollback");
				tx.rollback();
			}
			e.printStackTrace();
		}
	}

	public void displayInfo() {
		try (Session session = HibernateConfiguration.getSessionFactory().openSession()) {
			Scanner sc = new Scanner(System.in);
			// Accept username
			System.out.println("Enter admin username");
			
			Admin ad = session.get(Admin.class, sc.next());
			//If admin object contains any values then if block executes
			
			if (ad != null) {
				System.out.println(">>> Admin Info <<<\n-------------");
				System.out.println("Admin Username: -" + ad.getUserName());
				System.out.println("------------");
				System.out.println("\n\nSupplier Info");
				for (Supplier sup : ad.getSup()) {
					System.out.println("Supplier Id " + sup.getSupplierId());
					System.out.println("Supplier Name " + sup.getsName());
					System.out.println("Supplier email id " + sup.getsEmail());
					System.out.println("Supplier address " + sup.getAddress());
				}
			}
			else {//If object contains null values then this block execute
				System.out.println("Admin info not found");
			}
		}

	}

}
