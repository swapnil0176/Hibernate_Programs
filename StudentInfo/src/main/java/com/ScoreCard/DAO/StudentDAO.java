package com.ScoreCard.DAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.ScoreCard.Entities.Student;
import com.ScoreCard.Utilities.HibernateCofiguration;

public class StudentDAO {
	
	public void saveToDB(Student student) {
		Transaction tx = null;
		try(Session session=HibernateCofiguration.getSessionFactory().openSession()){
			tx=session.beginTransaction();
			session.save(student);
			System.out.println(student);
			tx.commit();
			System.out.println("Data save successfully");
		}catch (Exception e) {
			if(tx!=null) {
				System.out.println("Transaction is rollback");
				tx.rollback();
			}
			e.printStackTrace();
			
		}
		
	}

}
