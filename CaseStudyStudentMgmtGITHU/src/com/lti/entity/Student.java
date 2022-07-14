package com.lti.entity;

import java.time.LocalDate;

public class Student {
private int stuId;
private String stuname;
private LocalDate dob;
public Student(int stuId, String stuname, LocalDate dob) {
	super();
	this.stuId = stuId;
	this.stuname = stuname;
	this.dob = dob;
}

public Student() {
super();
}

public int getStuId() {
	return stuId;
}

public void setStuId(int stuId) {
	this.stuId = stuId;
}

public String getStuname() {
	return stuname;
}

public void setStuname(String stuname) {
	this.stuname = stuname;
}

public LocalDate getDob() {
	return dob;
}

public void setDob(LocalDate dob) {
	this.dob = dob;
}

@Override
public String toString() {
	return "Student [stuname=" + stuname + ", dob=" + dob + "]";
}


}
