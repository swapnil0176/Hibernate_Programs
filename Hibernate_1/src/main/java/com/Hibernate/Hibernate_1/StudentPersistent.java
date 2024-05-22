package com.Hibernate.Hibernate_1;

import javax.persistence.GeneratedValue;
import javax.persistence.Entity;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.*;

//This is persistent class or entity class
@Entity
@Table(name = "studentinfo") // Assign the table name in database
public class StudentPersistent {

	@Id // @id use for assign primary key
	@GeneratedValue(strategy = GenerationType.AUTO) // This is use for generate sequential value
	@Column(name = "sid") // @Column is use for assign column name
	private int id;

	@Column(name = "firstname") // @Column is use for assign column name
	private String firstName;

	@Column(name = "lasttname") // @Column is use for assign column name
	private String lastName;

	public int getId() {
		return id;
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return "StudentPersistent [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public StudentPersistent(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public StudentPersistent() {
	}

}
