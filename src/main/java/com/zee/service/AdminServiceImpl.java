package com.zee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zee.dao.AdminDAO;
import com.zee.domain.Appointment;
import com.zee.domain.Doctor;
import com.zee.domain.Patient;

@Service
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDAO dao;

//SAVE
	public void addPatient(Patient patient) {
		dao.savePatient(patient);
	}

	public void addDoctor(Doctor doctor) {
		dao.saveDoctor(doctor);
	}

	public void addAppointment(Appointment appointment) {
		dao.saveAppointment(appointment);
	}

//UPDATE
	public void editPatient(Patient patient) {
		dao.updatePatient(patient);

	}

	public void editDoctor(Doctor doctor) {
		dao.updateDoctor(doctor);

	}

	public void editAppointment(Appointment appointment) {
		dao.updateAppointment(appointment);
	}

//DELETE
	public void removePatient(int pid) {
		dao.deletePatient(pid);
	}

	public void removeDoctor(int did) {
		dao.deleteDoctor(did);
	}

	public void removeAppointment(int aid) {
		dao.deleteAppointment(aid);
	}

//GET BY ID
	public Patient findPatientById(int pid) {
		return dao.getPatientById(pid);
	}

	public Doctor findDoctorById(int did) {

		return dao.getDoctorById(did);
	}

	public Appointment findAppointById(int aid) {
		return dao.getAppointById(aid);
	}

//GET ALL
	public List<Patient> findAllPatient() {

		return dao.getAllPatient();
	}

	public List<Doctor> findAllDoctors() {
		return dao.getAllDoctors();
	}

	public List<Appointment> findAllAppoinment() {
		return dao.getAllAppoinment();
	}

	public List<Patient> findAllPatient(String name) {
		return dao.getAllPatient(name);
	}

//GET UNIQUE
	public List<Doctor> getAllDoctor(String name) {
		return dao.getAllDoctor(name);
	}

	public List<Appointment> getAllAppointment(String date) {
		return dao.getAllAppointment(date);
	}

	public List<Integer> getAllPatientB() {
		
		return dao.getAllPatientb();
	}

}
