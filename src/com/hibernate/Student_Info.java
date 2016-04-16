package com.hibernate;

import java.util.Date;
import java.util.function.Predicate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

@Entity
@Table(name="STUDENT_INFORMSTION")
public class Student_Info {
	
	@Id @GeneratedValue(strategy=GenerationType.AUTO)
	//the follow let the id just created once 
	@GenericGenerator(name="newGenerator",strategy="foreign",parameters={@Parameter(value="student",name="property")})
	private int rollNo;
	//@transient :ignore this field
	
	private String  student_mobile_number;

	

	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="rollNo")
	private Student student;
	
	public String getStudent_mobile_number() {
		return student_mobile_number;
	}
	public void setStudent_mobile_number(String student_mobile_number) {
		this.student_mobile_number = student_mobile_number;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
