package com.klednatee.thymeleaf.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klednatee.thymeleaf.entity.Patient;
import com.klednatee.thymeleaf.repository.PatientRepository;

@Service
public class PatientServiceImpl implements PatientService{
	
	private PatientRepository patientRepository;
	
	@Autowired
	public PatientServiceImpl(PatientRepository thePatientRepository) {
		patientRepository = thePatientRepository;
	}
	
	@Override
	public List<Patient> findAll(){
		return patientRepository.findAllByOrderByFirstNameAsc();
	}
	
	@Override
    public Patient findById(int theId) {
		Optional<Patient> result = patientRepository.findById(theId);
		Patient thePatient = null;
		
		if(result.isPresent()) {
			thePatient = result.get();
		}else {
			throw new RuntimeException("Did not found Patient id-" + theId);
		}
		return thePatient;
	}
	@Override
	public void save(Patient thePatient) {
		patientRepository.save(thePatient);
	}
	
	@Override
	public void deleteById(int theId) {
		patientRepository.deleteById(theId);
	}
	
}