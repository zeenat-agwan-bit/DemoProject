package com.zee.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Appointment {
	@Id
	@SequenceGenerator(name = "acode_generator", sequenceName = "acode_gen", allocationSize = 1, initialValue = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acode_generator")
	private int aid;
	private String time;
	private String date;
	private String diagnosis;
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	@JoinTable(name = "patient_appointment", joinColumns = { @JoinColumn(name = "app_aid") }, inverseJoinColumns = {
			@JoinColumn(name = "patient_pid") })
	private Patient patient;

	public Appointment(int aid, String time, String date, String diagnosis, Patient patient) {
		super();
		this.aid = aid;
		this.time = time;
		this.date = date;
		this.diagnosis = diagnosis;
		this.patient = patient;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int aid, String time, String date, String diagnosis) {
		super();
		this.aid = aid;
		this.time = time;
		this.date = date;
		this.diagnosis = diagnosis;
	}

	public int getAid() {
		return aid;
	}

	public void setAid(int aid) {
		this.aid = aid;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public void setDiagnosis(String diagnosis) {
		this.diagnosis = diagnosis;

	}

	@Override
	public String toString() {
		return "Appointment [aid=" + aid + ", time=" + time + ", date=" + date + ", diagnosis=" + diagnosis
				+ ", patient=" + patient + "]";
	}

}
