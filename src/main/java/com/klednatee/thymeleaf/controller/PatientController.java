package com.klednatee.thymeleaf.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.klednatee.thymeleaf.entity.Patient;
import com.klednatee.thymeleaf.service.PatientService;

@Controller
@RequestMapping("/patients")
public class PatientController {
	
	private PatientService patientService;
	
	public PatientController(PatientService thePatientService) {
		patientService = thePatientService;
	}
	
	@GetMapping("/list")
	public String ListPatient(Model theModel) {
		List<Patient> thePatient = patientService.findAll();
		theModel.addAttribute("patients", thePatient);
		return "patients/list-patients";
	}

	/*
	 * @RequestMapping("/patientInfo") public String patientInfo(@RequestParam("id")
	 * int id, Model model) {
	 * 
	 * Patient patient = patientService.findById(id); model.addAttribute("patient",
	 * patient);
	 * 
	 * return "patients/patientInfo"; }//end patientInfo.
	 */
	
	@GetMapping("/showformforadd")
	public String ShowFormForAdd(Model theModel ) {
		Patient thePatient = new Patient();
		theModel.addAttribute("patient", thePatient);
		return "patients/patient-form";
	}

	@GetMapping("/showformforupdate")
	public String ShowFormForUpdate(@RequestParam("patientId") int theId,Model theModel ) {
		Patient thePatient = patientService.findById(theId);
		theModel.addAttribute("patient", thePatient);
		return "patients/patient-form";
	}
	
	@PostMapping("/save")
	public String SavePatient(@ModelAttribute("patient") Patient thePatient ) {
		patientService.save(thePatient);
		return "redirect:/patients/list";
	}

	@GetMapping("/delete")
	public String DeletePatient(@RequestParam("patientId") int theId) {
		patientService.deleteById(theId);
		return "redirect:/patients/list";
	}
	
}
