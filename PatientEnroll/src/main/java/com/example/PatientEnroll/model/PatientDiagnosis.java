package com.example.PatientEnroll.model;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;



@Entity
public class PatientDiagnosis {
	
	
	
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = 
	"Patient_seq")
	@GenericGenerator(
	    name = "Patient_seq", 
	    strategy = 
	"com.example.PatientEnroll.model.StringPrefixedSequenceGenerator", 
	    parameters = {
	        @Parameter(name = StringPrefixedSequenceGenerator.INCREMENT_PARAM, value = "1"),
	        @Parameter(name = StringPrefixedSequenceGenerator.VALUE_PREFIX_PARAMETER, value = "DId"),
	        @Parameter(name = StringPrefixedSequenceGenerator.NUMBER_FORMAT_PARAMETER, value = "%03d") })
	@Id
	String diagnosisId;
	String patientName;
	String symptoms;
	String diagnosisProvided; 
	String administered;
    LocalDate dateOfDiagnosis;
	int followUp;
	LocalDate followUpDate;
	long billAmount; 
	String modeOfPayment;
	long cardNumber;
	int patientId;
	
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getPatientName() {
		return patientName;
	}
	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}
	public String getDiagnosisId() {
		return diagnosisId;
	}
	public void setDiagnosisId(String diagnosisId) {
		this.diagnosisId = diagnosisId;
	}
	public String getSymptoms() {
		return symptoms;
	}
	public void setSymptoms(String symptoms) {
		this.symptoms = symptoms;
	}
	public String getDiagnosisProvided() {
		return diagnosisProvided;
	}
	public void setDiagnosisProvided(String diagnosisProvided) {
		this.diagnosisProvided = diagnosisProvided;
	}
	public String getAdministered() {
		return administered;
	}
	public void setAdministered(String administered) {
		this.administered = administered;
	}
	public LocalDate getDateOfDiagnosis() {
		return dateOfDiagnosis;
	}
	public void setDateOfDiagnosis(LocalDate dateOfDiagnosis) {
		this.dateOfDiagnosis = dateOfDiagnosis;
	}
	public int isFollowUp() {
		return followUp;
	}
	public void setFollowUp(int followUp) {
		this.followUp = followUp;
	}
	public LocalDate getFollowUpDate() {
		return followUpDate;
	}
	public void setFollowUpDate(LocalDate followUpDate) {
		this.followUpDate = followUpDate;
	}
	public long getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(long billAmount) {
		this.billAmount = billAmount;
	}
	public String getModeOfPayment() {
		return modeOfPayment;
	}
	public void setModeOfPayment(String modeOfPayment) {
		this.modeOfPayment = modeOfPayment;
	}
	public long getCardNumber() {
		return cardNumber;
	}
	public void setCardNumber(long cardNumber) {
		this.cardNumber = cardNumber;
	}
	public PatientDiagnosis() {
		super();
		// TODO Auto-generated constructor stub
	}
	public PatientDiagnosis(String patientName, String diagnosisId, String symptoms, String diagnosisProvided,
			String administered, LocalDate dateOfDiagnosis, int followUp, LocalDate followUpDate, long billAmount,
			String modeOfPayment, long cardNumber, int patientId) {
		super();
		this.patientName = patientName;
		this.diagnosisId = diagnosisId;
		this.symptoms = symptoms;
		this.diagnosisProvided = diagnosisProvided;
		this.administered = administered;
		this.dateOfDiagnosis = dateOfDiagnosis;
		this.followUp = followUp;
		this.followUpDate = followUpDate;
		this.billAmount = billAmount;
		this.modeOfPayment = modeOfPayment;
		this.cardNumber = cardNumber;
		this.patientId = patientId;
	}
	
	
	


}
