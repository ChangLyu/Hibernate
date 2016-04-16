package com.hibernate;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="STUDENT")
public class Student {
	
	@Id //@GeneratedValue(strategy=GenerationType.AUTO)
	private int rollNo;
	
	//@transient :ignore this field
	@Column(name="FULL_NAME",nullable=false)
	private String name;
	
//@Temporal(TemporalType.DATE)// add this then hh-mm-ss will be deleted
//	private Date birthDate;
	//public Date getBirthDate() {
	//	return birthDate;
	//}
//	public void setBirthDate(Date date) {
	//	this.birthDate = date;
	//}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

}
