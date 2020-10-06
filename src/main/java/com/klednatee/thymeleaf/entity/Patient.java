package com.klednatee.thymeleaf.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="patient")
public class Patient {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="date_of_birth")
	private String dateOfBirth;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="description")
	private String description;
	
	@Column(name="age")
	private int age;

	@Column(name="weight")
	private double weight;
	
	@Column(name="disease_type")
	private String diseaseType;
	
	@Column(name="doctor_name")
	private String doctorName;

	@Column(name="active")
	private boolean active = true;
	
	@Column(name="patientimage")
	private String patientImage;
	
	public Patient() {}

	public Patient(int id, String firstName, String lastName, String dateOfBirth, String gender, String description,int age, double weight,
			String diseaseType, String doctorName, String patientImage,boolean active) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.description = description;
		this.age = age;
		this.weight = weight;
		this.diseaseType = diseaseType;
		this.doctorName = doctorName;
		this.patientImage = patientImage;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getDiseaseType() {
		return diseaseType;
	}

	public void setDiseaseType(String diseaseType) {
		this.diseaseType = diseaseType;
	}

	public String getDoctorName() {
		return doctorName;
	}

	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	
	public String getPatientImage() {
		return patientImage;
	}

	public void setPatientImage(String patientImage) {
		this.patientImage = patientImage;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	@Override
	public String toString() {
		return "Patient [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", dateOfBirth="
				+ dateOfBirth + ", gender=" + gender + ", description =" + description + ", age=" + age + ", weight=" + weight + ", diseaseType="
				+ diseaseType + ", doctorName=" + doctorName + ", patientImage=" + patientImage + ", active=" + active + "]";
	}

}
