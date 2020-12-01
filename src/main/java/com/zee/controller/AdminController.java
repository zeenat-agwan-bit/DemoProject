package com.zee.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.zee.domain.Appointment;
import com.zee.domain.Doctor;
import com.zee.domain.Patient;
import com.zee.service.AdminServiceImpl;

@Controller
public class AdminController {
	@Autowired
	private AdminServiceImpl adminService;

//==================ADD=========================
	@RequestMapping("/patientform")
	public ModelAndView showPatientForm() {
		ModelAndView mv = new ModelAndView("patientform");
		mv.addObject("patient", new Patient());

		return mv;
	}

	@RequestMapping("/savepatient")
	public ModelAndView patientFormHandler(@ModelAttribute("patient") Patient patient) {
		ModelAndView mv = new ModelAndView("patientsaved");
		System.out.println(patient);
		adminService.addPatient(patient);
		return mv;
	}

//---------------------------------------
	@RequestMapping("/doctorform")
	public ModelAndView showDoctorForm() {
		ModelAndView mv = new ModelAndView("doctorform");
		mv.addObject("doctor", new Doctor());
		return mv;
	}

	@RequestMapping(path = "/savedoctor", method = RequestMethod.POST)
	public String doctorFormHandler(@ModelAttribute("doctor") Doctor doctor, BindingResult result) {

		if (result.hasErrors()) {
			return "doctorform";
		}

		System.out.println(doctor);
		adminService.addDoctor(doctor);
		return "doctorsaved";
	}

//-------------------------------------
	@RequestMapping("/appointmentform")
	public ModelAndView showAppointmentForm() {
		ModelAndView mv = new ModelAndView("appointmentform");
		mv.addObject("appointment", new Appointment());
		List<Integer> ids = adminService.getAllPatientB();
		mv.addObject("ids", ids);

		return mv;
	}

	@RequestMapping("/saveappointment")
	public String appointmentFormHandler(@ModelAttribute("appointment") Appointment appointment, BindingResult result) {

		if (result.hasErrors()) {
			return "appointmentform";
		}
		System.out.println(appointment);

		adminService.addAppointment(appointment);

		return "appointmentsaved";
	}
	// ==================UPDATE=========================

	@RequestMapping("/updatepatientform")
	public ModelAndView showPatientUpdateForm(@RequestParam("id") int pid) {
		ModelAndView mv = new ModelAndView("patientupdateform");
		Patient patient = adminService.findPatientById(pid);
		mv.addObject("patient", patient);
		return mv;
	}

	@RequestMapping("/updatepatient")
	public ModelAndView updatePatient(@ModelAttribute("patient") Patient patient) {
		adminService.editPatient(patient);
		ModelAndView mv = new ModelAndView("redirect:patientlist");
		return mv;
	}

	// -------------------------------------
	@RequestMapping("/updatedoctorform")
	public ModelAndView showDoctorUpdateForm(@RequestParam("id") int did) {
		ModelAndView mv = new ModelAndView("doctorupdateform");
		Doctor doctor = adminService.findDoctorById(did);
		mv.addObject("doctor", doctor);
		return mv;
	}

	@RequestMapping("/updatedoctor")
	public ModelAndView updateDoctor(@ModelAttribute("doctor") Doctor doctor) {
		adminService.editDoctor(doctor);
		ModelAndView mv = new ModelAndView("redirect:doctorlist");
		return mv;
	}

	// -------------------------------------
	@RequestMapping("/updateappointmentform")
	public ModelAndView showAppointUpdateForm(@RequestParam("id") int aid) {
		ModelAndView mv = new ModelAndView("appointupdateform");
		Appointment appointment = adminService.findAppointById(aid);
		mv.addObject("doctor", appointment);
		return mv;
	}

	@RequestMapping("/updateappointment")
	public ModelAndView updateAppointment(@ModelAttribute("appointment") Appointment appointment) {
		adminService.editAppointment(appointment);
		ModelAndView mv = new ModelAndView("redirect:appointmentlist");
		return mv;
	}

	// ==================DELETE=========================
	@RequestMapping("/deletepatient")
	public ModelAndView deletePatient(@RequestParam("id") int pid) {
		adminService.removePatient(pid);
		ModelAndView mv = new ModelAndView("redirect:patientlist");
		return mv;
	}

	// ---------------------------------------
	@RequestMapping("/deletedoctor")
	public ModelAndView deleteDoctor(@RequestParam("id") int did) {
		adminService.removeDoctor(did);
		ModelAndView mv = new ModelAndView("redirect:doctorlist");
		return mv;
	}

//-----------------------------------------
	@RequestMapping("/deleteappointment")
	public ModelAndView deleteAppointment(@RequestParam("id") int aid) {
		adminService.removeAppointment(aid);
		ModelAndView mv = new ModelAndView("redirect:appointmentlist");
		return mv;
	}

	// ==================GET ALL=========================
	@RequestMapping("/patientlist")
	public ModelAndView showAllPatients() {
		List<Patient> patients = adminService.findAllPatient();
		ModelAndView mv = new ModelAndView("patientlist");
		mv.addObject("plist", patients);

		return mv;
	}

	// --------------------------------------
	@RequestMapping("/doctorlist")
	public ModelAndView showAllDoctors() {
		List<Doctor> doctors = adminService.findAllDoctors();
		ModelAndView mv = new ModelAndView("doctorlist");
		mv.addObject("dlist", doctors);

		return mv;
	}

	// --------------------------------------
	@RequestMapping("/appointmentlist")
	public ModelAndView showAllAppointments() {
		List<Appointment> appointments = adminService.findAllAppoinment();
		ModelAndView mv = new ModelAndView("appointmentlist");
		mv.addObject("alist", appointments);
		return mv;
	}

	// ==================GET BY ID=========================
	@RequestMapping("/searchbypatid")
	public ModelAndView showSearchButtonPatient(@RequestParam("patbox") int query) {
		ModelAndView mv = new ModelAndView("searchbypatid");
		Patient patient = adminService.findPatientById(query);
		mv.addObject("patient", patient); // request-scope
		return mv;
	}

	// -----------------------------------------
	@RequestMapping("/searchbydocid")
	public ModelAndView showSearchButtonDoctor(@RequestParam("docbox") int query) {
		ModelAndView mv = new ModelAndView("searchbydocid");
		Doctor doctor = adminService.findDoctorById(query);
		mv.addObject("doctor", doctor); // request-scope
		return mv;
	}

	// -----------------------------------------
	@RequestMapping("/searchbyappid")
	public ModelAndView showSearchButtonAppointment(@RequestParam("appbox") int query) {
		ModelAndView mv = new ModelAndView("searchbyappid");
		Appointment appointment = adminService.findAppointById(query);
		mv.addObject("appointment", appointment); // request-scope
		return mv;
	}
	// ==================BACK AND HOME BUTTON=========================

	@RequestMapping("/plisthome")
	public String plistHomeP() {
		return "redirect:patientlist";
	}

	@RequestMapping("/adminhomep")
	public String adminHomeP() {
		return "adminpage";
	}

	// ------------------------------
	@RequestMapping("/dlisthome")
	public String dlistHomeD() {
		return "redirect:doctorlist";
	}

	@RequestMapping("/adminhomed")
	public String adminHomeD() {
		return "adminpage";
	}

	// --------------------------
	@RequestMapping("/alisthome")
	public String alistHomeA() {
		return "redirect:appointmentlist";
	}

	@RequestMapping("/adminhomea")
	public String adminHomeA() {
		return "adminpage";
	}

	@RequestMapping("/adminpage")
	public String adminPage() {
		return "adminpage";
	}

}
