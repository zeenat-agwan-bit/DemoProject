package com.zee.domain;

import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Patient {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int pid;
	private String name;
	private String phone;
	private String city;
	@OneToMany(mappedBy = "patient" ,fetch=FetchType.EAGER,cascade = CascadeType.ALL ,orphanRemoval = true )
	
	private List<Appointment> appointments;


	public Patient(int pid, String name, String phone, String city, List<Appointment> appointments) {
		super();
		this.pid = pid;
		this.name = name;
		this.phone = phone;
		this.city = city;
		this.appointments = appointments;
	}

	public List<Appointment> getAppointments() {
		return appointments;
	}

	public void setAppointments(List<Appointment> appointments) {
		this.appointments = appointments;
	}

	public Patient() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Patient(int pid, String name, String phone, String city) {
		super();
		this.pid = pid;
		this.name = name;
		this.phone = phone;
		this.city = city;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Patient [pid=" + pid + ", name=" + name + ", phone=" + phone + ", city=" + city + ", appointments="
				+ appointments + "]";
	}

	
}
