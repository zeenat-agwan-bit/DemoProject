package com.zee.domain;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Student {
	@Id
	private Long id;
	private String name;
	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date date;
	private String time;
	private String course;
	private String gender;
	private String type;

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", date=" + date + ", time=" + time + ", course=" + course
				+ ", gender=" + gender + ", type=" + type + "]";
	}

	public Student(Long id, String name, Date date, String time, String course, String gender, String type) {
		super();
		this.id = id;
		this.name = name;
		this.date = date;
		this.time = time;
		this.course = course;
		this.gender = gender;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

}
