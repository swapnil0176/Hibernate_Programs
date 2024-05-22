package com.OneTOMany.OneTOManyMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.OneTOMany.DAO.SupplierDAO;
import com.OneTOMany.Entities.Admin;
import com.OneTOMany.Entities.Supplier;

public class App {

	private void addDetails() {

		Scanner sc = new Scanner(System.in);

		// Create Admin Entity class object
		Admin ad = new Admin();

		// Accept admin details
		System.out.println("Enter admin username");
		ad.setUserName(sc.next());
		System.out.println("Enter admin  password");
		ad.setPassword(sc.next());

		// Create supplier entity class object
		Supplier sup = new Supplier();
		Supplier sup1 = new Supplier();
		Supplier sup2 = new Supplier();

		// Create Arraylist
		List<Supplier> ll = new ArrayList<Supplier>();

		System.out.println("Enter supplier name");
		sup.setsName(sc.next());
		System.out.println("Enter supplier email");
		sup.setsEmail(sc.next());
		System.out.println("Enter supplier address");
		sup.setAddress(sc.next());

		ll.add(sup);

		System.out.println("Enter supplier name");
		sup1.setsName(sc.next());
		System.out.println("Enter supplier email");
		sup1.setsEmail(sc.next());
		System.out.println("Enter supplier address");
		sup1.setAddress(sc.next());

		ll.add(sup1);

		// Set supplier data into database
		ad.setSup(ll);

		// Create DAO layer class object
		SupplierDAO dao = new SupplierDAO();
		dao.saveToDB(ad);
		dao.displayInfo();
	}
	

	public static void main(String[] args) {
		App a=new App();
		a.addDetails();
	
	}


	

}
