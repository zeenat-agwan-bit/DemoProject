package com.zee.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.zee.domain.Appointment;
import com.zee.domain.Doctor;
import com.zee.domain.Patient;

@Repository
public class AdminDAOImpl implements AdminDAO {
	@Autowired
	private SessionFactory sessionFactory;

	public void savePatient(Patient patient) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(patient);
		tr.commit();
		session.close();

	}

	public void saveDoctor(Doctor doctor) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(doctor);
		tr.commit();
		session.close();

	}

	public void saveAppointment(Appointment appointment) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.save(appointment);
		tr.commit();
		session.close();
	}

	public void updatePatient(Patient patient) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(patient);
		tr.commit();
		session.close();

	}

	public void updateDoctor(Doctor doctor) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(doctor);
		tr.commit();
		session.close();

	}

	public void updateAppointment(Appointment appointment) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		session.update(appointment);
		tr.commit();
		session.close();

	}

	public void deletePatient(int pid) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();

		Patient patient = session.get(Patient.class, pid);
		session.delete(patient);
		tr.commit();
		session.close();

	}

	public void deleteDoctor(int did) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();

		Doctor doctor = session.get(Doctor.class, did);
		session.delete(doctor);
		tr.commit();
		session.close();
	}

	public void deleteAppointment(int aid) {
		Session session = sessionFactory.openSession();
		Transaction tr = session.beginTransaction();
		Appointment appointment = session.get(Appointment.class, aid);
		session.delete(appointment);
		tr.commit();
		session.close();
	}

	public Patient getPatientById(int pid) {
		Session session = sessionFactory.openSession();
		Patient patient = session.get(Patient.class, pid);
		session.close();
		return patient;
	}

	public Doctor getDoctorById(int did) {
		Session session = sessionFactory.openSession();
		Doctor doctor = session.get(Doctor.class, did);
		session.close();
		return doctor;
	}

	public Appointment getAppointById(int aid) {
		Session session = sessionFactory.openSession();
		Appointment appointment = session.get(Appointment.class, aid);
		session.close();
		return appointment;
	}

	public List<Patient> getAllPatient() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Patient");
		List<Patient> patients = query.list();
		session.close();
		return patients;
	}

	public List<Doctor> getAllDoctors() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Doctor");
		List<Doctor> doctors = query.list();
		session.close();
		return doctors;
	}

	public List<Appointment> getAllAppoinment() {
		Session session = sessionFactory.openSession();
		Query query = session.createQuery("from Appointment");
		List<Appointment> appointments = query.list();
		session.close();
		return appointments;

	}

	public List<Patient> getAllPatient(String name) {

		return null;
	}

	public List<Doctor> getAllDoctor(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Appointment> getAllAppointment(String date) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Integer> getAllPatientb() {
		Session session = sessionFactory.openSession();
		Criteria criteria = session.createCriteria(Patient.class);
		List<Patient> plist = criteria.list();
		List<Integer> ids = new ArrayList<Integer>();
		for (Patient p : plist) {
			ids.add(p.getPid());
		}
		return ids;

	}

}
