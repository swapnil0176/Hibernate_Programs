package com.ScoreCard.Entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Score_Card")
public class Score {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="Score_Id")
	private int scoreId;
	
	@Column(name="Practical_Marks")
	private int pMarks;
	
	@Column(name="Theory_Marks")
	private int tMarks;

	@Override
	public String toString() {
		return "Score [scoreId=" + scoreId + ", pMarks=" + pMarks + ", tMarks=" + tMarks + "]";
	}

	public int getScoreId() {
		return scoreId;
	}

	public void setScoreId(int scoreId) {
		this.scoreId = scoreId;
	}

	public int getpMarks() {
		return pMarks;
	}

	public void setpMarks(int pMarks) {
		this.pMarks = pMarks;
	}

	public int gettMarks() {
		return tMarks;
	}

	public void settMarks(int tMarks) {
		this.tMarks = tMarks;
	}
	
	
}
