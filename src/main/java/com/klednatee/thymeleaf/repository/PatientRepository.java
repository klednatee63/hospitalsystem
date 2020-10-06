package com.klednatee.thymeleaf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.klednatee.thymeleaf.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer>{
	
	// add a method to sort by last name
	public List<Patient> findAllByOrderByFirstNameAsc();
}