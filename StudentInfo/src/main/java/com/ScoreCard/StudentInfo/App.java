package com.ScoreCard.StudentInfo;

import java.util.Scanner;

import com.ScoreCard.DAO.StudentDAO;
import com.ScoreCard.Entities.Score;
import com.ScoreCard.Entities.Student;

/**
 * Hello world!
 *
 */
public class App {
	
	public void acceptDetails() {
		
		// Create Scanner Class Object for accept inputs from user
		Scanner sc= new Scanner(System.in);
		
		//Create Entity class object
		
		Student student = new Student();
		//Here we Use Setter methods for set the values of students;
		
		System.out.println("Enter Student First name");
		student.setfName(sc.next());
		System.out.println("Enter Student Last name");
		student.setlName(sc.next());
		System.out.println("Enter Student Marks Details");
		
		//Create Entity class object
		Score score= new Score();
		
		//Here we Use Setter methods for set the values of students;
		
//		System.out.println("Enter score id ");
//		score.setScoreId(sc.nextInt());
		System.out.println("Enter Practical Marks out of 100");
		score.setpMarks(sc.nextInt());
		System.out.println("Enter Theory Marks out of 100");
		score.settMarks(sc.nextInt());
		
		student.setScore(score);
		
		//Creating object of DAO Layer for save the data in database
		StudentDAO dao= new StudentDAO();
		dao.saveToDB(student);
	}
    public static void main( String[] args )
    {
        App a= new App();
        a.acceptDetails();
    }

	
}
;