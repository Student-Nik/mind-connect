package com.zoommeeting.mindconnectzoommeeting.entitites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

@Entity
@Table(name="quiz1")
public class Quiz1 {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name="name")
	private String patientName;
	
	private String question1;
	private String question2;
	private String question3;
	private String question4;
	private String question5;
	private String question6;
	private String question7;
	private String mail;
	
	public Quiz1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Quiz1(long id, String patientName, String question1, String question2, String question3, String question4,
			String question5, String question6, String question7, String mail) {
		super();
		this.id = id;
		this.patientName = patientName;
		this.question1 = question1;
		this.question2 = question2;
		this.question3 = question3;
		this.question4 = question4;
		this.question5 = question5;
		this.question6 = question6;
		this.question7 = question7;
		this.mail = mail;
	}

	@Override
	public String toString() {
		return "Quiz1 [id=" + id + ", patientName=" + patientName + ", question1=" + question1 + ", question2="
				+ question2 + ", question3=" + question3 + ", question4=" + question4 + ", question5=" + question5
				+ ", question6=" + question6 + ", question7=" + question7 + ", mail=" + mail + "]";
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}

	public String getQuestion3() {
		return question3;
	}

	public void setQuestion3(String question3) {
		this.question3 = question3;
	}

	public String getQuestion4() {
		return question4;
	}

	public void setQuestion4(String question4) {
		this.question4 = question4;
	}

	public String getQuestion5() {
		return question5;
	}

	public void setQuestion5(String question5) {
		this.question5 = question5;
	}

	public String getQuestion6() {
		return question6;
	}

	public void setQuestion6(String question6) {
		this.question6 = question6;
	}

	public String getQuestion7() {
		return question7;
	}

	public void setQuestion7(String question7) {
		this.question7 = question7;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}
	
	
}
