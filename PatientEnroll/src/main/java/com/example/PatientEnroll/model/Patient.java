package com.example.PatientEnroll.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Patient {
	
	    @Id
		int patientId; 
		String firstName; 
		String lastName; 
		LocalDate DOB ; 
		String email; 
		long contactNumber; 
		String state; 
		String  insurancePlan;
		public int getPatientId() {
			return patientId;
		}
		public void setPatientId(int patientId) {
			this.patientId = patientId;
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
		public LocalDate getDOB() {
			return DOB;
		}
		public void setDOB(LocalDate dOB) {
			DOB = dOB;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public long getContactNumber() {
			return contactNumber;
		}
		public void setContactNo(long contactNo) {
			this.contactNumber = contactNo;
		}
		public String getState() {
			return state;
		}
		public void setState(String state) {
			this.state = state;
		}
		public String getInsurancePlan() {
			return insurancePlan;
		}
		public void setInsurancePlan(String insurancePlan) {
			this.insurancePlan = insurancePlan;
		}
		public Patient(int patientId, String firstName, String lastName, LocalDate dOB, String email, long contactNumber,
				String state, String insurancePlan) {
			super();
			this.patientId = patientId;
			this.firstName = firstName;
			this.lastName = lastName;
			DOB = dOB;
			this.email = email;
			this.contactNumber = contactNumber;
			this.state = state;
			this.insurancePlan = insurancePlan;
		}
		public Patient() {
			super();
			// TODO Auto-generated constructor stub
		} 
		


}
