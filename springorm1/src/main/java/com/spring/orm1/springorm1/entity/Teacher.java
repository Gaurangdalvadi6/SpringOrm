package com.spring.orm1.springorm1.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "teacher_details")
public class Teacher {
	@Id
	@Column(name = "teacher_id")
	private int teacherid;
	@Column(name = "teacher_name")
	private String teacherName;
	@Column(name = "teacher_city")
	private String teacherCity;
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	public String getTeacherName() {
		return teacherName;
	}
	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
	public String getTeacherCity() {
		return teacherCity;
	}
	public void setTeacherCity(String teacherCity) {
		this.teacherCity = teacherCity;
	}
	public Teacher(int teacherid, String teacherName, String teacherCity) {
		super();
		this.teacherid = teacherid;
		this.teacherName = teacherName;
		this.teacherCity = teacherCity;
	}
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Teacher [teacherid=" + teacherid + ", teacherName=" + teacherName + ", teacherCity=" + teacherCity
				+ "]";
	}
	
	
}
