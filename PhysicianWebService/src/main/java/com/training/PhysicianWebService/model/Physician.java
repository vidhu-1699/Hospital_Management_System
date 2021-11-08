package com.training.PhysicianWebService.model;



import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Physician {
	@Id
	int physicianId;
	String firstName;
	String lastName;
	String department;
	String educationalQualification;
	int yearsOfexperience;
	String state;
	String insurancePlan;
	public Physician() {
		super();
	}
	public Physician(int physicianId, String firstName, String lastName, String department,
			String educationalQualification, int yearsOfexperience, String state, String insurancePlan) {
		super();
		this.physicianId = physicianId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.department = department;
		this.educationalQualification = educationalQualification;
		this.yearsOfexperience = yearsOfexperience;
		this.state = state;
		this.insurancePlan = insurancePlan;
	}
	public int getPhysicianId() {
		return physicianId;
	}
	public void setPhysicianId(int physicianId) {
		this.physicianId = physicianId;
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
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getEducationalQualification() {
		return educationalQualification;
	}
	public void setEducationalQualification(String educationalQualification) {
		this.educationalQualification = educationalQualification;
	}
	public int getYearsOfexperience() {
		return yearsOfexperience;
	}
	public void setYearsOfexperience(int yearsOfexperience) {
		this.yearsOfexperience = yearsOfexperience;
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
	

}
