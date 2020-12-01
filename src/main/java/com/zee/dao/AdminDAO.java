package com.zee.dao;

import java.util.List;

import com.zee.domain.Appointment;
import com.zee.domain.Doctor;
import com.zee.domain.Patient;

public interface AdminDAO {
	// SAVE
	public void savePatient(Patient patient);

	public void saveDoctor(Doctor doctor);

	public void saveAppointment(Appointment appointment);

	// UPDATE
	public void updatePatient(Patient patient);

	public void updateDoctor(Doctor doctor);

	public void updateAppointment(Appointment appointment);

	// DELETE
	public void deletePatient(int pid);

	public void deleteDoctor(int did);

	public void deleteAppointment(int aid);

	// GET
	public Patient getPatientById(int pid);

	public Doctor getDoctorById(int did);

	public Appointment getAppointById(int aid);

	// GET ALL
	public List<Patient> getAllPatient();

	public List<Integer> getAllPatientb();

	public List<Doctor> getAllDoctors();

	public List<Appointment> getAllAppoinment();

	// GET UNIQUE
	public List<Patient> getAllPatient(String name);

	public List<Doctor> getAllDoctor(String name);

	public List<Appointment> getAllAppointment(String date);
}
