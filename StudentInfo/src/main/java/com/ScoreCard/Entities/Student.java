package com.ScoreCard.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="Student_id")
	private int sId;
	
	@Column(name="First_name")
	private String fName;
	
	@Column(name="Last_name")
	private String lName;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="Score_card")
	private Score score;

	@Override
	public String toString() {
		return "Student [sId=" + sId + ", fName=" + fName + ", lName=" + lName + ", score=" + score + "]";
	}

	public int getsId() {
		return sId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public Score getScore() {
		return score;
	}

	public void setScore(Score score) {
		this.score = score;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
