package com.zee.service;

import java.util.List;

import com.zee.domain.Appointment;
import com.zee.domain.Doctor;
import com.zee.domain.Patient;

public interface AdminService {

	// SAVE
	public void addPatient(Patient patient);

	public void addDoctor(Doctor doctor);

	public void addAppointment(Appointment appointment);

	// UPDATE
	public void editPatient(Patient patient);

	public void editDoctor(Doctor doctor);

	public void editAppointment(Appointment appointment);

	// DELETE
	public void removePatient(int pid);

	public void removeDoctor(int did);

	public void removeAppointment(int aid);

	// GET
	public Patient findPatientById(int pid);

	public Doctor findDoctorById(int did);

	public Appointment findAppointById(int aid);

	// GET ALL
	public List<Patient> findAllPatient();

	public List<Integer> getAllPatientB();

	public List<Doctor> findAllDoctors();

	public List<Appointment> findAllAppoinment();

	// GET UNIQUE
	public List<Patient> findAllPatient(String name);

	public List<Doctor> getAllDoctor(String name);

	public List<Appointment> getAllAppointment(String date);
}
