package com.klednatee.thymeleaf.service;

import java.util.List;

import com.klednatee.thymeleaf.entity.Patient;

public interface PatientService {
	
	public List<Patient> findAll();
	
	public Patient findById(int theId);
	
	public void save(Patient thePatient);
	
	public void deleteById(int theId);
	 
}
