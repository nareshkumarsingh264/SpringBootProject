package com.naresh.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_student")
public class Student {
	

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private long studentId;
private String studentName;
private String studentCourse;

public long getStudentId() {
	return studentId;
}
public void setStudentId(long studentId) {
	this.studentId = studentId;
}
public String getStudentName() {
	return studentName;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentCourse() {
	return studentCourse;
}
public void setStudentCourse(String studentCourse) {
	this.studentCourse = studentCourse;
}
@Override
public String toString() {
	return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCourse=" + studentCourse
			+ "]";
}
}
